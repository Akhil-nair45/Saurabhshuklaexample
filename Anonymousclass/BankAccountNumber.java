import java.util.Scanner;

 import java.util.Scanner;
 public class BankAccountNumber {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of Inputs: ");
         int n = sc.nextInt();
         if(n<0)
         {
             System.out.println("Invalid Input");
             return;
        }

         int[] accountNumbers = new int[n];
         for( int i=0; i<n; i++)
         {
             accountNumbers[i]= sc.nextInt();
             if(accountNumbers[i]<0)
             {
                 System.out.println("Invalid Customer Account Number ");
                 return;
             }
         }

         for(int i=0; i<n; i++)
         {
            if(accountNumbers[i] == accountNumbers[i+1])
            {
                System.out.println("Entered account number already exists");
                return;
            }
         else{
        
         int BranchCode= sc.nextInt();
         if(BranchCode<100  && BranchCode>999)
         {
             System.out.println("Invalid Branch Code");
             return;
         }
        

         for(int J=0; J<n; J++)
         {
             if(BranchCode == accountNumbers[J]/1000)
             {
                 System.out.println(accountNumbers[J]%1000);
                 return;
             }
         }
     }
    }
}
 }






Demo









