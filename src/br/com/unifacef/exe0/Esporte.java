package br.com.unifacef.exe0;

import java.util.Date;

// não pode ser instanciada - serve de modelo para as filhas
public abstract class Esporte {
    protected String historia, local;
    protected Date inicio;

    public Esporte() {
    }

    public Esporte(String historia, String local, Date inicio) {
        this.historia = historia;
        this.local = local;
        this.inicio = inicio;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    @Override
    public String toString() {
        return "Esporte{" + "historia=" + historia + ", local=" + local + ", inicio=" + inicio + '}';
    }
}
