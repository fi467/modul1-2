import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class pob1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jeniskelamin, tanggallahir;

        System.out.print("masukkan nama kamu yang paling cantik: ");
        nama = input.nextLine();

        System.out.print("masukan jenis kelamin :");
        jeniskelamin = input.nextLine();

        System.out.print("masukkan tanggal lahir : ");
        tanggallahir = input.nextLine();
    }
}
