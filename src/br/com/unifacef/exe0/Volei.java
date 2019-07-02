package br.com.unifacef.exe0;

import java.util.Date;

public class Volei extends Esporte {
    private String libero, saque;

    public Volei() {
    }

    public Volei(String libero, String saque, String historia, String local, Date inicio) {
        super(historia, local, inicio);
        this.libero = libero;
        this.saque = saque;
    }

    public String getLibero() {
        return libero;
    }

    public void setLibero(String libero) {
        this.libero = libero;
    }

    public String getSaque() {
        return saque;
    }

    public void setSaque(String saque) {
        this.saque = saque;
    }

    @Override
    public String toString() {
        return "Volei{" + "libero=" + libero + ", saque=" + saque +
                super.toString() + '}';
    }
}
