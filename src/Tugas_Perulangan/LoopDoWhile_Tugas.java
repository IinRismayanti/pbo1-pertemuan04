package Tugas_Perulangan;

import java.util.Scanner;
public class LoopDoWhile_Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, pasword;
        do {//kondisi
            System.out.print("Masukkan username = ");
            username = input.nextLine();
            System.out.print("Masukkan password = ");
            pasword = input.nextLine();

        } while (!(username.equals("iin") && pasword.equals("java")));
        System.out.println("===login berhasil===");
    }
}
