package br.com.unifacef.exe0;

import java.util.Date;

public class Basquete extends Esporte {
    private String linhaDosTres, lanceLivre;

    public Basquete() {
    }

    public Basquete(String linhaDosTres, String lanceLivre, String historia,
            String local, Date inicio) {
        super(historia, local, inicio); // Já existe na superclasse, reutilização de código
        this.linhaDosTres = linhaDosTres;
        this.lanceLivre = lanceLivre;
    }

    public String getLinhaDosTres() {
        return linhaDosTres;
    }

    public void setLinhaDosTres(String linhaDosTres) {
        this.linhaDosTres = linhaDosTres;
    }

    public String getLanceLivre() {
        return lanceLivre;
    }

    public void setLanceLivre(String lanceLivre) {
        this.lanceLivre = lanceLivre;
    }

    @Override
    public String toString() {
        return "Basquete{" + "linhaDosTres=" + linhaDosTres + ", lanceLivre=" +
                lanceLivre + super.toString() + '}';
    }
}
