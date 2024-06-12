public class Pelanggan{
    int lama;
    int harga;

    public Pelanggan(int lama) {
        this.lama = lama;
    }
    public int biaya(int lama, int harga){
        this.lama = lama;
        this.harga = harga;
        int hasil = this.lama * this.harga;
        return hasil;
    }

}
