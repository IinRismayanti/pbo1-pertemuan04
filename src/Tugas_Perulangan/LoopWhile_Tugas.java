package Tugas_Perulangan;

import java.util.Scanner;
public class LoopWhile_Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan username = ");
        String username = input.nextLine();
        System.out.print("Masukkan pasword = ");
        String pasword = input.nextLine();

        while (!(username.equals("iin") && pasword.equals("java"))) {//kondisi
            System.out.print("Masukkan username = ");
            username = input.nextLine();
            System.out.print("Masukkan pasword = ");
            pasword = input.nextLine();

        }
        System.out.println("===login berhasil===");
    }
}




