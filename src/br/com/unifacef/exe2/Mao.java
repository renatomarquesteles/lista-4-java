package br.com.unifacef.exe2;
// classe abstrata, não pode ser instanciada
public abstract class Mao {

    public Mao() {
    }
    
    // métodos abstratos, só serão utilizados pelos filhos
    public abstract String quemSouEu();
    
    public abstract String compara(Mao mao);
        
}
