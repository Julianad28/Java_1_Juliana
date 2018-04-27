/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Project4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int keliling,sisi ;
    
    Scanner persegi = new Scanner (System.in);
    
    System.out.println(" Menghitung Keliling Persegi ") ;
    System.out.println ("-----------------") ;
    
    System.out.println("sisi : ");
    sisi=persegi.nextInt();
    
    keliling=(sisi*4);
    System.out.print("Keliling persegi adalah"+keliling);
    }
    
}
