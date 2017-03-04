/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package douaferestre;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Ady
 */

class FerPrinc extends Frame implements ActionListener{
    public FerPrinc(String titlu){
        super (titlu);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        setSize(1024,768);
        Button b=new Button("Schimba titlul");
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        FerDialog d=new FerDialog (this,"Dati titlul",true);
        String titlu=d.raspuns;
        if(titlu==null){
            return;
            
        }
        setTitle(titlu);
    }
}

class FerDialog extends Dialog implements ActionListener{
    public String raspuns = null;
    private TextField text;
    private Button ok,cancel;
    public FerDialog(Frame parinte,String titlu,Boolean modala){
        super(parinte,titlu,modala);
        this.addWindowListener ( new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                raspuns=null;
                dispose();
            }
        });
        text= new TextField("",30);
        add(text,BorderLayout.CENTER);
        Panel panel=new Panel();
        ok = new Button("OK");
        cancel = new Button("CANCEL");
        panel.add(ok);
        panel.add(cancel);
        add(panel,BorderLayout.SOUTH);
        pack();
        text.addActionListener(this);
        ok.addActionListener(this);
        cancel.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        Object sursa=e.getSource();
        if(sursa==ok || sursa==text){
            raspuns=text.getText();
        }
        else
            raspuns=null;
        dispose();
    }
}

public class Douaferestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FerPrinc f=new FerPrinc("Main");
        f.setVisible(true);
    }
}
