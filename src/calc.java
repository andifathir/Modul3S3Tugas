import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka 1 ");
        double angka1 = sc.nextInt();
        System.out.println("Masukkan angka 2 ");
        double angka2 = sc.nextInt();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");


        int pilihan = sc.nextInt();
        double hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Tidak bisa bagi nol.");
                    return;
                }
                break;
            default:
                System.out.println("Operasi tidak valid.");
        }

        System.out.println("Hasil: " + hasil);

    }
}
