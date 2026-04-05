class Pengguna {
    private int id;
    private String nama;
    private String password;

    public Pengguna(int id, String nama, String password) {
        this.id = id;
        this.nama = nama;
        this.password = password;
    }

    public void setId(int id) {
        if (id > 0) this.id = id;
    }
    
    public void setNama(String nama) {
        if (nama != null && !nama.isEmpty()) {
            this.nama = nama;
        }
    }
    
    public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
        }
    }
    
    public int getId() { 
        return id; 
    }

    public String getNama() { 
        return nama; 
    }

    public String getPassword() { 
        return password; 
    }

    
    public void tampilData() {
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
    }
}

class Psikolog extends Pengguna {
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

class Pasien extends Pengguna {
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

class Konseling {
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

    public boolean isStatus() { 
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

public class Main {
    public static void main(String[] args) {
        Psikolog psikolog1 = new Psikolog(1, "Dr. Andi", "admin123", 45, "Psikologi Klinis");
        Pasien pasien1 = new Pasien(101, "Budi", "pasien456", 30, "Stres kerja");

        Konseling konseling1 = new Konseling(1001,"2024-06-01","Pasien disarankan istirahat dan terapi lanjutan", psikolog1, pasien1);

        konseling1.tampilKonseling();

        konseling1.setStatus(true);
        System.out.println("\nStatus setelah update: " +
                (konseling1.isStatus() ? "Selesai" : "Belum Selesai"));
    }
}