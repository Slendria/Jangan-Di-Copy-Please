package model;

import java.util.ArrayList;

public class Supplier {
    private String kodeSupplier;
    private String nama;
    private String Alamat;
    private String noTelp;


    public Supplier() {
    }

    public Supplier(String kodeSupplier, String nama, String Alamat, String noTelp) {
        this.kodeSupplier = kodeSupplier;
        this.nama = nama;
        this.Alamat = Alamat;
        this.noTelp = noTelp;
    }

    public String getKodeSupplier() {
        return this.kodeSupplier;
    }

    public void setKodeSupplier(String kodeSupplier) {
        this.kodeSupplier = kodeSupplier;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNoTelp() {
        return this.noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    @Override
    public String toString() {
        return "\n" +
            "Kode Supplier\t = " + getKodeSupplier() + "\n" +
            "Nama\t\t = " + getNama() + "\n" +
            "Alamat\t\t = " + getAlamat() + "\n" +
            "No Telp\t\t = " + getNoTelp();
    }
}
