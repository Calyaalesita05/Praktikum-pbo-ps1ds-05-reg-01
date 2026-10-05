package project.guided1.LatihanModul03;


public class MainCircle01 {
    public static void main(String[] args) {

        Circle01 lingkaran = new Circle01();

        lingkaran.r = 7;

        System.out.println("Jari-jari : " + lingkaran.r);
        System.out.println("Luas : " + lingkaran.area());
        System.out.println("Keliling : " + lingkaran.circumference());
    }
}
