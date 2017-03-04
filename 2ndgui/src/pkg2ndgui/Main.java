/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2ndgui;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Ady
 */

class Fereastra extends Frame{
    public Fereastra(String titlu){
        super(titlu);
        setSize(400,400);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    
        final Label label=new Label("",Label. CENTER);
        label. setBackground(Color. yellow);
        add(label,BorderLayout. NORTH);
        this.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                label.setText("Click...");
                Graphics g=Fereastra.this.getGraphics();
                g.setColor(Color.blue);
                int raza=(int)(Math.random()*50);
                g.fillOval(e.getX(), e.getY(), raza, raza);
            }
        });
        this.addMouseMotionListener( new MouseMotionAdapter(){
            public void mouseMoved(MouseEvent e){
                Graphics g=Fereastra.this.getGraphics();
                g.drawOval(e.getX(),e.getY(),1,1);
            }
        });
        this.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                label.setText("Ati tastat:"+e.getKeyChar()+"");
            }
        });
    }
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fereastra f= new Fereastra("test adaptori");
        f.setVisible(true);
    }
    
}
