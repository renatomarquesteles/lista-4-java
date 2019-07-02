
package br.com.unifacef.exe2;

public class Tesoura extends Mao {

    public Tesoura() {
    }
    
    public String quemSouEu() {
        return "Tesoura";
    }
    
    public String compara(Mao mao) {
        switch (mao.quemSouEu()) {
            case "Pedra":
                return "Perdeu";
            case "Papel":
                return "Ganhou";
            case "Tesoura":
                return "Empatou";
        }
        return null;
    }
}
