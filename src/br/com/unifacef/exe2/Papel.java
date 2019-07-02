
package br.com.unifacef.exe2;

public class Papel extends Mao {

    public Papel() {
    }
    
    @Override
    public String quemSouEu() {
        return "Papel";
    }
    
    public String compara(Mao mao) {
        switch (mao.quemSouEu()) {
            case "Pedra":
                return "Ganhou";
            case "Papel":
                return "Empatou";
            case "Tesoura":
                return "Perdeu";
        }
        return null;
    }
}
