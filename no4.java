import java.util.Scanner;
public class no4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Masukkan nilai N: ");
        int n = scn .nextInt();
        for (double  z = -4; z <= 4; z= z+0.1) {
            int jumBintang = normal(n,z);
            bintang(jumBintang);
        }    
    }
    static void bintang(int m) {
        for(int i = 1; i <= m; i++) 
        System.out.print("*");
	    System.out.println();
    }
    static int normal(int n, double z) {
        double e = Math.E;
        double phi = 3.14;
        double pangkat = - 0.5 * Math.pow(z, 2);
        double f = 1 / Math.sqrt(2 * phi) * Math.pow(e, pangkat);
        return (int) Math.round(n * f);
    }
}