import java.util.Scanner;
public class studgrade {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int avg = (a+b+c+d+e)/5;
    if(avg>=90){
        System.out.println("A+");
    }else if(avg>=80 && avg<=89){
        System.out.println("A");
    }else if(avg>=70 && avg<=79){
        System.out.println("B");
    }else if(avg>=60 && avg<=69){
        System.out.println("C");
    }else{
        System.err.println("Fail");
    }
}
}