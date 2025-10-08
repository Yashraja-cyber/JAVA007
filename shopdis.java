import java.util.Scanner;

public class shopdis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amo=sc.nextInt();
        if (amo>5000) {
            int dis=(amo/100)*20;
            System.out.println(amo-dis);   
        }else if(amo>2000){
            int dis=(amo/100)*10;
            System.out.println(amo-dis);
        }else{
            System.err.println("No discount");
        }
    } 
}
