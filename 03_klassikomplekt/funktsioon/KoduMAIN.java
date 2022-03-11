
public class KoduMAIN {


    public static void main(String[] args){
        Hero one = new Hero("Johny", "Orc", "Warrior", 1, 15000, 1000);
        Hero two = new Hero("Grandalf", "Elf", "Sorcerer", 1, 20000, 1000);
        Tavern tavern = new Tavern(one,  500);
        Tavern tavern1 =  new Tavern(two, 2500);

        String tavernHero = tavern.getInfo();
        System.out.println(tavernHero);
        one.Greet();
        String tavern1Hero = tavern1.getInfo();
        System.out.println(tavern1Hero);
        two.Greet();
    }
}
