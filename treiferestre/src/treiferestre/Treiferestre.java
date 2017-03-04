/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treiferestre;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Ady
 */

class Fprin extends JFrame{
    public Fprin(String titlu){
        super(titlu);
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FereastraInterna fin1 = new FereastraInterna();
        fin1.setVisible(true);
        FereastraInterna fin2 = new FereastraInterna();
        fin2.setVisible(true);
        JDesktopPane desktop = new JDesktopPane();
        desktop.add(fin1);
        desktop.add(fin2);
        setContentPane(desktop);
        fin2.moveToFront();
    }
}

class FereastraInterna extends JInternalFrame{
    static int n=0;
    static final int x=30,y=30;
    public FereastraInterna(){
        super("Document #"+(++n),true,true,true,true);
        setLocation(x*n,y*n);
        setSize(new Dimension(200,100));
    }
}

public class Treiferestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Fprin("test").setVisible(true);
    }
    
}
