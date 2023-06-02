import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Girin: ");
        int size = input.nextInt();
        int[] list =new int[size];
        System.out.println("Dizinin Elemanlarını Giriniz: ");

        for (int i = 0; i< list.length;i++){
                System.out.print((i+1) + ". Elemanı : ");
                list[i] = input.nextInt();
            }

        System.out.println("Dizi : " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Sıralama: " + Arrays.toString(list));


    }
}