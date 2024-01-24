// import java.util.Scanner;

// class Ex3  
// {  
// public static void main(String args[])  
// {  
// String s;  
// Scanner sc=new Scanner(System.in);  
// System.out.print("Enter a String: ");  
// s=sc.nextLine();                    //reading string from user  
// System.out.print("After reverse string is: ");  
// for(int i=s.length();i>0;--i)                //i is the length of the string  
// {  
// System.out.print(s.charAt(i-1));            //printing the character at index i-1  
// }  
// }  
// }





//switch csae Example:

// public class Ex3
// {
//     public static void main(String[] args) {
//         int day =4;
//         switch(day)
//         {
//             case 1: 
//             System.out.println("Monday");
//             break;

//             case 2:
//             System.out.println("Tuesday");
//             break;

//             case 3:
//             System.out.println("Wednesday");
//             break;

//             case 4:
//             System.out.println("Thursday");
//             break;
            
//             case 5:
//             System.out.println("Friday");
//             break;

//             case 6:
//             System.out.println("Saturday");
//             break;

//             case 7:
//             System.out.println("Sunday");
//             break;
//         }
//     }
// }




        let myPromise = new Promise(function(reg,ref))
        {
            let x=0;
            if(x==0)
            {
                reg("ok");
            }
            else{
                ref("Error");
            }
        });
    
