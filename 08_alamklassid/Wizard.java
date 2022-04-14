import static java.lang.Math.round;

public class Wizard extends Ranged{
    double current_hp = balanceR*level*0.6;
    public void hpcheckR(){
        System.out.println("Your hp is: " + round(current_hp));
    }
}
