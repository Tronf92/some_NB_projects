/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgtry;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Ady
 */

class dim implements ActionListener{
    static JFrame f;
    static GridBagLayout gridBag;
    static GridBagConstraints gbc;
    static void adauga(Component comp,int x,int y,int w,int h){
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        gridBag.setConstraints (comp , gbc);
        f.add(comp);
    }
    public void jmenubar(){
        JMenuBar mb=new JMenuBar();
        JMenu fisier=new JMenu("File");
        JMenuItem nou=new JMenuItem("New");
        JMenuItem ext=new JMenuItem("Exit");
        JMenuItem open=new JMenuItem("Open");
        JMenuItem save=new JMenuItem("Save");
        JMenuItem svall=new JMenuItem("Save all");
        JMenuItem pnt=new JMenuItem("Print");
        //set action listeners for menu options
        ext.addActionListener(this);
        nou.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        svall.addActionListener(this);
        pnt.addActionListener(this);
        fisier.add(nou);
        fisier.add(open);
        fisier.add(save);
        fisier.add(svall);
        fisier.add(pnt);
        fisier.add(ext);
        
        JMenu editare= new JMenu("Edit");
        JMenuItem undo=new JMenuItem("Undo");
        JMenuItem cut=new JMenuItem("Cut");
        JMenuItem copy=new JMenuItem("Copy");
        JMenuItem pst=new JMenuItem("Paste");
        
        undo.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        pst.addActionListener(this);
        editare.add(undo);
        editare.add(cut);
        editare.add(copy);
        editare.add(pst);
        
        
        JMenu ajutor=new JMenu("Help");
        JMenuItem ajt=new JMenuItem("Help");
        JMenuItem abt=new JMenuItem("About");
        ajt.addActionListener(this);
        abt.addActionListener(this);
        ajutor.add(ajt);
        ajutor.add(abt);
        
        JTextField txt=new JTextField(20);
        adauga(mb,0,0,0,0);
        
    }
    static void init(){
        f=new JFrame();
        f.setSize(1024,768);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e) {
        String src=e.getActionCommand();
        if("New".equals(src)){}
        if("Open".equals(src)){}
        if("Save".equals(src)){}
        if("Save all".equals(src)){
            System.out.println("save all");
        }
        if("Print".equals(src)){}
        if("Exit".equals(src)){
            System.exit(0);
        }
        if("Undo".equals(src)){}
        if("Cut".equals(src)){}
        if("Copy".equals(src)){}
        if("Paste".equals(src)){}
         if("About".equals(src)){
            //sec f=new sec("About",350,300);
            f.setSize(300,100);
            JLabel txt=new JLabel("Program care calculeaza decontul.");
            f.add(txt,BorderLayout.NORTH);
            f.setVisible(true);
        }
        if("Help".equals(src)){
            //sec f=new sec("Help",350,300);
            f.setSize(300,150);
            JTextArea txt=new  JTextArea("Pt  ajutor contact Nicorici Adrian\n Tel: 0728161926 \n "
                    + "E-mail:nicorici.adrian@yahoo.com\n ady.niko51@gmail.com.");
            txt.setEditable(false);
            f.add(txt,BorderLayout.CENTER);
            f.setVisible(true);
        }
    }
}

public class Try {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dim.init();
        
        
    }
    
}
