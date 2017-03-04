/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1stgui;
import java.awt.*;
/**
 *
 * @author Ady
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame f=new Frame ("O fereastra");
        f.setLayout (new FlowLayout());
        Button b1=new Button ("Ok");
        Button b2 = new Button("Cancel");
        f.add(b1);
        f.add(b2);
        f.pack();
        f.setVisible(true);
    }
    
}
