import model.Psikolog;
import model.Pasien;
import model.Konseling;
import pembayaran.TransferBank;

public class Main {
    public static void main(String[] args) {
        Psikolog psikolog1 = new Psikolog(1, "Dr. Andi", "admin123", 45, "Psikologi Klinis");
        Pasien pasien1 = new Pasien(101, "Budi", "pasien456", 30, "Stres kerja");
        Konseling konseling1 = new Konseling(1001,"2024-06-01","Pasien disarankan istirahat dan terapi lanjutan", psikolog1, pasien1);

        konseling1.tampilKonseling();

        konseling1.setStatus(true);
        System.out.println("\nStatus setelah update: " + (konseling1.getStatus() ? "Selesai" : "Belum Selesai"));

        TransferBank pembayaran1 = new TransferBank(500000, "BCA");
        pembayaran1.prosesBayar();
    }
}