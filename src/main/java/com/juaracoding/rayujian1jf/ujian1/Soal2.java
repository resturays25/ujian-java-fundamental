package com.juaracoding.rayujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama film: ");
        String movieName = input.nextLine();
        String upperCaseMovieName = movieName.toUpperCase();

        System.out.println("Nama film dalam huruf besar: " + upperCaseMovieName);

        input.close();
    }
}
