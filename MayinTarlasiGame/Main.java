package MayinTarlasiGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int satir,sutun;
        Scanner input = new Scanner(System.in);
        System.out.println("Mayın Tarlasın Hoş Geldiniz!!");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz.");
        System.out.println("Satır sayısı ");
        satir = input.nextInt();
        System.out.println("Sütun sayısı ");
        sutun = input.nextInt();


        MineSweeper m1 = new MineSweeper(satir,sutun);
        m1.run();

    }

}
