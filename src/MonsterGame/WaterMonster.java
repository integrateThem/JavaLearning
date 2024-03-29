package MonsterGame;

public class WaterMonster extends Monster{
    WaterMonster(){
        name="Water Monster";
    }

    @Override
    public void attack() {
        System.out.println(name+" is attacking");
    }
}
