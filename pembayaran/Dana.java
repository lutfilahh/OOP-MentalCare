package pembayaran;

public class Dana implements MetodePembayaran {

    @Override
    public boolean bayar(double jumlah) {
    if (jumlah > 0) {
        System.out.println("Bayar via Dana Rp: " + jumlah);
        return true;
    }
    return false;
}
}