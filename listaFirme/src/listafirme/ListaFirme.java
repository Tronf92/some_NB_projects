package listafirme;
import javax.swing.*;
import java.awt.*;
import javax.swing.filechooser.*;
import java.nio.file.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.*;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;

public class ListaFirme extends javax.swing.JFrame {
    public String at;
    BufferedReader input;
    BufferedWriter output;
    public int[] indici;
    public int i;
    private void connection() throws SQLException{
       //String url = "jdbc:mysql://localhost:3306/";
       //String dbName = "ady";      
    }
    
    public ListaFirme() {
        initComponents();    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edit_cmp = new javax.swing.JFrame();
        edit_id_bursa = new javax.swing.JTextField();
        edit_id_bursa_in = new javax.swing.JTextField();
        edit_traseu = new javax.swing.JTextField();
        edit_tonaj = new javax.swing.JTextField();
        edit_termen = new javax.swing.JTextField();
        edit_achitat = new javax.swing.JTextField();
        edit_zile_intarziere = new javax.swing.JTextField();
        edit_traseu_in = new javax.swing.JTextField();
        edit_tonaj_in = new javax.swing.JTextField();
        edit_suma_in = new javax.swing.JTextField();
        edit_pret_in = new javax.swing.JTextField();
        edit_suma = new javax.swing.JTextField();
        edit_pret = new javax.swing.JTextField();
        edit_termen_plata_in = new javax.swing.JTextField();
        edit_achitat_in = new javax.swing.JTextField();
        edit_zile_intarziere_in = new javax.swing.JTextField();
        edit_ok = new javax.swing.JButton();
        edit_cancel = new javax.swing.JButton();
        errr_diag = new javax.swing.JDialog();
        err_scrollpane = new javax.swing.JScrollPane();
        err_textarea = new javax.swing.JTextArea();
        err_btn = new javax.swing.JButton();
        view = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        view_err = new javax.swing.JDialog();
        view_err_pane = new javax.swing.JScrollPane();
        view_err_txtfield = new javax.swing.JTextArea();
        view_err_ok_btn = new javax.swing.JButton();
        adg_cmp = new javax.swing.JFrame();
        adg_id_bursa = new javax.swing.JTextField();
        adg_id_bursa_in = new javax.swing.JTextField();
        adg_traseu = new javax.swing.JTextField();
        adg_tonaj = new javax.swing.JTextField();
        adg_termen = new javax.swing.JTextField();
        adg_achitat = new javax.swing.JTextField();
        adg_zile_intarziere = new javax.swing.JTextField();
        adg_traseu_in = new javax.swing.JTextField();
        adg_tonaj_in = new javax.swing.JTextField();
        adg_suma_in = new javax.swing.JTextField();
        adg_pret_in = new javax.swing.JTextField();
        adg_suma = new javax.swing.JTextField();
        adg_pret = new javax.swing.JTextField();
        adg_termen_plata_in = new javax.swing.JTextField();
        adg_achitat_in = new javax.swing.JTextField();
        adg_zile_intarziere_in = new javax.swing.JTextField();
        adg_ok = new javax.swing.JButton();
        adg_cancel = new javax.swing.JButton();
        adg_nume_frm = new javax.swing.JTextField();
        adg_nume_frm_in = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DefaultListModel model=new DefaultListModel();
        try{
            String url =  "jdbc:ucanaccess://D://C++ &Programare//DB//Access DB//ListaFirme.accdb";
            String user = "Administator";
            String pass = "";
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            String SQL_max = "SELECT MAX(\"ID_Bursa\") FROM Lista";
            ResultSet rs = stmt.executeQuery(SQL_max);
            int dim = rs.getInt("ID");
            String SQL = "SELECT * FROM ListaFirme";
            ResultSet res = stmt.executeQuery(SQL);
            System.out.println(res);
            while(res.next()){
                String name = res.getString("Nume");
                model.addElement(name);
                indici = new int[dim];
                indici[i] = res.getInt("ID");
                System.out.println(res.getInt("ID"));
                i++;
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        lista = new javax.swing.JList();
        Adauga = new javax.swing.JButton();
        Sterge = new javax.swing.JButton();
        Editeaza = new javax.swing.JButton();
        Vizualizeaza = new javax.swing.JButton();

        edit_cmp.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        edit_cmp.setMinimumSize(new java.awt.Dimension(1024, 768));

        edit_id_bursa.setEditable(false);
        edit_id_bursa.setText("ID BURSA");

        edit_traseu.setEditable(false);
        edit_traseu.setText("Traseu");

        edit_tonaj.setEditable(false);
        edit_tonaj.setText("Tonaj");

        edit_termen.setEditable(false);
        edit_termen.setText("Termen plata");

        edit_achitat.setEditable(false);
        edit_achitat.setText("Achitat");

        edit_zile_intarziere.setEditable(false);
        edit_zile_intarziere.setText("Zile intarziere");

        edit_suma.setEditable(false);
        edit_suma.setText("Suma");

        edit_pret.setEditable(false);
        edit_pret.setText("Pret/km");

        edit_ok.setText("OK");
        edit_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_okActionPerformed(evt);
            }
        });

