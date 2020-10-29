/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan24.perbandinganduaangka;
import java.util.Scanner;
/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Perbandingan 2 angka
 */
public class PBOIF210119056Latihan24PerbandinganDuaAngka {

    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        boolean jalan = true;
        int lagi = 0;
        String jawab;
        
        System.out.println("======Program Perbandingan Nilai======");
        Scanner scan = new Scanner(System.in);

        while( jalan ) {
            
            Scanner inputNilai=new Scanner(System.in);
            System.out.print("Masukan Nilai Pertama: ");
            int nilai1=inputNilai.nextInt();
            System.out.print("Masukan nilai kedua: ");
            int nilai2=inputNilai.nextInt();

            if(nilai1>=nilai2){
                System.out.println("Hasil : "+nilai1+" Lebih Besar dari "+nilai2);
            }else{
                System.out.println("Hasil : "+nilai2+" Lebih Besar dari "+nilai1);
            }
        
            System.out.print("Ulangi Aktivitas ? (Ya/Tidak) : ");
            jawab = scan.next();

            if( jawab.equalsIgnoreCase("Tidak") ){
                jalan = false;
            }
            lagi++;
        }
    }
}
