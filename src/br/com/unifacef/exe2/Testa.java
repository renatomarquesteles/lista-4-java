package br.com.unifacef.exe2;

import javax.swing.JOptionPane;

public class Testa {

    public static void mostra(Mao usuario, Mao pc) {
        JOptionPane.showMessageDialog(null, usuario.quemSouEu() + 'x' + pc.quemSouEu());
        JOptionPane.showMessageDialog(null, usuario.compara(pc));
    }

    public static void main(String[] args) {
        Mao usuario = null;
        
        String opcaoUsuario = JOptionPane.showInputDialog("Escolha" + "\n1. Papel\n2. Pedra\n3. Tesoura");
        
        switch(opcaoUsuario) {
            case "1":
                usuario = new Papel();
                break;
            case "2":
                usuario = new Pedra();
                break;
            case "3":
                usuario = new Tesoura();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }

        Mao pc = null;
        
        int valor = (int) (Math.random() * 3);

        switch (valor) {
            case 0:
                pc = new Papel();
                break;
            case 1:
                pc = new Tesoura();
                break;
            case 2:
                pc = new Pedra();
                
        }
        mostra(usuario, pc);
    }
}