        edit_cancel.setText("Cancel");
        edit_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout edit_cmpLayout = new javax.swing.GroupLayout(edit_cmp.getContentPane());
        edit_cmp.getContentPane().setLayout(edit_cmpLayout);
        edit_cmpLayout.setHorizontalGroup(
            edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_cmpLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(edit_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(edit_cancel)
                .addGap(397, 397, 397))
            .addGroup(edit_cmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(edit_cmpLayout.createSequentialGroup()
                            .addGroup(edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(edit_tonaj)
                                .addComponent(edit_traseu)
                                .addComponent(edit_id_bursa, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(edit_id_bursa_in)
                                .addComponent(edit_traseu_in)
                                .addComponent(edit_tonaj_in, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                        .addGroup(edit_cmpLayout.createSequentialGroup()
                            .addGroup(edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(edit_zile_intarziere, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addComponent(edit_achitat, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(edit_termen, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(18, 18, 18)
                            .addGroup(edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(edit_termen_plata_in)
                                .addComponent(edit_achitat_in)
                                .addComponent(edit_zile_intarziere_in, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))))
                    .addGroup(edit_cmpLayout.createSequentialGroup()
                        .addComponent(edit_pret, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edit_pret_in, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(edit_cmpLayout.createSequentialGroup()
                        .addComponent(edit_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edit_suma_in, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        edit_cmpLayout.setVerticalGroup(
            edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_cmpLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_id_bursa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_id_bursa_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_traseu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_traseu_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_tonaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_tonaj_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_suma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_suma_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_pret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_pret_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_termen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_termen_plata_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_achitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_achitat_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_zile_intarziere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_zile_intarziere_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(edit_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_ok)
                    .addComponent(edit_cancel))
                .addGap(28, 28, 28))
        );

        errr_diag.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        errr_diag.setMinimumSize(new java.awt.Dimension(300, 300));

        err_textarea.setEditable(false);
        err_textarea.setColumns(20);
        err_textarea.setRows(5);
        err_textarea.setText("Camp gol!");
        err_textarea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        err_textarea.setMinimumSize(new java.awt.Dimension(200, 200));
        err_textarea.setPreferredSize(new java.awt.Dimension(200, 200));
        err_scrollpane.setViewportView(err_textarea);

        err_btn.setText("OK");
        err_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                err_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout errr_diagLayout = new javax.swing.GroupLayout(errr_diag.getContentPane());
        errr_diag.getContentPane().setLayout(errr_diagLayout);
        errr_diagLayout.setHorizontalGroup(
            errr_diagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errr_diagLayout.createSequentialGroup()
                .addGroup(errr_diagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(errr_diagLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(err_btn))
                    .addGroup(errr_diagLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(err_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        errr_diagLayout.setVerticalGroup(
            errr_diagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errr_diagLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(err_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(err_btn)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        view.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        view.setMinimumSize(new java.awt.Dimension(500, 500));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view.getContentPane());
        view.getContentPane().setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );

        view_err.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        view_err.setMinimumSize(new java.awt.Dimension(350, 350));

        view_err_txtfield.setEditable(false);
        view_err_txtfield.setColumns(20);
        view_err_txtfield.setRows(5);
        view_err_txtfield.setText("Nici un element selectat!\nSelectati un element inainte!");
        view_err_pane.setViewportView(view_err_txtfield);

        view_err_ok_btn.setText("OK");
        view_err_ok_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_err_ok_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout view_errLayout = new javax.swing.GroupLayout(view_err.getContentPane());
        view_err.getContentPane().setLayout(view_errLayout);
        view_errLayout.setHorizontalGroup(
            view_errLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_errLayout.createSequentialGroup()
                .addGroup(view_errLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(view_errLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(view_err_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(view_errLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(view_err_ok_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        view_errLayout.setVerticalGroup(
            view_errLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_errLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(view_err_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(view_err_ok_btn)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        adg_cmp.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        adg_cmp.setMinimumSize(new java.awt.Dimension(1024, 768));

        adg_id_bursa.setEditable(false);
        adg_id_bursa.setText("ID BURSA");

        adg_traseu.setEditable(false);
        adg_traseu.setText("Traseu");

        adg_tonaj.setEditable(false);
        adg_tonaj.setText("Tonaj");

        adg_termen.setEditable(false);
        adg_termen.setText("Termen plata");

        adg_achitat.setEditable(false);
        adg_achitat.setText("Achitat");

        adg_zile_intarziere.setEditable(false);
        adg_zile_intarziere.setText("Zile intarziere");

        adg_suma.setEditable(false);
        adg_suma.setText("Suma");

        adg_pret.setEditable(false);
        adg_pret.setText("Pret/km");

        adg_ok.setText("OK");
        adg_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adg_okActionPerformed(evt);
            }
        });

        adg_cancel.setText("Cancel");
        adg_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adg_cancelActionPerformed(evt);
            }
        });

        adg_nume_frm.setEditable(false);
        adg_nume_frm.setText("Nume firma");

        javax.swing.GroupLayout adg_cmpLayout = new javax.swing.GroupLayout(adg_cmp.getContentPane());
        adg_cmp.getContentPane().setLayout(adg_cmpLayout);
        adg_cmpLayout.setHorizontalGroup(
            adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adg_cmpLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(adg_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(adg_cancel)
                .addGap(397, 397, 397))
            .addGroup(adg_cmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(adg_cmpLayout.createSequentialGroup()
                            .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(adg_tonaj)
                                .addComponent(adg_traseu)
                                .addComponent(adg_id_bursa, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(adg_traseu_in)
                                .addComponent(adg_tonaj_in)
                                .addComponent(adg_id_bursa_in, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(adg_cmpLayout.createSequentialGroup()
                            .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(adg_zile_intarziere, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addComponent(adg_achitat, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(adg_termen, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(18, 18, 18)
                            .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(adg_termen_plata_in)
                                .addComponent(adg_achitat_in)
                                .addComponent(adg_zile_intarziere_in, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))))
                    .addGroup(adg_cmpLayout.createSequentialGroup()
                        .addComponent(adg_pret, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adg_pret_in, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adg_cmpLayout.createSequentialGroup()
                        .addComponent(adg_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adg_suma_in, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adg_cmpLayout.createSequentialGroup()
                        .addComponent(adg_nume_frm, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adg_nume_frm_in, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adg_cmpLayout.setVerticalGroup(
            adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adg_cmpLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adg_nume_frm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adg_nume_frm_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adg_id_bursa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adg_id_bursa_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adg_traseu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adg_traseu_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adg_tonaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adg_tonaj_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adg_suma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adg_suma_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adg_pret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adg_pret_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adg_termen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adg_termen_plata_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adg_achitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adg_achitat_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adg_zile_intarziere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adg_zile_intarziere_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(adg_cmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adg_ok)
                    .addComponent(adg_cancel))
                .addGap(28, 28, 28))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));

        lista.setModel(model);
        lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        lista.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                listaComponentAdded(evt);
            }
        });
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        lista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        Adauga.setText("Adauga");
        Adauga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdaugaActionPerformed(evt);
            }
        });

        Sterge.setText("Sterge");
        Sterge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StergeActionPerformed(evt);
            }
        });

        Editeaza.setText("Editeaza");
        Editeaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditeazaActionPerformed(evt);
            }
        });

        Vizualizeaza.setText("Vizualizeaza");
        Vizualizeaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VizualizeazaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Vizualizeaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Editeaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sterge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Adauga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Adauga)
                        .addGap(18, 18, 18)
                        .addComponent(Sterge)
                        .addGap(18, 18, 18)
                        .addComponent(Editeaza)
                        .addGap(18, 18, 18)
                        .addComponent(Vizualizeaza)
                        .addGap(0, 132, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_listaComponentAdded
            // TODO add your handling code here:
            //int size;
            //size=lista.getModel().getSize();
            //at=alta_tara_txt.getText();
            //DefaultListModel mdl=(DefaultListModel) lista.getModel();
            //int sz= lista.getModel().getSize();
            //mdl.add(size, at);
            //lista.setModel(mdl);
            //alta_tara_txt.setText(null);
            //alta_tara.dispose();
    }//GEN-LAST:event_listaComponentAdded

    private void StergeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StergeActionPerformed
        // TODO add your handling code here:
        int index = lista.getSelectedIndex()+1;
        if(lista.getSelectedIndex()!= -1){
            DefaultListModel md2=(DefaultListModel) lista.getModel();
            md2.remove(lista.getSelectedIndex());
            lista.setModel(md2);
            try{
                String ind = Integer.toString(index);
                String url = "jdbc:sqlserver://localhost:1433";
                String user = "adrian";
                String pass = "blabla";
                Connection conn = DriverManager.getConnection(url,user,pass);
                Statement stmt = conn.createStatement();
                System.out.println(index);
                String SQL = "DELETE FROM db_owner.Lista WHERE ID=";
                ResultSet res = stmt.executeQuery(SQL+ind);
                ResultSet rs = stmt.executeQuery("DBCC CHECKIDENT ('db_owner.Lista', RESEED," + (index-1) + ")"); 
                
            }catch (SQLException e) {
                      System.out.println(e.getMessage());
		}
        }
        else{
            view_err.setVisible(true);
        }
    }//GEN-LAST:event_StergeActionPerformed

    private void AdaugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdaugaActionPerformed
        adg_cmp.setVisible(true);
    }//GEN-LAST:event_AdaugaActionPerformed

    private void EditeazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditeazaActionPerformed
        // TODO add your handling code here:
        if(lista.getSelectedIndex()!= -1){
            edit_cmp.setVisible(true);          
        }
        else{
            view_err.setVisible(true);
        }
        
    }//GEN-LAST:event_EditeazaActionPerformed

    private void err_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_err_btnActionPerformed
        // TODO add your handling code here:
        errr_diag.dispose();
    }//GEN-LAST:event_err_btnActionPerformed

    private void edit_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_okActionPerformed
        // TODO add your handling code here:
        /*
        String id,termen,zile;
        String traseu,act;
        String tonaj,suma,pret,nume;
        int index;
        nume = adg_nume_frm_in.getText();
        index = lista.getSelectedIndex();
        id = adg_id_bursa_in.getText();
        termen = adg_termen_plata_in.getText();
        zile = adg_zile_intarziere_in.getText();
        traseu = adg_traseu_in.getText();
        tonaj = adg_tonaj_in.getText();
        suma = adg_suma_in.getText();
        pret = adg_pret_in.getText();
        act = adg_achitat_in.getText();
        try{
            String url = "jdbc:sqlserver://localhost:1433";
            String user = "adrian";
            String pass = "blabla";
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            String SQL = "INSERT INTO db_owner.Lista('IdBursa','Nume', 'Traseu', "
                    + "'Tonaj','Suma','PretKm','TermenPlata','Achitat','ZileIntarziere')";
            String data = "VALUES('" + id + "','" + nume + "','" + traseu + "','" +
                        tonaj + "','" + suma + "','" + pret + "','" + termen + "','" +
                        act + "','" + zile +"')"; 
            ResultSet res= stmt.executeQuery(SQL+data); 
            conn.close();
        }catch(SQLException e) {}
        edit_achitat_in.setText(null);
        edit_id_bursa_in.setText(null);
        edit_pret_in.setText(null);
        edit_suma_in.setText(null);
        edit_termen_plata_in.setText(null);
        edit_traseu_in.setText(null);
        edit_zile_intarziere_in.setText(null);
        edit_tonaj_in.setText(null);
        */
        edit_cmp.dispose();
           
        
        
    }//GEN-LAST:event_edit_okActionPerformed

    private void edit_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_cancelActionPerformed
        // TODO add your handling code here:
        edit_achitat_in.setText(null);
        edit_id_bursa_in.setText(null);
        edit_pret_in.setText(null);
        edit_suma_in.setText(null);
        edit_termen_plata_in.setText(null);
        edit_traseu_in.setText(null);
        edit_zile_intarziere_in.setText(null);
        edit_tonaj_in.setText(null);
        edit_cmp.dispose();
    }//GEN-LAST:event_edit_cancelActionPerformed

    private void VizualizeazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VizualizeazaActionPerformed
        // TODO add your handling code here:
        if(lista.getSelectedIndex() != -1){
            int index = lista.getSelectedIndex() +1;
            System.out.println(index);
            try{
            String url = "jdbc:sqlserver://localhost:1433";
            String user = "adrian";
            String pass = "blabla";
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            String ind = Integer.toString(index);
            String SQL = "SELECT * FROM db_owner.Lista WHERE ID=";
            ResultSet res = stmt.executeQuery(SQL+ind);
            String text=null;
            if(res.next()){
            text ="ID Bursa:"+ res.getString("IdBURSA")+"\n"+
                  "Nume firma: "+res.getString("Nume")+"\n"+
                  "Traseu: "+res.getString("Traseu")+"\n"+
                  "Tonaj: "+res.getString("Tonaj")+"\n"+
                  "Suma: "+res.getString("Suma")+"\n"+
                  "Pret/km: "+res.getString("PretKm")+"\n"+
                  "Termen plata: "+res.getString("TermenPlata")+"\n"+
                  "Achitat: "+res.getString("Achitat")+"\n"+
                  "Zile intarziere: "+res.getString("ZileIntarziere");
            }
            jTextArea1.setText(text);
            conn.close();
		  } catch (SQLException e) {
                      System.out.println(e.getMessage());
		  }
            
            view.setVisible(true);
            
        }
        else{
            view_err.setVisible(true);
        }
       
        
    }//GEN-LAST:event_VizualizeazaActionPerformed

    private void view_err_ok_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_err_ok_btnActionPerformed
        // TODO add your handling code here:
        view_err.dispose();
    }//GEN-LAST:event_view_err_ok_btnActionPerformed

    private void listaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaKeyPressed
        // TODO add your handling code here:
        if ( evt.isControlDown() && (evt.getKeyChar()== 'd' || evt.getKeyCode()== 68  || evt.getKeyChar()== 'D' ||  evt.getKeyCode() == 100)  ){
            lista.clearSelection();
        }
    }//GEN-LAST:event_listaKeyPressed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2 && lista.getSelectedIndex()!= -1 ){
            lista.clearSelection();
        }
    }//GEN-LAST:event_listaMouseClicked

