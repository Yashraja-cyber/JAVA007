import java.util.Scanner;

public class eb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int bill=0;

        if(unit >0 && unit <=100 ){
            bill=5*unit;
            System.out.println(bill);
        }
        else if(unit <=300 && unit >=101){
            bill=7*unit;
            System.out.println(7*unit);
        }
        else if(unit >300){
            bill=10*unit;
            if(bill > 2000){
                int extra = bill/10;
                bill+=extra;
                System.out.println(bill);
            }

        }
        
    }
    
}
