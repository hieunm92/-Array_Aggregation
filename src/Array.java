import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];


        int i = 0;
        while (i < arr1.length) {
            System.out.print("Nhap phan tu " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Mang 1 : ", "");
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + "\t");
        }
        System.out.print("\n");
        int m = 0;
        while (m < arr2.length) {
            System.out.print("Nhap phan tu " + (m + 1) + ": ");
            arr2[m] = sc.nextInt();
            m++;
        }
        System.out.printf("%-20s%s", "Mang 2 : ", "");
        for (i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");

        }
        int [] arr3 = new int[arr1.length+ arr2.length];
        for (int k = 0; k < arr1.length; k++) {
            arr3[k]= arr1[k];
        }
        int index = arr1.length;
        for (int k = 0; k < arr2.length; k++) {
            arr3[index++]=arr2[k];
        }
        System.out.println("\t");
        System.out.println("Mang 3: "+ Arrays.toString(arr3));

    }
}
