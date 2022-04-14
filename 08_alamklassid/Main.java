public class Main {
    public static void main(String[] args) {
        System.out.println("What's your level: ?");
        Warrior kalev = new Warrior();
        kalev.hpcheckM();
        System.out.println("What's your level: ?");
        Rogue assassin = new Rogue();
        assassin.hpcheckM();
        System.out.println("What's your level: ?");
        Archer robin = new Archer();
        robin.hpcheckR();
        System.out.println("What's your level: ?");
        Wizard gandalf = new Wizard();
        gandalf.hpcheckR();
    }
}
