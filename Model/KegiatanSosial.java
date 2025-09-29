/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class KegiatanSosial extends Kegiatan implements InfoKegiatan {
    public KegiatanSosial(String nama, String tanggal, String lokasi, String penyelenggara) {
        super(nama, tanggal, lokasi, penyelenggara);
    }

    @Override
    public String getJenisKegiatan() { return "KEGIATAN SOSIAL"; }

    @Override
    public String getDeskripsiKhusus() { return "Kegiatan sosial untuk membantu masyarakat"; }

    @Override
    public void tampilkanRingkas() {
        System.out.println("[SOSIAL] " + getNama() + " - " + getLokasi());
    }
}