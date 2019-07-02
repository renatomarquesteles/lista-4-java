
package br.com.unifacef.exe1;

import javax.swing.JOptionPane;

public class Testa {
    
    public static void mostra(Produto camaleao) {
        JOptionPane.showMessageDialog(null, camaleao.toString());
    }
    public static void main(String[] args) {
               
        Radio r1 = new Radio(96.5F, "Green Day", 10, 123456, 9.99F);
        
        TV tv1 = new TV(3, 10, 987654, 2000.99F);
        
        mostra(r1);
        mostra(tv1);
    }
    
}
