import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        int totalBelanja = 0;
        int hasil = 0;

        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Total Belanja: ");
        totalBelanja = input.nextInt();

        if (totalBelanja < 100000) {
            System.out.println("Diskon Anda Adalah : 0%");
        }

        if (totalBelanja >= 100000 && totalBelanja < 200000) { 
            System.out.println("Diskon Anda Adalah : 10%");
            hasil = totalBelanja * 10 / 100;
            System.out.println("Total Belanja Anda Setelah Diskon : " + (totalBelanja - hasil));
    }

        if (totalBelanja > 200000) {
            System.out.println("Diskon Anda Adalah : 20%");
            hasil = totalBelanja * 20 / 100;
            System.out.println("Total Belanja Anda Setelah Diskon : " + (totalBelanja - hasil));
        }    
    }
}
