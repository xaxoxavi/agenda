package com.esliceu.agenda;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class AgendaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Agenda agenda = new Agenda();
        agenda.setAny(2019);

        Pagina pagina = new Pagina();
        pagina.setDia(20);
        pagina.setMes(3);
        pagina.setEsFestiu(false);

        agenda.setPagines(new ArrayList<Pagina>());
        agenda.getPagines().add(pagina);

        Cita cita = new Cita();
        cita.setHoraInici(11);
        cita.setHoraFi(12);
        cita.setMotiu("Examen final DWES");

        Cita cita1 = new Cita();
        cita1.setHoraInici(13);
        cita1.setHoraFi(14);
        cita1.setMotiu("Dinar amb companys!");

        pagina.setCites(new ArrayList<Cita>());
        pagina.getCites().add(cita);
        pagina.getCites().add(cita1);

        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Agenda</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Agenda: "+ agenda.getAny() +"</h1>");

            String color;
            if (agenda.getPagines().get(0).getEsFestiu()){
                color="red";
            } else {
                color="black";
            }
            out.println("<h2 style='color:"+ color + "'>Dia " + agenda.getPagines().get(0).getDia() + "/" + agenda.getPagines().get(0).getMes() + "</h2>");
            out.println("<ul>");

            for (Cita cita2 : pagina.getCites()){
               out.println("<li>" + cita2.getHoraInici() + "-" + cita2.getHoraFi() + ": " + cita2.getMotiu() +  "</li>");
            }
            out.println("</ul>");

            out.println("</body>");
            out.println("</html>");
        }

    }
}
