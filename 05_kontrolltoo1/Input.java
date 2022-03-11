import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Sisesta arv: ");

        int arv = num.nextInt();
        int i = 2;
        boolean condition = false;
        while (i <= arv / 2){
            if (arv % i == 0){
                condition = true;
                break;
            }
            ++i;
        }
        if (!condition)
            System.out.println(arv + " on algarv");
        else
            System.out.println(arv + " ei ole algarv");
        if(arv % 2 == 0)
            System.out.println(arv + " jagub kahega!");
        if(arv % 3 == 0)
            System.out.println(arv + " jagub kolmega!");
        if(arv % 5 == 0)
            System.out.println(arv + " jagub viiega!");
        if(arv % 7 == 0)
            System.out.println(arv + " jagub seitsmega");

    }
}
