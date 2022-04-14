import static java.lang.Math.round;

public class Warrior extends Melee{
    double current_hp = balanceM*level*1.1;
    public void hpcheckM(){
        System.out.println("Your hp is: " + round(current_hp));
    }
}
