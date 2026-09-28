package Guided_Modul02;

public class Angka {

    public static void main(String[] args) {
        int i;

        // 1. Perulangan FOR
        System.out.println("--- Menggunakan FOR ---");
        for (i = 1; i <= 10; i++) {
            System.out.println(Integer.toString(i));
        }

        // 2. Perulangan WHILE
        System.out.println("\n--- Menggunakan WHILE ---");
        i = 1;
        while (i <= 10) {
            System.out.println(Integer.toString(i));
            i++;
        }

        // 3. Perulangan DO-WHILE
        System.out.println("\n--- Menggunakan DO-WHILE ---");
        i = 1;
        do {
            System.out.println(Integer.toString(i));
            i++;
        } while (i <= 10);
    }
}