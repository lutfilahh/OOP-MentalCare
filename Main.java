class Pengguna {
    private int id;
    private String nama;
    private String password;

    public Pengguna(int id, String nama, String password) {
        this.id = id;
        this.nama = nama;
        this.password = password;
    }

    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getPassword() { return password; }
}

class Psikolog extends Pengguna {
    private String spesialis;
    private int umur;

    public Psikolog(int id, String nama, String password, int umur, String spesialis) {
        super(id, nama, password);
        this.umur = umur;
        this.spesialis = spesialis;
    }

    public void tampilData() {
        System.out.println("ID Psikolog : " + getId());
        System.out.println("Nama : " + getNama());
        System.out.println("Password : " + getPassword());
        System.out.println("Umur : " + umur);
        System.out.println("Spesialis : " + spesialis);
    }
}

class Pasien extends Pengguna {
    private int umur;
    private String keluhan;

    public Pasien(int id, String nama, String password, int umur, String keluhan) {
        super(id, nama, password);
        this.umur = umur;
        this.keluhan = keluhan;
    }

    public void tampilData() {
        System.out.println("ID Pasien : " + getId());
        System.out.println("Nama : " + getNama());
        System.out.println("Password : " + getPassword());
        System.out.println("Umur : " + umur);
        System.out.println("Keluhan : " + keluhan);
    }
}

class Konseling {
    private Psikolog psikolog;
    private Pasien pasien;
    private int idKonseling;
    private String tanggal;
    private boolean status;
    private String hasil;

    public Konseling(int idKonseling, String tanggal, String hasil, Psikolog psikolog, Pasien pasien) {
        this.psikolog = psikolog;
        this.pasien = pasien;
        this.idKonseling = idKonseling;
        this.tanggal = tanggal;
        this.status = false;
        this.hasil = hasil;
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

public class Main {
    public static void main(String[] args) {
        Psikolog psikolog1 = new Psikolog(1, "Dr. Andi", "admin123", 45, "Psikologi Klinis");
        Pasien pasien1 = new Pasien(101, "Budi", "pasien456", 30, "Stres kerja");
        Konseling konseling1 = new Konseling(1001,"2024-06-01","Pasien disarankan istirahat dan terapi lanjutan",psikolog1,pasien1);

        konseling1.tampilKonseling();
    }
}
    

