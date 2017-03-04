/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swingapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Ady
 */
public class Swingapp extends JFrame implements ActionListener{
    public Swingapp(String titlu){
        super(titlu);
        getContentPane().setLayout(new FlowLayout ());
        getContentPane().add(new JLabel("<html><u>Hello </u> <i>Swing</i></html>"));
        JButton b= new JButton("Close");
        b.addActionListener(this);
        getContentPane().add(b);
        pack();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Swingapp("Hello");
    }
    
}
