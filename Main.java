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

public class Main {
    public static void main(String[] args) {
        psikolog psikolog1 = new psikolog(1, "Dr. Andi", "admin123", 45, "Psikologi Klinis");
        pasien pasien1 = new pasien(101, "Budi", "pasien456", 30, "Stres kerja");

        System.out.println("Data Psikolog:");
        psikolog1.tampilData();

        System.out.println("\nData Pasien:");
        pasien1.tampilData();
    }
}
