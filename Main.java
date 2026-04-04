class pengguna {
    protected int id;
    protected String nama;
    protected String password;

    public pengguna(int id, String nama, String password) {
        this.id = id;
        this.nama = nama;
        this.password = password;
    }
}

class psikolog extends pengguna {
    protected String spesialis;
    protected int umur;

    public psikolog(int id, String nama, String password, int umur, String spesialis) {
        super(id, nama, password);
        this.umur = umur;
        this.spesialis = spesialis;
    }

    public void tampilData() {
        System.out.println("ID Psikolog : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("Password : " + password);
        System.out.println("Umur : " + umur);
        System.out.println("Spesialis : " + spesialis);
    }
}

class pasien extends pengguna {
    protected int umur;
    protected String keluhan;

    public pasien(int id, String nama, String password, int umur, String keluhan) {
        super(id, nama, password);
        this.umur = umur;
        this.keluhan = keluhan;
    }

    public void tampilData() {
        System.out.println("ID Pasien : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("Password : " + password);
        System.out.println("Umur : " + umur);
        System.out.println("Keluhan : " + keluhan);
    }
}

class koseling {
    private psikolog psikolog;
    private pasien pasien;
    private int idKonseling;
    private String tanggal;
    private boolean status;

    public koseling(int idKonseling, String tanggal, String hasil, psikolog psikolog, pasien pasien) {
        this.idKonseling = idKonseling;
        this.tanggal = tanggal;
        this.psikolog = psikolog;
        this.pasien = pasien;
        this.status = false;
    }


    public void tampilKonseling() {
        System.out.println("========== SESI KONSELING ==========");
        System.out.println("ID Konseling : " + idKonseling);
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Status : " + (status ? "Selesai" : "Belum Selesai"));
        System.out.println("\n--- Data Psikolog ---");
        psikolog.tampilData();
        System.out.println("\n--- Data Pasien ---");
        pasien.tampilData();
    }
}

public class Main {
    public static void main(String[] args) {
        psikolog psikolog1 = new psikolog(1, "Dr. Andi", "admin123", 45, "Psikologi Klinis");
        pasien pasien1 = new pasien(101, "Budi", "pasien456", 30, "Stres kerja");
        koseling konseling1 = new koseling(1001, "2024-06-01", "Hasil Konseling", psikolog1, pasien1);

        konseling1.tampilKonseling();
    }
}
    

