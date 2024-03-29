package MonsterGame;

public class FireMonster extends Monster {
    FireMonster(){
        name="Fire Monster";
    }
    @Override
    public void attack() {
        System.out.println(name+" is attacking");
    }
}
