import model.Psikolog;
import model.Pasien;
import model.Konseling;
import pembayaran.Dana;
import pembayaran.MetodePembayaran;
import service.DataViewer;

public class Main {
    public static void main(String[] args) {
        Psikolog psikolog1 = new Psikolog(1, "Dr. Andi", "admin123", 45, "Psikologi Klinis");
        Pasien pasien1 = new Pasien(101, "Budi", "pasien456", 30, "Stres kerja");
        Konseling konseling1 = new Konseling(1001,"2024-06-01","Pasien disarankan istirahat dan terapi lanjutan", psikolog1, pasien1);

        DataViewer.tampilkanSemua(konseling1);

        konseling1.setStatus(true);
        System.out.println("\nStatus setelah update: " + (konseling1.getStatus() ? "Selesai" : "Belum Selesai"));

        System.out.println("\nProses pembayaran: ");
        MetodePembayaran dana1 = new Dana();
        dana1.bayar(500000);
    }
}