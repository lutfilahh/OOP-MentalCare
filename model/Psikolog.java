package model;

public class Psikolog extends Pengguna {
    private String spesialis;
    private int umur;

    public Psikolog(int id, String nama, String password, int umur, String spesialis) {
        super(id, nama, password);
        this.umur = umur;
        this.spesialis = spesialis;
    }

    public int getUmur() { 
        return umur; 
    }

    public void setUmur(int umur) {
        if (umur > 0) this.umur = umur;
    }

    public String getSpesialis() { 
        return spesialis; 
    }

    public void setSpesialis(String spesialis) {
        if (spesialis != null && !spesialis.isEmpty()) {
            this.spesialis = spesialis;
        }
    }

    @Override
    public void tampilData() {
        System.out.println("ID Psikolog : " + getId());
        System.out.println("Nama : " + getNama());
        System.out.println("Umur : " + umur);
        System.out.println("Spesialis : " + spesialis);
    }
}