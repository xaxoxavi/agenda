package com.esliceu.agenda;

import java.util.List;

public class Agenda {

    private Integer any;
    private List<Pagina> pagines;

    public Integer getAny() {
        return any;
    }

    public void setAny(Integer any) {
        this.any = any;
    }

    public List<Pagina> getPagines() {
        return pagines;
    }

    public void setPagines(List<Pagina> pagines) {
        this.pagines = pagines;
    }
}
