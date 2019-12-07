import java.util.Scanner;
class reverseString {
    public static void main(String[] arg){
            reverseString rev=new reverseString();
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a word : ");
            String str=sc.nextLine();
            System.out.print("Reversed word is : "+rev.reverse(str));
    }
    static String reverse(String s){
        String rev = "";
        for(int i = s.length(); i > 0; --i){
            rev = rev + (s.charAt(i-1));
        }
        return rev;
    }
    
}