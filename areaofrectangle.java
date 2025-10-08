import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int area = (l*b);
        int premeter = (2*(l+b));
        System.out.println(area);
        System.out.println(premeter);
    }
    
}
