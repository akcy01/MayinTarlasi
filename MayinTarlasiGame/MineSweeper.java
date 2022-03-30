package MayinTarlasiGame;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int sutun;
    int satir;
    int boyut;
    boolean oyun = true;
    String [][] map;
    String [][] kullaniciMap;
    Random rand = new Random();  //Rastgele mayın üreteceğim için yaptım bunu.
    Scanner input = new Scanner(System.in);
    public MineSweeper(int satir,int sutun){

        this.satir = satir;
        this.sutun = sutun;
        this.map = new String[satir][sutun];
        this.kullaniciMap = new String[satir][sutun];
        this.boyut = satir*sutun;   //Map'in kapladığı alanın toplam boyutunu hesapladım...

    }



    public void yazdir(String[][] arr){
        for (int i = 0; i<satir; i++){
            for(int j = 0; j<sutun; j++){
                System.out.print(this.map[i][j] = "-");
            }
            System.out.println();
        }
    }

    //Mayınlı map i yazdırdım önce.
    public void mayinlar(){


    }

    public void run(){

        System.out.println("Mayınların Konumu");
        int count = 0;
        while (count < boyut / 4){
            for (int i = 0; i<satir; i++){
                for(int j = 0; j<sutun; j++){
                    int rastSatir = rand.nextInt(10);
                    if (rastSatir > 5 && count < boyut / 4){ // art arda yıldız yazdırmasın,karışık yazdırsın diye böyle bir algoritma geliştirdim.
                        this.map[i][j] = "*"; //Bazen 4 bazen 3 gibi random degerler gelicek bunlar geldiğinde otomatikmen else kısmına geçicek.
                        count++;
                    }else{
                        this.map[i][j] = "-";
                    }
                    System.out.print(this.map[i][j]);
                }
                System.out.println();
            }

        }

        System.out.println("Oyun Başlasın");

    while (oyun){
        yazdir(kullaniciMap);
        int s;
        int st;
        System.out.println("SATIR => ");
        s = input.nextInt();
        System.out.println("SÜTUN => ");
        st = input.nextInt();

        if (map[s][st].equals("*")){
            System.out.println("OYUNU KAYBETTİNİZ !!");
            oyun = false;
        }else{

            }
        }
    }

}
