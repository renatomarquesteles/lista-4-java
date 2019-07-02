package br.com.unifacef.exe1;
public class TV extends Produto {
    private int canal;

    public TV() {
    }

    public TV(int canal, int volume, int serial, float preco) {
        super(volume, serial, preco);
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "TV{" + "canal=" + canal + super.toString() + '}';
    }
    
    
}
