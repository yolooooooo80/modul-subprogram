import java.util.Scanner;
public class no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nilai n : ");
        int n = input.nextInt();
        System.out.print("Masukkan nilai r : ");
        int r = input.nextInt();

        //melakukan percabangan isi memori n r
        if (r > n) {
            System.out.println("Input tidak sesuai");
        } else {
            int hasil = combination (n, r);
            System.out.println("Jumlah kombinasi : " + hasil);
        }
    }
    //deklarasi metode static
    static int faktorial (int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) { //faktorial isi memori n
            hasil = hasil * i;
        }
        return hasil;
    }
    // sama kayak atas
    static int combination (int n, int r) {
        if (r > n) {
            return 0;
        }
        return faktorial(n) / (faktorial(r) * faktorial(n - r)); //hasil kombinasi
    }
    
}