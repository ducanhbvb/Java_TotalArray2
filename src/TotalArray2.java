import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class TotalArray2 {
    public static void randomArr(int[][] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("input Max Current:= ");
        int maxCurent = sc.nextInt();
        arr = new int[maxCurent][maxCurent];
        randomArr(arr);
        System.out.println("Print arr:");
        print(arr);
        int total = sum(arr);
        System.out.println("Total đường chéo chính in array:= " + total);
    }
}
