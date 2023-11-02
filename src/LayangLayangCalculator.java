import java.util.Scanner;

/**
 * Program untuk menghitung luas dan keliling layang-layang
 */
public class LayangLayangCalculator {

    /**
     * Menghitung luas layang-layang.
     *
     * @param d1 Panjang diagonal pertama.
     * @param d2 Panjang diagonal kedua.
     * @return Luas dari layang-layang.
     */
    public static double hitungLuas(double d1, double d2) {
        return (d1 * d2) / 2;
    }

    /**
     * Menghitung keliling layang-layang.
     *
     * @param s Panjang sisi.
     * @return Keliling dari layang-layang.
     */
    public static double hitungKeliling(double s) {
        double keliling = 2 * s;
        return keliling;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang diagonal pertama (d1): ");
        double d1 = scanner.nextDouble();

        System.out.print("Masukkan panjang diagonal kedua (d2): ");
        double d2 = scanner.nextDouble();

        System.out.print("Masukkan panjang sisi pertama (s1): ");
        double s1 = scanner.nextDouble();

        System.out.print("Masukkan panjang sisi kedua (s2): ");
        double s2 = scanner.nextDouble();

        double luas = hitungLuas(d1, d2);
        double sisi = s1 + s2;

        double keliling = hitungKeliling(sisi);

        System.out.println("Luas layang-layang: " + luas);
        System.out.println("Keliling layang-layang: " + keliling);
    }
}
