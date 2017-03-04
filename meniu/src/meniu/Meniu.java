/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meniu;
import java.awt.*;
import java.awt.event.*;


public class Meniu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f=new Frame("Meniu");
        MenuBar mb=new MenuBar();
        Menu fisier=new Menu("File");
        fisier.add(new MenuItem("Open"));
        fisier.add(new MenuItem("Close"));
        fisier.addSeparator();
        fisier.add(new MenuItem("Exit"));
        Menu optiuni = new Menu("Options");
        optiuni.add(new MenuItem("Copy"));
        optiuni.add(new MenuItem("Cut"));
        optiuni.add(new MenuItem("Paste"));
        Menu editare = new Menu("Edit");
        editare.add(new MenuItem("Undo"));
        editare.add(optiuni);
        editare.addSeparator();
        editare.add(new CheckboxMenuItem("Bold"));
        editare.add(new CheckboxMenuItem("Italic"));
        mb.add(fisier);
        mb.add(editare);
        f.setMenuBar(mb);
        f.setSize(1024,768);
        f.setVisible(true);
    }
    
}
