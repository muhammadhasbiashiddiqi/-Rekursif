public class TugasNo217 {
        public static int hitungPenjumlahan(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n + hitungPenjumlahan(n - 1);
            }
        }
        public static void main(String[] args) {
            int f = 8; 
            int hasil = hitungPenjumlahan(f);
            System.out.println("Penjumlahan dari 1 hingga " + f + " adalah " + hasil);
        }
    }
    