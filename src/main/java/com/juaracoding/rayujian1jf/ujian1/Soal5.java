package com.juaracoding.rayujian1jf.ujian1;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        System.out.println("Masukkan harga tiket untuk 5 film");
        Scanner input = new Scanner(System.in);
        int[] ticketPrices = new int[5];
        for (int i = 0; i < ticketPrices.length; i++) {
            System.out.print("Masukkan harga tiket film " + (i + 1) + ": ");
            ticketPrices[i] = input.nextInt();
        }
        int totalPrice = 0;
        for (int price : ticketPrices) {
            totalPrice += price;
        }
        System.out.println("Total harga tiket dari semua film: " + totalPrice);

        input.close();
    }

}
