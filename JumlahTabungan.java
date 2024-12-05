public class JumlahTabungan {
    public static void main(String[] args) {
        int bulanPertama = 100000;
        int setiapBulan = 50000;
        int hasil = 0;
        int totalTabungan = 0;

        for (int i = 1; i <= 12; i++) {
            hasil = bulanPertama + (setiapBulan * (i - 1));
            System.out.println("Tabungan Bulan ke- " + i + " : " + hasil);
            totalTabungan += hasil;
    }

    System.out.println("Total Tabungan Adalah: " + totalTabungan); 
}
}
