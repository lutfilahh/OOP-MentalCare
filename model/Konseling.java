package model;

public class Konseling implements Tampilkan {
    private Psikolog psikolog;
    private Pasien pasien;
    private int idKonseling;
    private String tanggal;
    private boolean status;
    private String hasil;

    public Konseling(int idKonseling, String tanggal, String hasil, Psikolog psikolog, Pasien pasien) {
        this.idKonseling = idKonseling;
        this.tanggal = tanggal;
        this.psikolog = psikolog;
        this.pasien = pasien;
        this.status = false;
        this.hasil = hasil;
    }

    public int getIdKonseling() { 
        return idKonseling; 
    }

    public void setIdKonseling(int idKonseling) {
        if (idKonseling > 0) 
            this.idKonseling = idKonseling;
    }

    public String getTanggal() { 
        return tanggal; 
    }

    public void setTanggal(String tanggal) {
        if (tanggal != null && !tanggal.isEmpty()) {
            this.tanggal = tanggal;
        }
    }

    public boolean getStatus() { 
        return status; 
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getHasil() { 
        return hasil; 
    }

    public void setHasil(String hasil) {
        if (hasil != null && !hasil.isEmpty()) {
            this.hasil = hasil;
        }
    }

    public void tampilKonseling() {
        System.out.println("========== SESI KONSELING ==========");
        System.out.println("ID Konseling : " + idKonseling);
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Status : " + (status ? "Selesai" : "Belum Selesai"));
        System.out.println("Hasil : " + hasil);

        System.out.println("\n--- Data Psikolog ---");
        psikolog.tampilData();

        System.out.println("\n--- Data Pasien ---");
        pasien.tampilData();
    }
}
