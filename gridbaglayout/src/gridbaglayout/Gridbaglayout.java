/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gridbaglayout;
import java.awt.*;
import sun.java2d.loops.SurfaceType;
/**
 *
 * @author Ady
 */
public class Gridbaglayout {
    static Frame f;
    static GridBagLayout gridBag;
    static GridBagConstraints gbc;
    static void adauga(Component comp,int x,int y,int w,int h){
        gbc.gridx=x;
        gbc.gridy=y;
        gbc.gridwidth=w;
        gbc.gridheight=h;
        gridBag.setConstraints (comp,gbc);
        f.add(comp);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        f=new Frame("test");
        gridBag=new GridBagLayout();
        gbc=new GridBagConstraints();
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(5,5,5,5);
        f.setLayout(gridBag);
        Label mesaj = new Label("Evidenta persoane",Label.CENTER);
        mesaj.setFont(new Font("Arial",Font.BOLD,24));
        mesaj.setBackground(Color.yellow);
        gbc.fill = GridBagConstraints.BOTH;
        adauga(mesaj,0,0,4,2);
        Label etNume = new Label("Nume:");
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.EAST;
        adauga(etNume,0,2,1,1);
        Label etSalariu=new Label("Salariu:");
        adauga(etSalariu,0,3,1,1);
        TextField nume = new TextField("",30);
        gbc.fill= GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        adauga(nume,1,2,2,1);
        TextField salariu = new TextField("",30);
        adauga(salariu,1,3,2,1);
        Button adaugare = new Button("Adaugare");
        gbc.fill = GridBagConstraints.NONE;
        adauga(adaugare,3,2,1,2);
        Button salvare = new Button("Salvare");
        gbc.fill =  GridBagConstraints.HORIZONTAL;
        adauga(salvare,1,4,1,1);
        Button iesire = new Button("Iesire");
        adauga(iesire,2,3,1,1);
        f.pack();
        f.setVisible(true);
    }
    
}
