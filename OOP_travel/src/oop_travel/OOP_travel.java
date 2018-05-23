/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_travel;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
class Travel {
    String nama, jurusan, jenis,ulang;
        int total, jumlah_kursi, harga, ac, nonac, kembalian, jumlah;
        
public Travel(){
    nama="";
    jurusan="";
    jenis="";
    ulang="";
    harga=0;
    total=0;
    jumlah_kursi=0;
    ac=0;
    nonac=0;
    kembalian=0;
    jumlah=0;
    
}

//Procedure input
public void input (){
    Scanner input = new Scanner (System.in);
    
    System.out.println("======================================");
    System.out.println("          =          Jenis            ");
    System.out.println(" Jurusan  =    AC    =====    Non AC  ");
    System.out.println("======================================");
    System.out.println(" Banten   =  90.000  =====    70.000  ");
    System.out.println(" Semarang =  85.000  =====    60.000  ");
    System.out.println(" Jogja    =  60.000  =====    40.000  ");
    System.out.println("======================================");
    
    System.out.print("Masukkan Nama : ");
    nama=input.nextLine();
      
    System.out.print("Jurusan: ");
    jurusan=input.nextLine();
        
    System.out.print("Jenis : ");
    jenis=input.nextLine();

    System.out.print("Banyak Tiket : ");
    jumlah_kursi=input.nextInt();

}

//Function Ifelse
public void ifelse (){
switch(jurusan){
            case "Banten":
                if ("Non AC".equals(jenis))
                {
                harga=75000;
                }
               else if ("AC".equals(jenis)) 
                {
                harga=90000;
                } 
                break;
            case "Semarang": 
                if ("Non AC".equals(jenis))
                {
                harga=60000;
                }
               else if ("AC".equals(jenis)) 
                {
                harga=85000;
                } 
                break;
            case "Jogja": 
                if ("NA".equals(jenis))
                {
                harga=40000;
                }
               else if ("AC".equals(jenis)) 
                {
                harga=60000;
                } 
                break;
            default:
                jurusan="Maaf silahkan input ulang";
                break;
        }
}

            
//Function total
public int total(){
    total=harga*jumlah_kursi;
    return(total);
}


public void jumlah (){
    Scanner inputan=new Scanner (System.in);
    
    System.out.println("Harga satuan untuk "+jurusan+" adalah "+harga);
    System.out.println("======================================");
    System.out.println(nama+" harus membayar sebesar "+total);
    
    System.out.print("Masukkan jumlah uang : ");
    jumlah=inputan.nextInt();
    System.out.println("======================================");
            }          

//Function kembali
public int kembali(){
    kembalian=jumlah-total;
    return(kembalian);
}


//Procedure output
public void output(){
    Scanner ulg= new Scanner (System.in);
    System.out.println("kembalian "+kembalian);
    System.out.print("Ulangi lagi [Y/N]?");
    ulang=ulg.nextLine();
    System.out.println("======================================");
    
}
}

public class OOP_travel{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Travel oop=new Travel();
    
    oop.input();
    oop.ifelse();
    oop.total();
    oop.jumlah();
    oop.kembali();
    oop.output();
    
    String pilihan;
    Scanner input = new Scanner (System.in);
    do{
        oop.input();
    oop.ifelse();
    oop.total();
    oop.jumlah();
    oop.kembali();
    oop.output();
        System.out.println("Ulangi lagi [Y/N]? : ");
              pilihan=input.next();
    }while("Y".equals(pilihan));
    
    }
    

    }
    

