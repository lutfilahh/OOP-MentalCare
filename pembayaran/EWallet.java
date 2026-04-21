package pembayaran;

class EWallet extends Pembayaran {
    private String namaWallet;

    public EWallet(double jumlah, String namaWallet) {
        super(jumlah);
        this.namaWallet = namaWallet;
    }

    @Override
    public void prosesBayar() {
        super.prosesBayar();
        System.out.println("Bayar dengan " + namaWallet + " sebesar Rp" + jumlah);
    }
}
