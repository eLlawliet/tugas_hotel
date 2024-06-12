public class Vip extends Pelanggan{
    double diskon = 0.1;
    public Vip(int lama) {
        super(lama);
    }

    public double dskn(int lama, int harga) {
        this.lama = lama;
        this.harga = harga;
        double hasil_diskon = (harga * lama) - (this.lama * this.harga * diskon);
        return hasil_diskon;
    }
}
