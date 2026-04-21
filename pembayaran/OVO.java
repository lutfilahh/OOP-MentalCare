package pembayaran;

public class OVO implements MetodePembayaran {

    @Override
    public void bayar(double jumlah) {
        System.out.println("Bayar via OVO Rp: " + jumlah);
    }
}