import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*; 

import javax.naming.InitialContext;
import javax.swing.InputMap;

import model.Employee;
import model.Item;
import model.Payment;
import model.ReceivingItem;
import model.Supplier;

public class Receiving 
{
    public static ArrayList <Employee> initEmployees(ArrayList <Employee> employees)
    {   
        Employee emp1 = new Employee("01F0001", "Felicia", " Jalan Hati no 69 ");
        employees.add(emp1);
        Employee emp2 = new Employee("01F0002", "Vania", " Jalan Kolong no 1B ");
        employees.add(emp2);
        Employee emp3 = new Employee("01M0003", "Samuel", " Jalan Jomblo no 0 ");
        employees.add(emp3);
        Employee emp4 = new Employee("01M0004", "Kepin", " Jalan Sekip 20 ");
        employees.add(emp4);
        Employee emp5 = new Employee("01F0005", "Kaori", " Jalan Cicak no 01 ");
        employees.add(emp5);
        Employee emp6 = new Employee("01M0006", "Ace", " Jalan Donat no 30 ");
        employees.add(emp6);
        Employee emp7 = new Employee("01M0007", "Justin", " Jalan Kodok no 44 ");
        employees.add(emp7);
        Employee emp8 = new Employee("01F0008", "Shinobu", " Jalan Mayat no 9 ");
        employees.add(emp8);
        Employee emp9 = new Employee("01F0009", "Zakaria", " Jalan Kesedihan no 82 ");
        employees.add(emp9);
        Employee emp10 = new Employee("01M0010", "Nico", " Jalan Lombok no 55 ");
        employees.add(emp10);
        return employees;
    }
    public static ArrayList <Item> initItems(ArrayList <Item> item)
    { 
        Item itm1 = new Item("itm001", "Sapu", "Alat rumah tangga", 1000);
        item.add(itm1);
        Item itm2 = new Item("itm002", "Ember", "Alat rumah tangga", 2000);
        item.add(itm2);
        Item itm3 = new Item("itm003", "Mobil", "Kendaraan", 100);
        item.add(itm3);
        Item itm4 = new Item("itm004", "Truk", "Kendaraan", 50);
        item.add(itm4);
        Item itm5 = new Item("itm005", "Panadol", "Obat-obatan", 10000);
        item.add(itm5);
        Item itm6 = new Item("itm006", "TV", "Elektronik", 300);
        item.add(itm6);
        Item itm7 = new Item("itm007", "Pel", "Alat rumah tangga", 1000);
        item.add(itm7);
        Item itm8 = new Item("itm008", "Handphone", "Elektronik", 400);
        item.add(itm8);
        Item itm9 = new Item("itm009", "Piano", "Alat musik", 70);
        item.add(itm9);
        Item itm10 = new Item("itm010", "Gitar", "Alat musik", 100);
        item.add(itm10);
        return item;
    }
    public static ArrayList <Payment> initPayments(ArrayList <Payment> payment)
    {   
        Payment pmt1 = new Payment(101, 10000000, "Sapu", "00100S"); //
        payment.add(pmt1);
        Payment pmt2 = new Payment(202, 1000000, "Ember", "00200E");
        payment.add(pmt2);
        Payment pmt3 = new Payment(303, 500000, "Sapu", "00100");
        payment.add(pmt3);
        Payment pmt4 = new Payment(404, 2000000, "Ember", "00100");
        payment.add(pmt4);
        Payment pmt5 = new Payment(505, 10000000, "Sapu", "00100S");
        payment.add(pmt5);
        Payment pmt6 = new Payment(606, 1000000, "Ember", "00200E");
        payment.add(pmt6);
        Payment pmt7 = new Payment(707, 500000, "Sapu", "00100");
        payment.add(pmt7);
        Payment pmt8 = new Payment(808, 2000000, "Ember", "00100");
        payment.add(pmt8);
        Payment pmt9 = new Payment(909, 10000000, "Sapu", "00100S");
        payment.add(pmt9);
        Payment pmt10 = new Payment(10010, 1000000, "Ember", "00200E");
        payment.add(pmt10);
        return payment;
    }
    public static ArrayList <ReceivingItem> initReceivingItems(ArrayList <ReceivingItem> receivingItems)
    { 
        ReceivingItem rcv1 = new ReceivingItem("001", 100000, 15000, 101000);
        receivingItems.add(rcv1);
        ReceivingItem rcv2 = new ReceivingItem("002", 150000, 15000, 152000);
        receivingItems.add(rcv2);
        ReceivingItem rcv3 = new ReceivingItem("003", 10000, 250000000, 10100);
        receivingItems.add(rcv3);
        ReceivingItem rcv4 = new ReceivingItem("004", 10000, 15000, 10050);
        receivingItems.add(rcv4);
        ReceivingItem rcv5 = new ReceivingItem("005", 5000000, 15000, 5010000);
        receivingItems.add(rcv5);
        ReceivingItem rcv6 = new ReceivingItem("006", 10000, 15000, 10300);
        receivingItems.add(rcv6);
        ReceivingItem rcv7 = new ReceivingItem("007", 10000, 15000, 11000);
        receivingItems.add(rcv7);
        ReceivingItem rcv8 = new ReceivingItem("008", 10000, 15000, 10400);
        receivingItems.add(rcv8);
        ReceivingItem rcv9 = new ReceivingItem("009", 70, 15000, 140);
        receivingItems.add(rcv9);
        ReceivingItem rcv10 = new ReceivingItem("010", 1000, 1500000, 1100);
        receivingItems.add(rcv10);
        
        return receivingItems;
    }
    public static ArrayList <Supplier> initSuppliers(ArrayList <Supplier> supplier)
    {
        Supplier spl1 = new Supplier (" SPL001 ", " ShadowLuar ", " Jalan Kuda 201 ", " 0819982030 ");
        supplier.add(spl1);
        Supplier spl2 = new Supplier(" SPL002 ", " Salted Egg ", " Jalan Tikus 23 ", "0816665332");
        supplier.add(spl2);
        Supplier spl3 = new Supplier (" SPL003 ", " Slenderman ", " Jalan Hantu 111 ", " 0812184261 ");
        supplier.add(spl3);
        Supplier spl4 = new Supplier (" SPL004 ", " Ayap ", " Jalan Harimau 45 ", " 0813123561 ");
        supplier.add(spl4);
        Supplier spl5 = new Supplier (" SPL005 ", " Minato ", " Jalan Pokemon 99 ", " 0811319657 ");
        supplier.add(spl5);
        Supplier spl6 = new Supplier (" SPL006 ", " Bayu ", " Jalan Wibu 1112 ", " 0819214004 ");
        supplier.add(spl6);
        Supplier spl7 = new Supplier (" SPL007 ", " Rexo ", " Jalan Kodok 6 ", " 0818215592 ");
        supplier.add(spl7);
        Supplier spl8 = new Supplier (" SPL008 ", " Kana ", " Jalan Jerapah 190 ", " 0812131268 ");
        supplier.add(spl8);
        Supplier spl9 = new Supplier (" SPL009 ", " Acai ", " Jalan Jones 75 ", " 0812112781 ");
        supplier.add(spl9);
        Supplier spl10 = new Supplier (" SPL0010 ", " Cap Cai ", " Jalan Kenyang 61 ", " 0812577829 ");
        supplier.add(spl10);
        return supplier;
    }    

