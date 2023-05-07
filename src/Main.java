import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        int toplam = 0;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz");
        sayi=scanner.nextInt();

        for (int i=1; i<=sayi;i*=2){
          System.out.println(i);
        }
    }
}