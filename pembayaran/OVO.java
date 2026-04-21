package pembayaran;

public class OVO implements MetodePembayaran {

    @Override
    public boolean bayar(double jumlah) {
    if (jumlah > 0) {
        System.out.println("Bayar via OVO Rp: " + jumlah);
        return true;
    }
    return false;
}
}