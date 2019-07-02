package br.com.unifacef.exe0;

import java.util.Date;

public class Futebol extends Esporte {
    private String mobilidade, penalti;

    public Futebol() {
    }

    public Futebol(String mobilidade, String penalti, String historia,
            String local, Date inicio) {
        super(historia, local, inicio);
        this.mobilidade = mobilidade;
        this.penalti = penalti;
    }

    public String getMobilidade() {
        return mobilidade;
    }

    public void setMobilidade(String mobilidade) {
        this.mobilidade = mobilidade;
    }

    public String getPenalti() {
        return penalti;
    }

    public void setPenalti(String penalti) {
        this.penalti = penalti;
    }

    @Override
    public String toString() {
        return "Futebol{" + "mobilidade=" + mobilidade + ", penalti=" + penalti 
                + super.toString() + '}';
    }
}
