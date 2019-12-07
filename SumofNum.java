import java.util.Scanner;
class sum {
    public static void main(String arg[]) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
            System.out.print("How many numbers do you want the sum of?");
                n=sc.nextInt();
                int a[] = new int[n];
            System.out.print("Enter the " + n + " numbers ");
                for(int i = 0; i < n; i++) {
                    System.out.print("Enter number " + (i+n)+ ":");
                        a[i]=sc.nextInt();
                }
                // for(int i=0; i < n; i++) {
                //     sum += a[i];
                // }
                System.out.print("sum of " + n + " numbers is =" + sum);
    }
}