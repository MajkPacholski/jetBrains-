import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int inputUser = scan.nextInt();
        int[][] arrrayTest = new int [inputUser][inputUser];
        for(int i = 0; i < arrrayTest.length;i++) {
            for (int j = 0; j < arrrayTest[i].length;j++){
                arrrayTest [i][j] = Math.abs(j-i);
            }

        }

        for (int i = 0; i <arrrayTest.length; i++) {
            for (int j = 0; j < arrrayTest.length; j++) {
                System.out.print(arrrayTest[i][j] + " ");
            }
            System.out.println();

        }
    }
}