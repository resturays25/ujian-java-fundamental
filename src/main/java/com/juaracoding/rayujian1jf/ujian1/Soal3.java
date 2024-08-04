package com.juaracoding.rayujian1jf.ujian1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlahTiket = input.nextInt();

        System.out.print("Apakah hari ini weekday atau weekend? (weekday/weekend): ");
        String hari = input.next();


        int hargaTiket;
        if (hari.equalsIgnoreCase("weekday")) {
            hargaTiket = 35000;
        } else if (hari.equalsIgnoreCase("weekend")) {
            hargaTiket = 45000;
        } else {
            System.out.println("Pengisian Tidak Valid!");
            input.close();
            return;
        }

        int totalHarga = jumlahTiket * hargaTiket;
        if (jumlahTiket > 5) {
            totalHarga = totalHarga - (totalHarga / 10); // diskon 10%
        }
        System.out.println("Total harga tiket: " + totalHarga);

        input.close();
    }
}