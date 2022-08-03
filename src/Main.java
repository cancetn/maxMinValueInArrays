import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.

        /*Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

         Dizi : {15,12,788,1,-1,-778,2,0}
         Girilen Sayı : 5
         Girilen sayıdan küçük en yakın sayı : 2
         Girilen sayıdan büyük en yakın sayı : 12

         */



        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz = ");
        int entry = input.nextInt();
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Dizi : " + Arrays.toString(list));
        Arrays.sort(list);


        int min = list[0];
        int max = list[0];
        int count = 0;
        for( int i : list){
            if(entry > list[count]){

                min = list[count];

            }

            if(entry < list[count]){

                max = list[count];
                break;

            }
            count++;
        }

        System.out.println("Girilen Sayi : " + entry);
        System.out.println("Girilen sayidan kucuk en yakin sayi : " + min);
        System.out.println("Girilen sayidan buyuk en yakin sayi : " + max);




    }
}
