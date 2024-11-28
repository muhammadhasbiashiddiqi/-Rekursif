public class tugasNo117 {
        public static void deretDescendingRekursif(int n) {
            if (n < 0) {
                return;
            }
            System.out.print(n + " "); 
            deretDescendingRekursif(n - 1); 
        }
        public static void deretDescendingIteratif(int n) {
            for (int i = n; i >= 0; i--) {
                System.out.print(i + " ");
            }
        }
        public static void main(String[] args) {
            int n = 10;
            System.out.println("Deret dengan rekursif:");
            deretDescendingRekursif(n);
            System.out.println();
            System.out.println("Deret dengan iteratif:");
            deretDescendingIteratif(n);
        }
    }
    