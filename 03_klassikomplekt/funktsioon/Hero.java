public class Hero {
    String name;
    String race;
    String specialization;
    int level;
    int xp;
    int xptonext;

    public Hero(String name, String race, String specialization, int level, int xp, int xptonext){
        this.name = name;
        this.race = race;
        this.specialization = specialization;
        this.level = level+(xp/xptonext);
        this.xp = xp;
        this.xptonext = xptonext+xp*level;

    }
    public void Greet(){
        System.out.println(name + " says: 'Hire me, Adventurer!'");
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", specialization='" + specialization + '\'' +
                ", level=" + level +
                ", xp=" + xp +
                ", xptonext=" + xptonext +
                '}';
    }
}
