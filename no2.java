import java.util.Scanner;

public class no2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris segitiga Pascal: ");
        int baris = scanner.nextInt();

        cetakSegitigaPascal(baris);
    }
    
    // Metode untuk menghitung faktorial
    static long faktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    // Metode untuk menghitung kombinasi C(n, r)
    static long kombinasi(int n, int r) {
        
        return faktorial(n) / (faktorial(r) * faktorial(n - r));
    }

    // Metode untuk mencetak Segitiga Pascal
    static void cetakSegitigaPascal(int baris) {
        for (int i = 0; i < baris; i++) {
           
            for (int j = 0; j < baris - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(kombinasi(i, j) + " ");
            }
            System.out.println();
        }
    }

   
}

