/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1stapp;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Ady
 */

class Fereastra extends Frame implements WindowListener{
    public Fereastra(String titlu){
        super (titlu);
        this.addWindowListener(this);
    }
    public void windowOpened(WindowEvent e){}
    public void windowClosing(WindowEvent e){
        System . exit(0);
    }
    public void windowClosed(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fereastra f=new Fereastra("Test");
        f.setVisible(true);
    }
    
}
