package model;

public class Pasien extends Pengguna {
    private int umur;
    private String keluhan;

    public Pasien(int id, String nama, String password, int umur, String keluhan) {
        super(id, nama, password);
        this.umur = umur;
        this.keluhan = keluhan;
    }

    public int getUmur() { 
        return umur; 
    }

    public void setUmur(int umur) {
        if (umur > 0) this.umur = umur;
    }

    public String getKeluhan() { 
        return keluhan; 
    }

    public void setKeluhan(String keluhan) {
        if (keluhan != null && !keluhan.isEmpty()) {
            this.keluhan = keluhan;
        }
    }

    @Override
    public void tampilData() {
        System.out.println("ID Pasien : " + getId());
        System.out.println("Nama : " + getNama());
        System.out.println("Umur : " + umur);
        System.out.println("Keluhan : " + keluhan);
    }
}
