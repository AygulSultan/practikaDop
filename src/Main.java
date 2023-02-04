import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        int san=scanner.nextInt();//132
        int a=san%10;
        int b=san/100;
        int c=(san/10)%10;
        int d=san/10;

        if (san>=100){
            if ((san%a==0)&&(san%b==0)&&(san%c==0)){
                    System.out.println("bul san ozunun sandaryna bolunot");
                }
            else {
                System.out.println(" net resheniya");
            }
        }
        if (san<=99){
                 if ((san%a==0)&&(san%d==0)){
            System.out.println("bul san ozunun sandaryna bolunot");
        }
                 else {
                     System.out.println("net resheniya");
                 }

        }


       // Esep esep=new Esep();
        //esep.calc(132);


    }
}