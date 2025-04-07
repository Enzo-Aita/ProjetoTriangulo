/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;
import model.Triangulo;

public class Principal {
    public static void main(String[] args) {
        Triangulo tril = new Triangulo();
        
        tril.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triangulo")));
        
        tril.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a base do trinagulo")));
        
        JOptionPane.showMessageDialog(null,"A area do tringulo é" + tril.getArea());
        
    }
    
}
