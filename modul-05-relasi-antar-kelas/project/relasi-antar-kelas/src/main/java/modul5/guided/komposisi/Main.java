package modul5.guided.komposisi;

public class Main {
    public static void main(String[] args) {
        runGuided2();
    }

    public static void runGuided1() {
    }

    public static void runGuided2() {
        Komputer komputer = new Komputer(
            "Intel Core i5", 3200,
            "Samsung", "Logitech", "Wireless"
        );

        komputer.displaySpecKomputer();
    }
}