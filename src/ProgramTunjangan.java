/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diva sabila Ramadhan 
 * Nama  : Diva Sabila Ramadhan
 * Kelas : IF 1
 * NIM   : 10119039
 * Deskripsi Program : Program Tunjangan 
 */

import java.util.Scanner; // import kelas java

public class ProgramTunjangan {

  
    public static void main(String[] args) {
       // deklarasi variabel
        String status;
        double tunjangan, gajiTotal;
        double gajiPokok;
        
        // tampilkan output ke layar
        System.out.println("=========Program Tunjangan=========");
        
        System.out.print("Berapa gaji pokok anda perbulan? : Rp.");
        // user memasukkan harga gajiPokok seorang pegawai
        Scanner keyboard_1 = new Scanner(System.in);
        gajiPokok = keyboard_1.nextInt();
        
        System.out.print("Status Anda? (Menikah/Belum)     : ");
        // user memasukkan status seorang pegawai
        Scanner keyboard_2 = new Scanner(System.in);
        status = keyboard_2.nextLine();
        
        System.out.println();
        
        // operasi logika untuk menentukan status seorang pegawai
        switch(status) {
            case ("Menikah") : 
                tunjangan = (0.35 * gajiPokok);
                gajiTotal = (gajiPokok + tunjangan);
                // output hasil dari data yang dimasukkan user
                System.out.println("=========Hasil Perhitungan Gaji Anda=========");
                System.out.println("Gaji Pokok : Rp." + gajiPokok);
                System.out.println("Tunjangan  : Rp." + tunjangan);
                System.out.println("Total Gaji : Rp." + gajiTotal);
                break;
            case "Belum" :
                tunjangan = (0);
                gajiTotal = (gajiPokok + tunjangan);
                // output hasil dari data yang dimasukkan user
                System.out.println("=========Hasil Perhitungan Gaji Anda=========");
                System.out.println("Gaji Pokok : Rp." + gajiPokok);
                System.out.println("Tunjangan  : Rp." + tunjangan);
                System.out.println("Total Gaji : Rp." + gajiTotal);
                System.out.println("Developmed by : Diva Sabila Ramadhan");
                break;
            default:
                System.out.println("Isi Data Yang Benar!!");                 
        }
    }    
}
    
    

