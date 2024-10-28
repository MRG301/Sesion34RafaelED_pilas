/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion34rafaeled_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author mrg16
 */
public class Sesion34RafaelED_pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Decalracion de pila
        Stack<Integer> pilaRafael = new Stack<Integer>();

        pilaRafael.push(100);
        pilaRafael.push(150);
        pilaRafael.push(230);
        pilaRafael.push(10);
        pilaRafael.push(10);

        JOptionPane.showMessageDialog(null, "Datos de pila ordenada es:; \n" + pilaRafael);
        JOptionPane.showMessageDialog(null, "Autor: Mauricio Rafael Garcia");
    }

}
