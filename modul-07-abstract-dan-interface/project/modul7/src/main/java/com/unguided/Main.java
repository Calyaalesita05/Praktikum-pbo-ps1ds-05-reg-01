package com.unguided;

public class Main {
    public static void main(String[] args) {

        // Uji proteksi abstract class
        // TiketBioskop tiket = new TiketBioskop("Film", 40000, 2);

        ItemTransaksi.catatLogKasir(
                "Membuka transaksi baru untuk Pelanggan #042.");

        TiketReguler reguler = new TiketReguler(
                "Interstellar", 40000, 2, 3);

        TiketVIP vip = new TiketVIP(
                "Dune: Part Two", 60000, 2, 25000);

        PaketSnack snack = new PaketSnack(
                "Combo Popcorn Caramel + 2 Soda", 1, 55000);

        ItemTransaksi[] daftarTransaksi = {
            reguler, vip, snack
        };

        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");

        double totalTransaksi = 0;

        for (ItemTransaksi item : daftarTransaksi) {
            item.cetakRincianItem();
            totalTransaksi += item.getNominalBayar();
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + totalTransaksi);
        System.out.println("=============================================================");

        ItemTransaksi.catatLogKasir(
                "Transaksi #042 selesai diproses.");
    }
}
