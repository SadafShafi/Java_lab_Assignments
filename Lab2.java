import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 1;
        while(i<=num){
            int j = 1;
            char alpha = (char)('A'+i-1);
            while(j<=i){
                System.out.print(alpha);
                alpha = (char)(alpha+1);
                j = j+1;
            }
            System.out.println();
            i = i+1;
        }
    }
}

// import java.util.Scanner;

// public class Pattern9 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int num = input.nextInt();
//         int i = 1;
//         while(i<=num){
//             int j = 1;
//             char p =(char)('A'+i-1);
//             while(j<=num){
//                 char ch = (char)(p+j-1);
//                 System.out.print(ch);
//                 j = j+1;
//             }
//             System.out.println();
//             i = i + 1;
//         }

//     }
// }

// import java.util.Scanner;

// public class Pattern7 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int num = input.nextInt();
//         int i = 1;
//         while(i<=num){
//             int j = 1;
//             while(j<=i){
//                 char alpha = (char)('A'+i-1);
//                 System.out.print(alpha+" ");
//                 j = j + 1;
//             }
//             System.out.println();
//             i = i + 1;
//         }
//     }
// }

// import java.util.Scanner;

// public class Pattern5 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         int i = 1;
//         int k = 1;
//         while(i<=n){
//             int j = 1;
//             while(j<=i){
//                 System.out.print(k);
//                 k = k + 1;
//                 j = j+1;
//             }
//             System.out.println();
//             i = i+1;
//         }
//     }
// }

// import java.util.Scanner;

// public class Pattern6 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         int i = 1;
//         while(i<=n){
//             int j = 1;
//             int k = i;
//             while(j<=i){
//                 System.out.print(k);
//                 k = k + 1;
//                 j = j+1;
//             }
//             System.out.println();
//             i = i+1;
//         }
//     }
// }




