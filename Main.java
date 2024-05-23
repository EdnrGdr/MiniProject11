import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        /*
        Faiz Uygulaması yapacagız.
        Kullanıcıya yatırmak istediği tutarı , parasını kaç yıl vadeli yatırmak istediğini soralım.
        Her sene sonunda toplam para miktarını ekrana yazdırlaım.

        Faiz oranı %6 alalım.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz , Faiz Oranı % 6 dır..");

        int anapara,vade;
        System.out.print("Yatırmak istediğiniz tutarı giriniz ..:");
        anapara=scanner.nextInt();
        System.out.print("Kullanmak İstediğiniz Vade Yılını Giriniz..");
        vade=scanner.nextInt();

        double toplampara = anapara;
        double faizoranı = 0.06;

        for ( int yil =1 ; yil < vade; yil++) {

           toplampara = ( toplampara * faizoranı) + toplampara;

            System.out.println(yil + ".Sonunda Toplam Paranız :" + (int)toplampara + "TL");




        }


        
    }
}
