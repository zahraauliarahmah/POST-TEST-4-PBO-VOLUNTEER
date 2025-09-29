/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class Kegiatan {
    private String nama;
    private String tanggal;
    private String lokasi;
    private String penyelenggara;

    public Kegiatan(String nama, String tanggal, String lokasi, String penyelenggara) {
        this.nama = nama;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.penyelenggara = penyelenggara;
    }

    // Getter & Setter (Encapsulation)
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getTanggal() { return tanggal; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }

    public String getLokasi() { return lokasi; }
    public void setLokasi(String lokasi) { this.lokasi = lokasi; }

    public String getPenyelenggara() { return penyelenggara; }
    public void setPenyelenggara(String penyelenggara) { this.penyelenggara = penyelenggara; }

    // Abstract methods (Abstraction)
    public abstract String getJenisKegiatan();
    public abstract String getDeskripsiKhusus();

    @Override
    public String toString() {
        return String.format("=== %s ===\nNama: %s\nTanggal: %s\nLokasi: %s\nPenyelenggara: %s\n%s",
                getJenisKegiatan(), nama, tanggal, lokasi, penyelenggara, getDeskripsiKhusus());
    }

    // Polymorphism (Overloading)
    public String getInfoKegiatan() {
        return "Kegiatan " + nama + " di " + lokasi;
    }

    public String getInfoKegiatan(boolean lengkap) {
        if (lengkap) {
            return String.format("%s | %s | %s | %s", nama, tanggal, lokasi, penyelenggara);
        } else {
            return getInfoKegiatan();
        }
    }
}