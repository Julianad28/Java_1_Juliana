/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping_for2;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Looping_for2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  String nama,kkt,jk;
  Scanner inputan=new Scanner (System.in);
  
  for (int i=1;i<4;i++)
      
  {
      
      System.out.println ("Data peserta ke-"+i);
           
   System.out.print("Masukkan Nama : ");
        nama=inputan.nextLine();
        
        System.out.print("Masukkan kode kota : ");
        kkt=inputan.nextLine();
        
        System.out.print("Masukkan Jenis Kelamin : ");
        jk=inputan.nextLine();
        
        System.out.println(nama+"berasal dari kota "+kkt+" dan berjenis kelamin "+jk);
        
    
}}}
