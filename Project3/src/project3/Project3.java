/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int luas,sisi ;
    
    Scanner persegi = new Scanner (System.in);
    
    System.out.println("a. Menghitung Luas Persegi ") ;
    System.out.println ("-----------------") ;
    
    System.out.println("sisi : ");
    sisi=persegi.nextInt();
    
    luas=(sisi*sisi);
    System.out.print("Luas persegi adalah"+luas);
    
    }
    
}
