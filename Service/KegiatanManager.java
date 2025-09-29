/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class KegiatanManager {
    private ArrayList<Kegiatan> daftarKegiatan = new ArrayList<>();
    private Scanner in = new Scanner(System.in);

    public void tambahKegiatan() {
        System.out.println("\n=== Tambah Kegiatan Baru ===");
        System.out.println("1. Kegiatan Sosial");
        System.out.println("2. Kegiatan Edukasi");
        System.out.print("Pilih jenis kegiatan: ");
        int jenis = validasiInputInteger(1, 2);

        System.out.print("Nama kegiatan: ");
        String nama = in.nextLine();
        System.out.print("Tanggal (dd/mm/yyyy): ");
        String tanggal = in.nextLine();
        System.out.print("Lokasi: ");
        String lokasi = in.nextLine();
        System.out.print("Penyelenggara: ");
        String penyelenggara = in.nextLine();

        if (jenis == 1) {
            daftarKegiatan.add(new KegiatanSosial(nama, tanggal, lokasi, penyelenggara));
        } else {
            daftarKegiatan.add(new KegiatanEdukasi(nama, tanggal, lokasi, penyelenggara));
        }

        System.out.println("\nKegiatan berhasil ditambahkan!");
    }

    public void lihatKegiatan() {
        if (daftarKegiatan.isEmpty()) {
            System.out.println("Belum ada kegiatan yang terdaftar.");
            return;
        }

        System.out.println("\nDAFTAR KEGIATAN TERDAFTAR");
        System.out.println("=".repeat(50));
        for (int i = 0; i < daftarKegiatan.size(); i++) {
            System.out.println((i + 1) + ". " + daftarKegiatan.get(i));
            System.out.println("Info: " + daftarKegiatan.get(i).getInfoKegiatan(true));
            System.out.println("-".repeat(50));
        }
    }

    public void updateKegiatan() {
        lihatKegiatan();
        if (daftarKegiatan.isEmpty()) return;

        System.out.print("Pilih nomor kegiatan yang ingin diupdate: ");
        int index = validasiInputInteger(1, daftarKegiatan.size());
        Kegiatan kegiatan = daftarKegiatan.get(index - 1);

        System.out.println("\n=== Update Kegiatan ===");
        System.out.print("Nama baru (" + kegiatan.getNama() + "): ");
        String nama = in.nextLine();
        if (!nama.isEmpty()) kegiatan.setNama(nama);

        System.out.print("Tanggal baru (" + kegiatan.getTanggal() + "): ");
        String tanggal = in.nextLine();
        if (!tanggal.isEmpty()) kegiatan.setTanggal(tanggal);

        System.out.print("Lokasi baru (" + kegiatan.getLokasi() + "): ");
        String lokasi = in.nextLine();
        if (!lokasi.isEmpty()) kegiatan.setLokasi(lokasi);

        System.out.print("Penyelenggara baru (" + kegiatan.getPenyelenggara() + "): ");
        String penyelenggara = in.nextLine();
        if (!penyelenggara.isEmpty()) kegiatan.setPenyelenggara(penyelenggara);

        System.out.println("Kegiatan berhasil diupdate!");
    }

    public void hapusKegiatan() {
        lihatKegiatan();
        if (daftarKegiatan.isEmpty()) return;

        System.out.print("Pilih nomor kegiatan yang ingin dihapus: ");
        int index = validasiInputInteger(1, daftarKegiatan.size());
        System.out.println("Menghapus: " + daftarKegiatan.get(index - 1).getNama());
        daftarKegiatan.remove(index - 1);
        System.out.println("Kegiatan berhasil dihapus!");
    }

    public void cariKegiatan() {
        System.out.println("\nPENCARIAN KEGIATAN");
        System.out.println("1. Cari berdasarkan nama");
        System.out.println("2. Cari berdasarkan jenis kegiatan");
        System.out.println("3. Cari berdasarkan lokasi");
        System.out.print("Pilih metode pencarian: ");
        int metode = validasiInputInteger(1, 3);

        boolean ditemukan = false;

        if (metode == 1) {
            System.out.print("Masukkan kata kunci nama: ");
            String keyword = in.nextLine().toLowerCase();
            for (Kegiatan kegiatan : daftarKegiatan) {
                if (kegiatan.getNama().toLowerCase().contains(keyword)) {
                    System.out.println("\n" + kegiatan);
                    ditemukan = true;
                }
            }
        } else if (metode == 2) {
            System.out.println("1. Kegiatan Sosial");
            System.out.println("2. Kegiatan Edukasi");
            System.out.print("Pilih jenis: ");
            int jenis = validasiInputInteger(1, 2);
            for (Kegiatan kegiatan : daftarKegiatan) {
                if ((jenis == 1 && kegiatan instanceof KegiatanSosial) ||
                    (jenis == 2 && kegiatan instanceof KegiatanEdukasi)) {
                    System.out.println("\n" + kegiatan);
                    ditemukan = true;
                }
            }
        } else if (metode == 3) {
            System.out.print("Masukkan kata kunci lokasi: ");
            String lokasi = in.nextLine().toLowerCase();
            for (Kegiatan kegiatan : daftarKegiatan) {
                if (kegiatan.getLokasi().toLowerCase().contains(lokasi)) {
                    System.out.println("\n" + kegiatan);
                    ditemukan = true;
                }
            }
        }

        if (!ditemukan) {
            System.out.println("Kegiatan tidak ditemukan.");
        }
    }

    private int validasiInputInteger(int min, int max) {
        int nilai;
        while (true) {
            if (in.hasNextInt()) {
                nilai = in.nextInt();
                in.nextLine();
                if (nilai >= min && nilai <= max) {
                    break;
                } else {
                    System.out.print("Input harus antara " + min + " dan " + max + ". Coba lagi: ");
                }
            } else {
                System.out.print("Input harus berupa angka. Coba lagi: ");
                in.nextLine();
            }
        }
        return nilai;
    }
}