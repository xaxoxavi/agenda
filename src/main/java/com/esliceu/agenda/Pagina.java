package com.esliceu.agenda;

import java.util.List;

public class Pagina {

    private Integer dia;
    private Integer mes;
    private Boolean esFestiu;

    private List<Cita> cites;

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Boolean getEsFestiu() {
        return esFestiu;
    }

    public void setEsFestiu(Boolean esFestiu) {
        this.esFestiu = esFestiu;
    }

    public List<Cita> getCites() {
        return cites;
    }

    public void setCites(List<Cita> cites) {
        this.cites = cites;
    }
}
