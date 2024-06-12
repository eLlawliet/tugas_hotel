public class Pelanggan{
    String name;
    int lama;
    String checkin;
    String checkout;
    String tipeKamar;

    public Pelanggan(String name, int lama, String checkin, String checkout, String tipeKamar){
        this.name = name;
        this.lama = lama;
        this.checkin = checkin;
        this.checkout = checkout;
        this.tipeKamar = tipeKamar;
    }

    public int biaya(int lama, int harga){
        int hasil = lama * harga;
        return hasil;
    }

}
