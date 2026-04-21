package pembayaran;

public class Dana implements MetodePembayaran {

    @Override
    public void bayar(double jumlah) {
        System.out.println("Bayar via Dana Rp: " + jumlah);
    }
}