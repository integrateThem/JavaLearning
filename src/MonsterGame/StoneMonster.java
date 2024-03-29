package MonsterGame;

public class StoneMonster extends Monster{
    StoneMonster(){
        name="Stone Monster";
    }

    @Override
    public void attack() {
        System.out.println(name+" is attacking");
    }
}
