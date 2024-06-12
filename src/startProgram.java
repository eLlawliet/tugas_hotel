import java.awt.*;
import java.util.Objects;
import java.util.Scanner;
public class startProgram {
    Scanner data = new Scanner(System.in);
    private Pelanggan pbiasa;
    private Vip plbiasa;

    public void mulai() {
        String name, checkin, checkout, tipeKamar, Kartu;
        int lama, noKamar = (int) (Math.random() * 100);
        System.out.print("Nama: ");
        name = data.nextLine();
        System.out.print("Lama menginap: ");
        lama = data.nextInt();
        data.nextLine();
        System.out.print("Tanggal Check In: ");
        checkin = data.nextLine();
        System.out.print("Tanggal Check out: ");
        checkout = data.nextLine();
        System.out.println("Apakah memiliki kartu VIP (IYA/TIDAK)?");
        Kartu = data.nextLine();
        if (Objects.equals(Kartu.toUpperCase(), "IYA")) {
            plbiasa = new Vip(lama);
            System.out.print("List Tipe Kamar dan harga: \nStandar: 300000\n" +
                    "Superior: 500000\n" +
                    "Deluxe: 750000\n" +
                    "Suite: 1000000\n" +
                    "Presidential: 1500000\n");
            System.out.print("Tipe Kamar: ");
            tipeKamar = data.nextLine().toUpperCase();
            System.out.print("Pilih  Nomor Kamar: ");
            noKamar = data.nextInt();
        } else {
            pbiasa = new Pelanggan(lama);
            System.out.print("List Tipe Kamar dan harga: \nStandar: 300000\n" +
                            "Superior: 500000\n" +
                            "Deluxe: 750000\n");
            System.out.print("Tipe Kamar: ");
            tipeKamar = data.nextLine().toUpperCase();
        }
        recipt(Kartu, name, checkin, checkout, tipeKamar, noKamar, lama);
    }

    public void recipt(String kartu, String name, String checkin, String checkout, String tipeKamar, int noKamar, int lama) {
        System.out.println("============================");
        System.out.println("Nama Pemesan     : " + name);
        System.out.println("Tanggal Check in : " + checkin);
        System.out.println("Tanggal Check out: " + checkout);
        System.out.println("============================");
        System.out.println("Nomor Kamar      : " + noKamar);
        System.out.println("Tipe Kamar       : " + tipeKamar);
        if (Objects.equals(kartu.toUpperCase(), "IYA")) {
            switch (tipeKamar) {
                case "STANDAR":
                    System.out.println("Total Harga      : " + plbiasa.dskn(lama, 300000));
                    break;
                case "SUPERIOR":
                    System.out.println("Total Harga      : " + plbiasa.dskn(lama, 500000));
                    break;
                case "DELUXE":
                    System.out.println("Total Harga      : " + plbiasa.dskn(lama, 750000));
                    break;
                case "SUITE":
                    System.out.println("Total Harga      : " + plbiasa.dskn(lama, 1000000));
                    break;
                case "PRESIDENTIAL":
                    System.out.println("Total Harga      : " + plbiasa.dskn(lama, 1500000));
                    break;
            }
        } else {
            switch (tipeKamar) {
                case "STANDAR":
                    System.out.println("Total Harga      : " + pbiasa.biaya(lama, 300000));
                    break;
                case "SUPERIOR":
                    System.out.println("Total Harga      : " + pbiasa.biaya(lama, 500000));
                    break;
                case "DELUXE":
                    System.out.println("Total Harga      : " + pbiasa.biaya(lama, 750000));
                    break;
                case "SUITE":
                    System.out.println("Total Harga      : " + pbiasa.biaya(lama, 1000000));
                    break;
                case "PRESIDENTIAL":
                    System.out.println("Total Harga      : " + pbiasa.biaya(lama, 1500000));
                    break;

            }
        }
    }
}