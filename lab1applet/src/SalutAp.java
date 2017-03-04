/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author Ady
 */
public class SalutAp extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        
    }
    public void paint(Graphics g){
        g.drawString("Salut",10,50);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
