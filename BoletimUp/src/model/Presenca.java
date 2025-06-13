package model;

import java.util.Date;

public class Presenca {
    private int usuarioId;
    private Date data;
    private String status;

    public Presenca(int usuarioId, Date data, String status) {
        this.usuarioId = usuarioId;
        this.data = data;
        this.status = status;
    }

    
    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}