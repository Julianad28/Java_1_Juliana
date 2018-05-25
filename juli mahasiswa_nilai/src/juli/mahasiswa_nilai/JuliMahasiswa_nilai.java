/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juli.mahasiswa_nilai;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
class mahasiswanilai{
String nomor_mahasiswa,nama_mahasiswa,kelas,semester,nilai_pemograman,nilai_database,nilai_design,nilai_algoritma,nilai;
int nilaialg,nilaipmg,nilaidbs,nilaidsg;
double ratarata,jumlahnilai;
Scanner inputan= new Scanner(System.in);

public mahasiswanilai(){
    nomor_mahasiswa="";
    nama_mahasiswa="";
    kelas="";
    semester="";
nilai_pemograman="";
nilai_database="";
nilai_design="";
nilai_algoritma="";
nilai="";
nilaipmg=0;
jumlahnilai=0;
ratarata=0.0;
}
 public void input (){
   System.out.println("Selamat datang di program nilai mahasiswa");
   System.out.println("=========================================");
   System.out.println("Inputkan Data Anda");
   System.out.println("Masukkan Nomor Mahasiswa Anda : ");
   nomor_mahasiswa=inputan.nextLine();
   System.out.println("Masukkan Nama Mahasiswa : ");
   nama_mahasiswa=inputan.nextLine();
   System.out.println("Masukkan Kelas : ");
   kelas=inputan.nextLine();
   System.out.println("Masukkan Semester : ");
   semester=inputan.nextLine();
   System.out.println("Masukkan Nilai Pemograman [A/B/C/D] : ");
   nilai_pemograman=inputan.nextLine();
   System.out.println("Masukkan Nilai Database [A/B/C/D] : ");
   nilai_database=inputan.nextLine();
   System.out.println("Masukkan Nilai Design [A/B/C/D] : ");
   nilai_design=inputan.nextLine();
   System.out.println("Masukkan Nilai Algoritma [A/B/C/D] : ");
   nilai_algoritma=inputan.nextLine();
 }       
 public void nilai (){
     if ("A".equals(nilai_pemograman))
     {
         nilaipmg=4;
     }
         if ("B".equals(nilai_pemograman))
     {
         nilaipmg=3;
     }
          if ("C".equals(nilai_pemograman))
     {
         nilaipmg=2;
     }
           if ("D".equals(nilai_pemograman))
     {
         nilaipmg=1;
     }
            if ("E".equals(nilai_pemograman))
     {
         nilaipmg=0;
     }
             if ("A".equals(nilai_database))
     {
         nilaidbs=4;
     }
         if ("B".equals(nilai_database))
     {
         nilaidbs=3;
     }
          if ("C".equals(nilai_database))
     {
         nilaidbs=2;
     }
           if ("D".equals(nilai_database))
     {
         nilaidbs=1;
     }
            if ("E".equals(nilai_database))
     {
         nilaidbs=0;
     }
             if ("A".equals(nilai_design))
     {
         nilaidsg=4;
     }
         if ("B".equals(nilai_design))
     {
         nilaidsg=3;
     }
          if ("C".equals(nilai_design))
     {
         nilaidsg=2;
     }
           if ("D".equals(nilai_design))
     {
         nilaidsg=1;
     }
            if ("E".equals(nilai_design))
     {
         nilaidsg=0;
     }
        if ("A".equals( nilai_algoritma))
     {
         nilaialg=4;
     }
         if ("B".equals( nilai_algoritma))
     {
         nilaialg=3;
     }
          if ("C".equals( nilai_algoritma))
     {
         nilaialg=2;
     }
           if ("D".equals( nilai_algoritma))
     {
         nilaialg=1;
     }
            if ("E".equals( nilai_algoritma))
     {
         nilaialg=0;
     }
     }
 public int jumlahnilai(){
     int nilai_algoritma=nilaialg;
     int nilai_pemograman=nilaipmg;
     int nilai_database=nilaidbs;
     int nilai_design=nilaidsg;
      
 
        jumlahnilai=(nilai_pemograman*4)+(nilai_database*3)+(nilai_design*1)+(nilai_algoritma*2);
    return (int) jumlahnilai;
        
 }
 public double ratarata(){
     ratarata=jumlahnilai/10;
     return ratarata;
 }
 public void output (){
   System.out.println("Hasil data anda");
   System.out.println("=========================================");
   System.out.println("Nomor Mahasiswa : "+nomor_mahasiswa);
   System.out.println("Nama Mahasiswa : "+nama_mahasiswa);
   System.out.println("kelas Mahasiswa : "+kelas);
   System.out.println("Semester Mahasiswa : "+semester);
   jumlahnilai();
   System.out.println("Jumlah nilai : "+jumlahnilai);
   ratarata();
   System.out.println("Rata-rata : "+ratarata);
 }
}
public class JuliMahasiswa_nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mahasiswanilai mhs = new mahasiswanilai();
        mhs.input();
        mhs.nilai();
        mhs.output();
        
    }
    
}
