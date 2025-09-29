/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Scanner;
import service.KegiatanManager;

public class MainKegiatan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        KegiatanManager manager = new KegiatanManager();

        System.out.println("Selamat datang di Sistem Manajemen Kegiatan Sosial v3.0!");
        System.out.println("Program ini menerapkan OOP: Encapsulation, Inheritance, Abstraction, Polymorphism");

        int pilih = 0;
        while (pilih != 6) {
            System.out.println("\n" + "=".repeat(45));
            System.out.println("SISTEM MANAJEMEN KEGIATAN SOSIAL");
            System.out.println("=".repeat(45));
            System.out.println("1. Tambah Kegiatan");
            System.out.println("2. Lihat Kegiatan");
            System.out.println("3. Update Kegiatan");
            System.out.println("4. Hapus Kegiatan");
            System.out.println("5. Cari Kegiatan");
            System.out.println("6. Keluar");
            System.out.println("=".repeat(45));
            System.out.print("Pilih menu (1-6): ");

            if (in.hasNextInt()) {
                pilih = in.nextInt();
                in.nextLine();

                if (pilih == 1) {
                    manager.tambahKegiatan();
                } else if (pilih == 2) {
                    manager.lihatKegiatan();
                } else if (pilih == 3) {
                    manager.updateKegiatan();
                } else if (pilih == 4) {
                    manager.hapusKegiatan();
                } else if (pilih == 5) {
                    manager.cariKegiatan();
                } else if (pilih == 6) {
                    System.out.println("\nTerima kasih telah menggunakan sistem ini!");
                    System.out.println("Program berhasil mendemonstrasikan:");
                    System.out.println("   - Encapsulation: Private fields + Getter/Setter");
                    System.out.println("   - Inheritance: Kegiatan -> KegiatanSosial, KegiatanEdukasi");
                    System.out.println("   - Abstraction: Kegiatan (abstract class) + InfoKegiatan (interface)");
                    System.out.println("   - Overriding: getJenisKegiatan(), getDeskripsiKhusus()");
                    System.out.println("   - Overloading: getInfoKegiatan() dengan parameter berbeda");
                    System.out.println("   - Polymorphism: objek Kegiatan bisa berupa Sosial/Edukasi");
                    System.out.println("Program selesai.");
                } else {
                    System.out.println("Menu tidak valid, silakan pilih 1-6.");
                }
            } else {
                System.out.println("Input tidak valid! Silakan masukkan angka.");
                in.nextLine();
            }
        }
        in.close();
    }
}
