import java.lang.Math;
public class kodus {
    public static void main(String[] args) {
        System.out.println(pythagoros(4.0,  5.0));
        kordus(10);
        System.out.println(vibecheck(1000));
    }

    public static double pythagoros(double a, double b){
        return Math.sqrt(a*a+b*b);
    }

    public static void kordus(int kordi){
        for(int i = 0; i < kordi; i++){
            System.out.println(i + " astmel 2 on " + i*i);
        }
    }
    public static String vibecheck(int raha){
        if(raha > 900){
            return "Saad osta Iphone 13!";
        }
        else{
            return "Ei saa osta Iphone 13! :(";
        }
    }
}
