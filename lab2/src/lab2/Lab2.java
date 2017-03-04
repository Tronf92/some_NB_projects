/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author Ady
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Numar insuficient de argumente!");
            System.exit(-1);
        }
        String nume=args[0];
        String prenume;
        if(args.length>1){
            prenume=args[1];
        }
        else
            prenume="";
        System.out.println("Salut"+nume+""+prenume);
    }
    
}
