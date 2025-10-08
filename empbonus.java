import java.util.Scanner;

public class empbonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int exp = sc.nextInt();
        double income = sc.nextDouble();
        if(exp>5){
            int bonus = (int)(income/100)*15;
            System.out.println((int)(bonus+income));
        }else if(exp>=3){
            int bonus=(int)(income/10);
            System.out.println((int)(bonus+income));
        }else{
            int bonus=(int)(income/100)*3;
            System.out.println((int)(bonus+income));
        }
    }
}
