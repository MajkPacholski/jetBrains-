import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);
        int lengthArray = scan.nextInt();
        int[] arr = new int[lengthArray];
        int arrSum = 0;
        for (int i = 0; i < lengthArray; i++) {
            arr[i] = scan.nextInt();
        }
        int countNumb = scan.nextInt();
        for (int numb : arr) {
            if (numb == countNumb) {
                arrSum++;
            }
        }
        System.out.println(arrSum);
    }
}

