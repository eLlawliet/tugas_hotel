import java.awt.*;
import java.util.Scanner;
public class startProgram {
    Scanner data = new Scanner(System.in);
    private Pelanggan pbiasa;
    private Vip plbiasa;

    public void mulai(){
        String name, checkin, checkout, tipeKamar, Kartu, noKamar;
        int lama;
        System.out.print("Nama: ");
        name = data.nextLine();
        System.out.print("Lama menginap: ");
        lama = data.nextInt();
        data.nextLine();
        System.out.print("Tanggal Check In: ");
        checkin = data.nextLine();
        System.out.print("Tanggal Check out: ");
        checkout = data.nextLine();
        System.out.print("List Tipe Kamar dan harga: \nStandar: 300000\n" +
                "Superior: 500000\n" +
                "Deluxe: 750000\n" +
                "Suite: 1000000\n" +
                "Presidential: 1500000\n");
        System.out.print("Tipe Kamar: ");
        tipeKamar = data.nextLine();
        System.out.print("Apakah memiliki kartu VIP");
        Kartu = data.nextLine();
        if(Kartu == "IYA") {
            System.out.print("Pilih  Nomor Kamar");
            noKamar = data.nextLine();
        }
        recipt(Kartu, name, checkin, checkout, tipeKamar, noKamar, lama);
    }

    public void recipt(String kartu, String name, String checkin, String checkout, String tipeKamar, String noKamar, int lama){

    }
}
