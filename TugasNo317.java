public class TugasNo317 {
    public static int hitungPasangan(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return hitungPasangan(bulan - 1) + hitungPasangan(bulan - 2);
        }
    }
    public static void main(String[] args) {
        int bulanKe = 12;
        int totalPasangan = hitungPasangan(bulanKe);
        System.out.println("Jumlah total pasangan marmut pada bulan ke-" + bulanKe + " adalah: " + totalPasangan);
    }
}
