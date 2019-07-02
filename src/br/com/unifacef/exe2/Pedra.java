
package br.com.unifacef.exe2;

public class Pedra extends Mao {

    public Pedra() {
    }
    
    public String quemSouEu() {
        return "Pedra";
    }
    
    public String compara(Mao mao) {
        switch (mao.quemSouEu()) {
            case "Pedra":
                return "Empatou";
            case "Papel":
                return "Perdeu";
            case "Tesoura":
                return "Ganhou";
        }
        return null;
    }
}
