package MonsterGame;

public class Main {
    public static void main(String[] args) {
        FireMonster fire=new FireMonster();
        WaterMonster water=new WaterMonster();
        StoneMonster stone=new StoneMonster();
        fire.attack();
        water.attack();
        stone.attack();
    }
}
