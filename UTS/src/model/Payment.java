package model;

import java.util.ArrayList;

public class Payment {
    private int kodePembayaran;
    private long Harga;
    private String itemName;
    private String kodeTransaksi;

    public Payment() {
    }

    public Payment(int kodePembayaran, long Harga, String itemName, String kodeTransaksi) {
        this.kodePembayaran = kodePembayaran;
        this.Harga = Harga;
        this.itemName = itemName;
        this.kodeTransaksi = kodeTransaksi;
    }

    public int getKodePembayaran() {
        return this.kodePembayaran;
    }

    public void setKodePembayaran(int kodePembayaran) {
        this.kodePembayaran = kodePembayaran;
    }

    public long getHarga() {
        return this.Harga;
    }

    public void setHarga(long Harga) {
        this.Harga = Harga;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getKodeTransaksi() {
        return this.kodeTransaksi;
    }

    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }
    @Override
    public String toString() {
        return "\n" +
            "Kode Pembayaran\t= " + getKodePembayaran() + "\n" +
            "Harga\t\t= " + getHarga() + "\n" +
            "Nama Item\t= " + getItemName() + "\n" +
            "Kode Transaksi\t= " + getKodeTransaksi();
    }
}
