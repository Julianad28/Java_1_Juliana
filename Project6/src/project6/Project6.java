/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Project6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int luas,panjang,lebar,tinggi ;
    
    Scanner balok = new Scanner (System.in);
    
    System.out.println(" Menghitung Luas Permukaan Balok ") ;
    System.out.println ("-----------------") ;
    
    System.out.println("panjang : ");
    panjang=balok.nextInt();
    
    System.out.println("lebar : ");
    lebar=balok.nextInt();
    
    System.out.println("tinggi");
    tinggi=balok.nextInt();
    
    luas=2*panjang*lebar+2*panjang*tinggi+2*lebar*tinggi;
    System.out.print("Luas permukaan balok adalah"+luas);
    }
    
}
