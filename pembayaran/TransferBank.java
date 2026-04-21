package pembayaran;

public class TransferBank implements MetodePembayaran {
    private String namaBank;

    public TransferBank(String namaBank)  {
        this.namaBank = namaBank;
    }

    @Override
    public void bayar(double jumlah) {
        System.out.println("Transfer ke: " + namaBank + " sebesar Rp: " + jumlah);
    }
}