package pembayaran;

public class TransferBank extends Pembayaran {
    private String namaBank;

    public TransferBank(double jumlah, String namaBank) {
        super(jumlah);
        this.namaBank = namaBank;
    }

    @Override
    public void prosesBayar() {
        super.prosesBayar();
        System.out.println("Transfer Bank " + namaBank + " sebesar Rp" + jumlah);
    }
}
