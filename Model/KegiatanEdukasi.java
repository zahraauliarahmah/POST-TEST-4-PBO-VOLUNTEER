/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class KegiatanEdukasi extends Kegiatan implements InfoKegiatan {
    public KegiatanEdukasi(String nama, String tanggal, String lokasi, String penyelenggara) {
        super(nama, tanggal, lokasi, penyelenggara);
    }

    @Override
    public String getJenisKegiatan() { return "KEGIATAN EDUKASI"; }

    @Override
    public String getDeskripsiKhusus() { return "Kegiatan edukasi untuk pembelajaran"; }

    @Override
    public void tampilkanRingkas() {
        System.out.println("[EDUKASI] " + getNama() + " - " + getLokasi());
    }
}
