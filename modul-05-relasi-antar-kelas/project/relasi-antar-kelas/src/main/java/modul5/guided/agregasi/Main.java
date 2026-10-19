package modul5.guided.agregasi;

public class Main {
    public static void main(String[] args) {
        runGuided2();
    }

    public static void runGuided2() {
        Mahasiswa m1 = new Mahasiswa("103132400020", "Calya");
        Mahasiswa m2 = new Mahasiswa("103132400021", "John Doe");

        Jurusan prodi = new Jurusan("SD", "Sains Data");

        prodi.addMahasiswa(m1);
        prodi.addMahasiswa(m2);

        prodi.displayMahasiswa();
    }
}