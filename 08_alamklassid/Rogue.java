import static java.lang.Math.round;

public class Rogue extends Melee{
    double current_hp = balanceM*level*0.9;
    public void hpcheckM(){
        System.out.println("Your hp is: " + round(current_hp));
    }
}
