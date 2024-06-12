public class Vip extends Pelanggan{
    private double diskon = 0.1;
    private int noKamar;
    public Vip(String name, int lama, String checkin, String checkout, String tipeKamar) {
        super(name, lama, checkin, checkout, tipeKamar);
    }

    public double dskn(int lama, int harga, double diskon) {
        double hasil_diskon = (lama * harga * diskon);
        return hasil_diskon;
    }
}
