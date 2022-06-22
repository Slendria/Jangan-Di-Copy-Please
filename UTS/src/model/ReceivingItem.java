package model;

import java.util.ArrayList;

public class ReceivingItem 
{
    private String kodeReceiving;
    private int kuantitiTerima;
    private long hargaSatuan;
    private long total;

    public ReceivingItem() {
    }

    public ReceivingItem(String kodeReceiving, int kuantitiTerima, long hargaSatuan, long total) {
        this.kodeReceiving = kodeReceiving;
        this.kuantitiTerima = kuantitiTerima;
        this.hargaSatuan = hargaSatuan;
        this.total = total;
    }

    public String getKodeReceiving() {
        return this.kodeReceiving;
    }

    public void setKodeReceiving(String kodeReceiving) {
        this.kodeReceiving = kodeReceiving;
    }

    public int getKuantitiTerima() {
        return this.kuantitiTerima;
    }

    public void setKuantitiTerima(int kuantitiTerima) {
        this.kuantitiTerima = kuantitiTerima;
    }

    public long getHargaSatuan() {
        return this.hargaSatuan;
    }

    public void setHargaSatuan(long hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(long total) {
        this.total = total;
    }


    @Override
    public String toString() {
        return "\n" +
            "Kode Receiving\t= " + getKodeReceiving() + "\n" +
            "Kuantiti Terima\t= " + getKuantitiTerima() + "\n" +
            "Harga Satuan\t= " + getHargaSatuan() + "\n" +
            "Total\t\t= " + getTotal();
    }
    
}

