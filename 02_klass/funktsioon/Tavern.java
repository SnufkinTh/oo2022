public class Tavern {
    Hero hero;
    int price;

    public Tavern(Hero kodutoo2, int price) {
        this.hero = kodutoo2;
        this.price = price;
    }

    public String getInfo() {
        return "To hire: " + this.hero + ". You need: " + this.price + " gold.";
    }
}