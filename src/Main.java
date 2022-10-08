import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi1,sayi2;
        int toplam=1;
        System.out.println("Lütfen bir sayı giriniz:");
        sayi1= scanner.nextInt();
        System.out.println("Lütfen üs kısmını giriniz:");
        sayi2= scanner.nextInt();
        for(int i=1;i<=sayi2;i++){

            toplam*=sayi1;



        }
        System.out.println(toplam);
    }
}