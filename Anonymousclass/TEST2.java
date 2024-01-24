import java.util.Arrays;
import java.util.Scanner;

public class TEST2 {
    public static void main(String[] args) {
        // int Thirdmax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of imputs: ");
        int no = sc.nextInt();
        int[] arr = new int[no];
        int Firstmax = arr[0];

        if (no < 3) {
            System.out.println("Invalid Input");
            return;
        } 
        else {
            for (int i = 0; i < no; i++) {
                System.out.println("Enter no:");
                arr[i]= sc.nextInt();
                if (arr[i]< 0) {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }
        for (int i = 0; i < no; i++) {
            if (arr[i] > Firstmax) {
                Firstmax = arr[i];
            }
        }
        //System.out.println(Firstmax);

        Arrays.sort(arr);
        int Thirdmax = arr[no - 3];
       // System.out.println(Thirdmax);

        System.out.println(Firstmax * Thirdmax);

    }
}