    private void adg_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adg_okActionPerformed
        String id,termen,zile;
        String traseu,act;
        String tonaj,suma,pret,nume;
        int index;
        nume = adg_nume_frm_in.getText();
        index = lista.getSelectedIndex();
        id = adg_id_bursa_in.getText();
        termen = adg_termen_plata_in.getText();
        zile = adg_zile_intarziere_in.getText();
        traseu = adg_traseu_in.getText();
        tonaj = adg_tonaj_in.getText();
        suma = adg_suma_in.getText();
        pret = adg_pret_in.getText();
        act = adg_achitat_in.getText();
        try{
            String url = "jdbc:sqlserver://localhost:1433";
            String user = "adrian";
            String pass = "blabla";
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            String SQL = "INSERT INTO db_owner.Lista(IdBURSA,Nume,Traseu, "
                    + "Tonaj,Suma,PretKm,TermenPlata,Achitat,ZileIntarziere)";
            String data = "VALUES('" + id + "','" + nume + "','" + traseu + "','" +
                        tonaj + "','" + suma + "','" + pret + "','" + termen + "','" +
                        act + "','" + zile +"')"; 
            ResultSet res= stmt.executeQuery(SQL+data); 
            conn.close();
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        adg_achitat_in.setText(null);
        adg_id_bursa_in.setText(null);
        adg_pret_in.setText(null);
        adg_suma_in.setText(null);
        adg_termen_plata_in.setText(null);
        adg_traseu_in.setText(null);
        adg_zile_intarziere_in.setText(null);
        adg_tonaj_in.setText(null);
        
        adg_cmp.dispose();
    }//GEN-LAST:event_adg_okActionPerformed

