package pembayaran;

public class Pembayaran {
    protected double jumlah;

    public Pembayaran(double jumlah) {
        this.jumlah = jumlah;
    }

    public void prosesBayar() {
        System.out.println("\nMemproses pembayaran...");
    }
}




