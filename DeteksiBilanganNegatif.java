import java.util.Scanner;

public class DeteksiBilanganNegatif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Masukkan 5 Angka: ");
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();
        }

        boolean negatif = false;
        System.out.print("Elemen Negatif: ");
        for (int num : array) {
            if (num < 0) {
                System.out.print(num + " ");
                negatif = true;
            }
        }

        if (!negatif) {
            System.out.println("Tidak Ada.");
        }

        input.close();
    }
}