    private void adg_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adg_cancelActionPerformed
        
    }//GEN-LAST:event_adg_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaFirme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaFirme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaFirme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaFirme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaFirme().setVisible(true);
            }
        });
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adauga;
    private javax.swing.JButton Editeaza;
    private javax.swing.JButton Sterge;
    private javax.swing.JButton Vizualizeaza;
    private javax.swing.JTextField adg_achitat;
    private javax.swing.JTextField adg_achitat_in;
    private javax.swing.JButton adg_cancel;
    private javax.swing.JFrame adg_cmp;
    private javax.swing.JTextField adg_id_bursa;
    private javax.swing.JTextField adg_id_bursa_in;
    private javax.swing.JTextField adg_nume_frm;
    private javax.swing.JTextField adg_nume_frm_in;
    private javax.swing.JButton adg_ok;
    private javax.swing.JTextField adg_pret;
    private javax.swing.JTextField adg_pret_in;
    private javax.swing.JTextField adg_suma;
    private javax.swing.JTextField adg_suma_in;
    private javax.swing.JTextField adg_termen;
    private javax.swing.JTextField adg_termen_plata_in;
    private javax.swing.JTextField adg_tonaj;
    private javax.swing.JTextField adg_tonaj_in;
    private javax.swing.JTextField adg_traseu;
    private javax.swing.JTextField adg_traseu_in;
    private javax.swing.JTextField adg_zile_intarziere;
    private javax.swing.JTextField adg_zile_intarziere_in;
    private javax.swing.JTextField edit_achitat;
    private javax.swing.JTextField edit_achitat_in;
    private javax.swing.JButton edit_cancel;
    private javax.swing.JFrame edit_cmp;
    private javax.swing.JTextField edit_id_bursa;
    private javax.swing.JTextField edit_id_bursa_in;
    private javax.swing.JButton edit_ok;
    private javax.swing.JTextField edit_pret;
    private javax.swing.JTextField edit_pret_in;
    private javax.swing.JTextField edit_suma;
    private javax.swing.JTextField edit_suma_in;
    private javax.swing.JTextField edit_termen;
    private javax.swing.JTextField edit_termen_plata_in;
    private javax.swing.JTextField edit_tonaj;
    private javax.swing.JTextField edit_tonaj_in;
    private javax.swing.JTextField edit_traseu;
    private javax.swing.JTextField edit_traseu_in;
    private javax.swing.JTextField edit_zile_intarziere;
    private javax.swing.JTextField edit_zile_intarziere_in;
    private javax.swing.JButton err_btn;
    private javax.swing.JScrollPane err_scrollpane;
    private javax.swing.JTextArea err_textarea;
    private javax.swing.JDialog errr_diag;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList lista;
    private javax.swing.JFrame view;
    private javax.swing.JDialog view_err;
    private javax.swing.JButton view_err_ok_btn;
    private javax.swing.JScrollPane view_err_pane;
    private javax.swing.JTextArea view_err_txtfield;
    // End of variables declaration//GEN-END:variables

    

    
}
