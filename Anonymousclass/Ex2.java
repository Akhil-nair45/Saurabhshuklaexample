import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>100000 && n<9999999)
        {

        
        String s = Integer.toString(n);
        String str1 = s.substring(0, 2);
        String str2 = s.substring(2,6);
        String str3 = s.substring(6,7);

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = Integer.parseInt(str3);

        if(a>=11 && a<=88)
        {
            System.out.println("Valid date");
        }
        else
        {
            System.out.println("Invalid date");
        }

        if(b>=1998 && b<=2023)
        {
            System.out.println("Valid Year");
        }
        else{
            System.out.println("Invalid Year");
        }

        if(c>0 && c<10)
        {
            System.out.println("Valid Rating");
        }
        else{
            System.out.println("Invalid Rating");
        }
    }
    else
    {
        System.out.println("Invalid number format");
    }
}
}
