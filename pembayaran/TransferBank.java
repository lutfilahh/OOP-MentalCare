package pembayaran;

public class TransferBank implements MetodePembayaran {
    private String namaBank;

    public TransferBank(String namaBank)  {
        this.namaBank = namaBank;
    }

    @Override
    public boolean bayar(double jumlah) {
        if (jumlah > 0) {
            System.out.println("Transfer ke: " + namaBank + " sebesar Rp: " + jumlah);
            return true;
        }
        return false;
    }
}