    public static void main(String[] args) throws Exception 
    {
        ArrayList <Employee> employees = new ArrayList <Employee>();
        ArrayList <ReceivingItem> receivingItems = new ArrayList <ReceivingItem>();
        ArrayList <Supplier> supplier = new ArrayList <Supplier>();
        ArrayList <Item> item = new ArrayList <Item>();
        ArrayList <Payment> payment = new ArrayList <Payment>();
    

        initEmployees(employees);
        initItems(item);
        initPayments(payment);
        initReceivingItems(receivingItems);
        initSuppliers(supplier);

        Scanner input = new Scanner(System.in);
        String yn="y";
        do{
            menu();
            
    
            int pilihan = 0;
            pilihan = input.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.flush();
    
            if(pilihan==1)
            {
                String yn1="y";
                do{
                    menuPegawai();
    
                    int pilihanpgw = 0;
                    pilihanpgw = input.nextInt();
    
                    if(pilihanpgw==1)//tambah data pegawai
                    {
                        String kode_pegawai;
                        String nama_pegawai;
                        String alamat;
    
                        System.out.print("Kode pegawai \t:\t");
                        kode_pegawai=input.next();
                        System.out.print("Nama pegawai \t:\t");
                        nama_pegawai=input.next();
                        System.out.print("alamat \t\t:\t");
                        alamat=input.next();
    
                        employees.add(new Employee(kode_pegawai, nama_pegawai, alamat));
                        System.out.println("Data Berhasil Ditambahkan");

                    }
    
                    else if(pilihanpgw==2)//tampilkan data pegawai
                    {
                        cetakDataPegawai(employees);;
                    }
    
                    else if(pilihanpgw==3)//keluar
                    {
                        break;
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("Apakah anda ingin kembali ke menu Data Pegawai (y/n): ");
                    yn1=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn1.equalsIgnoreCase("y"));
                
            }
    
            else if(pilihan==2)
            {
                String yn2="y";
                do{
                    menuBarangyangDiterima();;
    
                    int pilihanprm = 0;
                    pilihanprm = input.nextInt();
    
                    if(pilihanprm==1)//tambah data penerimaa
                    {
                        String kodeReceiving;
                        int kuantitiTerima;
                        long hargaSatuan;
                        long total;
    
                        System.out.print("Kode penerimaan \t:\t");
                        kodeReceiving=input.next();
                        System.out.print("Kuantitas Terima \t:\t");
                        kuantitiTerima=input.nextInt();
                        System.out.print("Harga Satuan\t\t:\t");
                        hargaSatuan=input.nextLong();
                        System.out.print("Total Pembayaran \t:\t");
                        total=input.nextLong();
    
                        receivingItems.add(new ReceivingItem(kodeReceiving, kuantitiTerima, hargaSatuan, total));
                        System.out.println("Data Berhasil Ditambahkan");
                    }
    
                    else if(pilihanprm==2)//tampilkan data penerimaan
                    {
                        cetakBuktiTerimaBarang(receivingItems);
                    }    
                    else if (pilihanprm==3)//histori data barang yang diterima
                    {
                        historipenerimaanbrg(receivingItems);
                    }
                    else if(pilihanprm==4)//keluar
                    {
                        break;
                    }
                    else{
                        continue;
                    }
                    System.out.print("Apakah anda ingin kembali ke menu Penerimaan (y/n): ");
                    yn2=input.next();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
                while(yn2.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==3)//barang
            {
                String yn3="y";
                do{
                    menuBarang();
    
                    int pilihanmnbrg = 0;
                    pilihanmnbrg = input.nextInt();
    
                    if(pilihanmnbrg==1)//tambah data barang
                    {
                        String kodeItem;
                        String namaItem;
                        String Kategori;
                        int stock;

                        System.out.print("Kode barang \t\t:\t");
                        kodeItem=input.next();
                        System.out.print("Nama barang \t\t:\t");
                        namaItem =input.next();
                        System.out.print("kategori barang \t:\t");
                        Kategori=input.next();
                        System.out.print("Stok \t\t\t:\t");
                        stock=input.nextInt();
    
                        item.add(new Item(kodeItem, namaItem, Kategori, stock));
                        System.out.println("Data Berhasil Ditambahkan");
                    }
                    else if(pilihanmnbrg==2)//tampilkan data barang
                    {
                        cetakDataBarang(item);
                    }
                    else if (pilihanmnbrg==3)//Data barang yang paling sering diterima
                    {
                        penerimaanbarangterbanyak(item);
                    }
                    else if(pilihanmnbrg==4)//keluar
                    {
                        break;
                    }
                    else{
                        continue;
                    }
    
                    System.out.print("Apakah anda ingin kembali ke menu Barang (y/n): ");
                    yn3=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn3.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==4)//supplier
            {
                String yn5="y";
                do{
                    menuSupplier();
    
                    int pilihanspl = 0;
                    pilihanspl = input.nextInt();
    
                    if(pilihanspl==1)//tambah data supplier
                    {
                        String kodeSupplier;
                        String nama;
                        String Alamat;
                        String noTelp;
    
                        System.out.print("Kode supplier \t\t:\t");
                        kodeSupplier=input.next();
                        System.out.print("Nama supplier \t\t:\t");
                        nama=input.next();
                        System.out.print("Alamat supplier \t:\t");
                        Alamat=input.next();
                        System.out.print("Nomor telepon \t\t:\t");
                        noTelp=input.next();
    
                        supplier.add(new Supplier(kodeSupplier, nama, Alamat, noTelp));
                        System.out.println("Data Berhasil Ditambahkan");
                    }
                    else if(pilihanspl==2)//tampilkan data supplier
                    {
                        cetakDataSupplier(supplier);
                    }
    
                    else if(pilihanspl==3)//keluar
                    {
                        break;
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("Apakah anda ingin kembali ke menu Supplier (y/n): ");
                    yn5=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn5.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==5)//pembayaran
            {
                String yn6="y";
                do{
                    menuPembayaran();
    
                    int pilihanpby = 0;
                    pilihanpby = input.nextInt();
    
                    if(pilihanpby==1)//tambah data pembayaran
                    {
                        int kodePembayaran;
                        long Harga;
                        String itemName;
                        String kodeTransaksi;
    
                        System.out.print("Kode Pembayaran \t:\t");
                        kodePembayaran=input.nextInt();
                        System.out.print("Harga Barang \t\t:\t");
                        Harga=input.nextLong();
                        System.out.print("Nama Barang \t\t:\t");
                        itemName=input.next();
                        System.out.print("Kode Transaksi \t\t:\t");
                        kodeTransaksi=input.next();
                        payment.add(new Payment(kodePembayaran, Harga, itemName, kodeTransaksi));
                        System.out.println("Data Berhasil Ditambahkan");
                    }
    
                    else if(pilihanpby==2)//tampilkan data pembayaran
                    {
                        cetakDataPembayaran(payment);
                    }    

                    else if(pilihanpby==3)//keluar
                    {
                        menu();
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("Apakah anda ingin kembali ke Menu Pembayaran (y/n): ");
                    yn6=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn6.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==6)//keluar
            {
                break;
            }
    
            else{
                continue;
            }
    
            System.out.print("Apakah anda ingin kembali ke Menu Utama(y/n): ");
            yn=input.next();
    
            System.out.print("\033[H\033[2J");
            System.out.flush();
    
        }
        while(yn.equalsIgnoreCase("y"));
    }
            

    public static void menu()
    {
        System.out.println("Penerimaan Barang");
        System.out.println("1. Data pegawai");
        System.out.println("2. Data penerimaan");
        System.out.println("3. Data barang");
        System.out.println("4. Data supplier");
        System.out.println("5. Data pembayaran");
        System.out.println("6. Keluar");
        System.out.print("Masukkan Pilihan Anda: ");
    }

    public static void menuPegawai()
    {
        System.out.println("Data Pegawai");
        System.out.println("1. Tambah data pegawai");
        System.out.println("2. Tampilkan data pegawai");
        System.out.println("3. Keluar");
        System.out.print("Masukkan Pilihan Anda: ");
    }
    public static void menuBarang()
    {
        System.out.println("Data Barang");
        System.out.println("1. Tambah data barang");
        System.out.println("2. Tampilkan data barang");
        System.out.println("3. Barang yang paling sering di terima");
        System.out.println("4. Keluar");
        System.out.print("Masukkan Pilihan Anda: ");
    }

    public static void menuBarangyangDiterima()
    {
        System.out.println("Data Barang yang diterima");
        System.out.println("1. Tambah data barang yang diterima");
        System.out.println("2. Tampilkan data barang yang diterima");
        System.out.println("3. Histori pemasukan barang yang diterima");
        System.out.println("4. Keluar");
        System.out.print("Masukkan Pilihan Anda: ");
    }

    public static void menuSupplier(){
        System.out.println("Data supplier");
        System.out.println("1. Tambah data supplier");
        System.out.println("2. Tampilkan data supplier");
        System.out.println("3. Keluar");
        System.out.print("Masukkan Pilihan Anda: ");
    }

    public static void menuPembayaran(){
        System.out.println("Data pembayaran");
        System.out.println("1. Tambah data pembayaran");
        System.out.println("2. Tampilkan data pembayaran");
        System.out.println("3. Keluar");
        System.out.print("Masukkan Pilihan Anda: ");
    }

    public static void cetakDataPegawai (ArrayList <Employee> employees){
        System.out.println ("------------------------------------------------");
        for (Employee employee : employees) 
        {
            System.out.println(employee);
        }
        System.out.println("-------------------------------------------------");
    }

    public static void cetakBuktiTerimaBarang (ArrayList <ReceivingItem> receivingItems){
        System.out.println ("------------------------------------------------");
        for (ReceivingItem receivingItem : receivingItems) 
        {
            System.out.println(receivingItem);
        }
        System.out.println("-------------------------------------------------");
    }

    public static void cetakDataBarang (ArrayList <Item> items){
        System.out.println ("------------------------------------------------");
        for (Item item : items) 
        {
            System.out.println(item);
        }
        System.out.println("-------------------------------------------------");
    }
    public static void cetakDataSupplier (ArrayList <Supplier> supplier){
        System.out.println ("------------------------------------------------");
        for (Supplier supplier2 : supplier) 
        {
            System.out.println(supplier2);    
        }     
        System.out.println("-------------------------------------------------");
    }
    public static void cetakDataPembayaran (ArrayList <Payment> payment){
        System.out.println ("------------------------------------------------");
        for (Payment payment2 : payment)
        {
            System.out.println(payment2);  
        }
        System.out.println("-------------------------------------------------");
    }
    /*public static void tampilDataBarang(ArrayList <Item> items)
    {
            System.out.println("Barang yang paling sering diterima di Toko ini : "+ obj);
    }*/
    public static void historipenerimaanbrg (ArrayList <ReceivingItem> receivingItems)
    {
        System.out.print("Masukkan Kode Penerimaan Barang : ");
        Scanner input = new Scanner(System.in);
        String Kdrcv;
        Kdrcv = input.next();
        for (ReceivingItem rcv : receivingItems) {
            if (rcv.getKodeReceiving().equals(Kdrcv))
            System.out.println("Histori Berdasarkan Inputan : \n" + "Kode Receiving\t\t: \t" + rcv.getKodeReceiving() + "\nKuantitas \t\t:\t" + rcv.getKuantitiTerima() + "\nHarga Satuan \t\t:\t" + rcv.getHargaSatuan() + "\nTotal Pembelanjaan\t:\t" + rcv.getTotal());
        }
    }


    public static void penerimaanbarangterbanyak (ArrayList <Item> item)
    {
        int terbanyak=0;
        for (Item rcv1 : item) {
            if(rcv1.getStock() > terbanyak)
            {
                terbanyak = rcv1.getStock();
            }
        }
        String nilai = Integer.toString(terbanyak);
        //System.out.println(nilai);
        for (Item rcv : item) 
        {
            if(rcv.getStock()==terbanyak){
                System.out.println("Barang paling banyak diterima : \n" + "Kode Item\t\t: \t" + rcv.getKodeItem() + "\nNama Item \t\t:\t" + rcv.getNamaItem() + "\nKategori \t\t:\t" + rcv.getKategori() + "\nStock\t\t\t:\t" + rcv.getStock());
            }
        }
        
    }
}
