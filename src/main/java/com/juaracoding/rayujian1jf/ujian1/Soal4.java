package com.juaracoding.rayujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] filmList = new String[5];

        System.out.println("Daftar film bioskop");
        for (int i = 0; i < filmList.length; i++) {
            System.out.print("Masukkan nama film " + (i + 1) + ": ");
            filmList[i] = input.nextLine();
        }

        System.out.println("Film yang ingin ditonton:");
        for (int i = 0; i < filmList.length; i++) {
            System.out.println((i + 1) + ". " + filmList[i]);
        }
        input.close();
    }
}
