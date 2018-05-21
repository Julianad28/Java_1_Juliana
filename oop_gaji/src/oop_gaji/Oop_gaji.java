/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_gaji;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
class gajian {
int golongan,gaji,tunjangan,potongan;
String nama,nip;

//constructor
public gajian(){
    golongan=0;
    nama="";
    gaji=0;
    tunjangan=0;
    potongan=0;
    nip="";
    
}
//Procedur Input
public void input (){
    Scanner inputan= new Scanner(System.in);
        
        System.out.println("Gaji Pegawai");
        System.out.println("=======================================");
        System.out.println("Masukkan Nomer Induk Pegawai : ");
        nip=inputan.nextLine();
        System.out.println("Masukkan Nama : ");
        nama=inputan.nextLine();
        System.out.println("Masukkan Golongan [1/2/3/4] : ");
        golongan=inputan.nextInt();
}
//Function Switch
public void switch_case (){
 switch(golongan){
            case 1:
               gaji= 2000000;
               tunjangan= gaji*40/100;
              potongan= 40000;
               break; 
            case 2: 
                gaji=2500000;
                tunjangan= gaji*40/100;
                potongan= 40000;
                break;
            case 3:
                gaji=3000000;
                tunjangan= gaji*50/100;
                potongan= 50000;
                break;
            case 4:
                gaji=4000000;
                tunjangan= gaji*60/100;
                potongan= 55000;
                break;
            default:
             System.out.println("Golongan yang diinputkan tidak tersedia");
                break;
        
        }
}

//Function
public int total (){

    return (gaji+tunjangan-potongan);
}

//
public void output (){
     System.out.println("Terimakasih telah memasukkan data sebagai berikut");
        System.out.println("Masukkan Nomer Induk Pegawai : "+nip);
        System.out.println("Masukkan Nama : "+nama);
        System.out.println("Masukkan Golongan [1/2/3/4] : "+golongan);
        System.out.println("Gaji Pokoknya : Rp."+gaji);
        System.out.println("Besar Tunjangan : Rp."+tunjangan);
        System.out.println("Besar Potongan : Rp."+potongan);
        System.out.println("Gaji Total : "+total());
}
 
}
public class Oop_gaji {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        // TODO code application logic here
    
    
gajian kry= new gajian ();

kry.input();
kry.switch_case();
kry.output();

    }
}

