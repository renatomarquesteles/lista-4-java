package br.com.unifacef.exe0;

import java.util.Date;
import javax.swing.JOptionPane;

public class Testa {
    
    public static void mostra(Esporte camaleao) {
        JOptionPane.showMessageDialog(null, camaleao.toString());
    }
    
    public static void main(String[] args) {
        
        Futebol fut1 = new Futebol("de campo", "11 metros do gol",
                "chegou ao Brasil", "Inglaterra", new Date());
        
        Basquete bas1 = new Basquete("7 metros", "4.6 metros", "surgiu nos EUA",
            "EUA", new Date());
        
        Volei vol1 = new Volei("recepção e defesa", "bola em jogo",
                "criado em 1895", "EUA", new Date());
        
        mostra(fut1);
        mostra(bas1);
        mostra(vol1);
    }
}
