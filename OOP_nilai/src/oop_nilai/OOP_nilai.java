/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_nilai;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
class nilai{
String nama,mutu,nim;
double total,nilaip,nilai1,nilai2;


public nilai(){
    nama="";
    nilaip=0;
    nilai1=0;
    nilai2=0;
    mutu="";
    nim="";
  
}
public void input (){
    Scanner inputan= new Scanner(System.in);
        
        System.out.println("inputan dalam");
        System.out.println("=======================================");
        System.out.println("Masukkan Nama anda: ");
        nama=inputan.nextLine();
        System.out.println("Masukkan nim anda :  ");
        nim=inputan.nextLine();
        System.out.println("Masukkan nilai pembimbing : ");
        nilaip=inputan.nextInt();
         System.out.println("Masukkan nilai penguji 1 : ");
        nilai1=inputan.nextInt();
         System.out.println("Masukkan nilai penguji 2 : ");
        nilai2=inputan.nextInt();
 
}
public void if_else (){
     if (total>80){
    mutu="Grade A";
}
else if (total>70){
    mutu="Grade B";
}
else if (total>60){
    mutu="Grade C";
}
else if (total<=10){
    mutu="Grade D";
}
}
    
        

 public double total (){
total=nilaip*0.4+nilai1*0.3+nilai2*0.3;
  return(total);
}  
 
 public void output (){
     System.out.println("=============================");
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Nilai Pembimbing : "+nilaip);
        System.out.println("Nilai Penguji 1 :"+nilai1);
        System.out.println("Nilai Penguji 2 :"+nilai2);
        System.out.println("Total :"+total());
        System.out.println("Huruf Mutu :"+mutu);
 }
}
public class OOP_nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        nilai mhs= new nilai ();

mhs.input();
mhs.total();
mhs.if_else();
mhs.output();
    }
    
}
