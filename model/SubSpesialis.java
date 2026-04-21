package model;

public class SubSpesialis extends Psikolog {
    private String subSpesialis;

    public SubSpesialis(int id, String nama, String password, int umur, String spesialis, String subSpesialis) {
        super(id, nama, password, umur, spesialis);
        this.subSpesialis = subSpesialis;
    }

    public String getSubSpesialis() { return subSpesialis; }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Subspesialis  : " + subSpesialis);
    }
}
