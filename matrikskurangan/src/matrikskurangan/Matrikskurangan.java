/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrikskurangan;

/**
 *
 * @author GeeksFarm BSD
 */
public class Matrikskurangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int matriks_a[][] = new int [2][2];
        int matriks_b[][] = new int [2][2];
        
        matriks_b[0][0]=8;
        matriks_b[0][1]=7;
        matriks_b[1][0]=6;
        matriks_b[1][1]=5;
        
        matriks_a[0][0]=1;
        matriks_a[0][1]=2;
        matriks_a[1][0]=3;
        matriks_a[1][1]=4;
        
        int hasil_penjumlahan [][] = new int [2][2];
        
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                 hasil_penjumlahan [i][j]=matriks_b[i][j]-matriks_a[i][j];
            }
        }
        System.out.println("Matriks B");
         for (int i=0;i<2;i++){
             System.out.print("[");
            for (int j=0;j<2;j++){
                 System.out.print(+matriks_b[i][j]+" ");
            }
            System.out.println("]");
         }
         System.out.println("Matriks A");
         for (int i=0;i<2;i++){
             System.out.print("[");
            for (int j=0;j<2;j++){
                 System.out.print(+matriks_a[i][j]+" ");
            }
            System.out.println("]");
         }
         System.out.println("Hasil pengurangan matriks B-A adalah");
         for (int i=0;i<2;i++){
             System.out.print("[");
            for (int j=0;j<2;j++){
                 System.out.print(hasil_penjumlahan[i][j]+" ");
            }
            System.out.println("]");
    }
    
}}
