/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.rachma.vina.dikma;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class TugasRachmaVinaDikma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tugas = new Scanner (System.in);
////         TODO code application logic here
////        OPERATOR PENUGASAN
////        PENAMBAHAN
        double a,b,hasil;
        System.out.print("masukkan angka 1 :");
        a = tugas.nextInt();
        System.out.print("masukkan angka 2 :");
        b = tugas.nextInt();
        hasil = a += b;
        System.out.println("hasil pembahannya = "+hasil);
        
//        PENGURANGAN
        System.out.print("masukkan angka 1 :");
        a = tugas.nextInt();
        System.out.print("masukkan angka 2 :");
        b = tugas.nextInt();
        hasil = a -= b; 
        System.out.println("hasil pengurangannya = "+hasil);
        
//        PERKALIAN
        System.out.print("masukkan angka 1 :");
        a = tugas.nextInt();
        System.out.print("masukkan angka 2 :");
        b = tugas.nextInt();
        hasil = a *= b; 
        System.out.println("hasil perkaliannya = "+hasil);
        
//        PEMBAGIAN
        System.out.print("masukkan angka 1 :");
        a = tugas.nextInt();
        System.out.print("masukkan angka 2 :");
        b = tugas.nextInt();
        hasil = a /= b; 
        System.out.println("hasil pembagiannya = "+hasil);
        
//        SISA BAGI
        System.out.print("masukkan angka 1 :");
        a = tugas.nextInt();
        System.out.print("masukkan angka 2 :");
        b = tugas.nextInt();
        hasil = a %= b; 
        System.out.println("hasil sisa baginya = "+hasil);
    
        System.out.println("===================");
//        OPERATOR PEMBANDING
//        Lebih Besar
        Scanner tugasX= new Scanner (System.in);
        System.out.print("masukan angka 1 :");
        float nilai0 = tugasX.nextInt();
        System.out.print("masukkan angka 2 :");
        float nilai3 = tugasX.nextInt();
        boolean hasil1;
        hasil1 = nilai0 > nilai3;
        System.out.println("hasil lebih besarnya = "+hasil1);
//        
////        Lebih Kecil
        System.out.print("masukkan angka 1 :");
        float nilai1 = tugasX.nextInt();
        System.out.print("masukkan angka 2 :");
        float nilai2 = tugasX.nextInt();
        boolean hasil2;
        hasil1 = nilai1 < nilai2;
        System.out.println("hasil lebih kecilnya = "+hasil1);
//        
////        Sama Dengan
        System.out.print("masukkan angka 1 :");
        float l = tugasX.nextInt();
        System.out.print("masukkan angka 2 :");
        float c = tugasX.nextInt();
        boolean hasil3;
        hasil1 = l == c;
        System.out.println("hasil sama dengan = "+hasil1);
//        
////        Tidak sama Dengan
        System.out.print("masukkan angka 1 :");
        float y = tugasX.nextInt();
        System.out.print("masukkan angka 2 :");
        float z = tugasX.nextInt();
        boolean hasila;
        hasil1 = y != z;
        System.out.println("hasil tidak sama dengan = "+hasil1);
//        
////        Lebih Besar Sama Dengan
        System.out.print("masukkan angka 1 :");
        float u = tugasX.nextInt();
        System.out.print("masukkan angka 2 :");
        float p = tugasX.nextInt();
        boolean hasilb;
        hasil1 = u >= p;
        System.out.println("hasil lebih besar sama dengan = "+hasil1);
        
////        Lebih Kecil Sama Dengan
        System.out.print("masukkan angka 1 :");
        float h = tugasX.nextInt();
        System.out.print("masukkan angka 2 :");
        float k = tugasX.nextInt();
        boolean hasild;
        hasil1 = h <= k;
        System.out.println("hasil lebih kecil sama dengan = "+hasil1);
        
        System.out.println("=====================");
//        OPERATOR BITWEES
        int r,e,hasil5;
       
//        AND
        System.out.print("masukkan angka 1 :");
        r = tugas.nextInt();
        System.out.print("masukkan angka 2 :");
        e = tugas.nextInt();
        hasil5 = r & e;
        System.out.println("hasil and = "+hasil5);
        
//        OR
        System.out.print("masukkan angka 1 :");
        r = tugas.nextInt();
        System.out.print("masukkan angka 2 :");
        e = tugas.nextInt();
        hasil5 = r | e;
        System.out.println("hasil or = "+hasil5);
        
//        XOR
        System.out.print("masukkan angka 1 :");
        r = tugas.nextInt();
        System.out.print("masukkan angka 2 :");
        e = tugas.nextInt();
        hasil5 = r ^ e;
        System.out.println("hasil xor = "+hasil5);
        
//        NEGASI
        System.out.print("masukkan angka :");
        r = tugas.nextInt();
        hasil5 = ~ r;
        System.out.println("hasil negasi = "+hasil5);
        
//        Left Shift
        System.out.print("masukkan angka :");
        r = tugas.nextInt();
        hasil5 = r >> 2;
        System.out.println("hasil left shift = "+hasil5);
        
//        RIGHT SHIFT
        System.out.print("masukkan angka :");
        r = tugas.nextInt();
        hasil5 = r << 2;
        System.out.println("hasil right shift = "+hasil5);
        
//        RIGHT SHIFT(UNSIGNED)
        System.out.print("masukkan angka :");
        r = tugas.nextInt();
        hasil5 = r >>> 2;
        System.out.println("hasil right shift unsigned = "+hasil5);
        
        
        
    }
    
}
