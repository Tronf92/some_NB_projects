/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smt;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Ady
*/

class prin extends Frame implements ActionListener{
    public prin(String titlu){
        super(titlu);
        this . addWindowListener (new WindowAdapter () {
            public void windowClosing ( WindowEvent e) {
                System . exit (0);
            }
        });
        setSize(1024,768);
        MenuBar mb=new MenuBar();
        Menu fisier=new Menu("file");
        fisier.add(new MenuItem("Exit"));
        fisier.addActionListener(this);
        mb.add(fisier);
        setMenuBar(mb);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command=e.getActionCommand();
        if(command.equals("Exit"))
            System.exit(0);
    }
    
}
public class Smt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        prin f= new prin("bka");
    }
    
}
