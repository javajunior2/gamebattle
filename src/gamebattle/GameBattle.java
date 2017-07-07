package gamebattle;

public class GameBattle {

    public static void main(String[] args) throws DeadUnitException, DeadEnemyException {

//        Unit soldier = new Soldier();
//        Unit rogue = new Rogue();
        Unit berserker = new Berserker();
        Unit werewolf = new Werewolf();
        Unit vampire = new Vampire();
//        Unit wizard = new Wizard();

//        System.out.println(soldier);
//        System.out.println(rogue);
        System.out.println(berserker);
        System.out.println(werewolf);
        System.out.println(vampire);
//        System.out.println(wizard);

        werewolf.takeMagicDamage(20);

        System.out.println();
        System.out.println("--- BATTLE BEGINS ---\n");

//        soldier.attack(rogue);
//        rogue.attack(soldier);
//        soldier.attack(berserker);
//        rogue.attack(berserker);
//        werewolf.attack(soldier);
//        System.out.println(werewolf);
//        werewolf.takeMagicDamage(40);
        System.out.println(werewolf);
        werewolf.changeState();
        System.out.println(werewolf);
//        werewolf.attack(vampire);
//        berserker.attack(rogue);
//        berserker.attack(soldier);
//        vampire.attack(soldier);
//        vampire.attack(werewolf);
//        vampire.attack(soldier);
        vampire.attack(werewolf);
//        vampire.attack(soldier);
//        vampire.attack(soldier);
//        vampire.attack(soldier);
//        vampire.attack(soldier);
//        vampire.attack(soldier);
//        berserker.attack(vampire);

        System.out.println(werewolf);
        werewolf.changeState();
        System.out.println(werewolf);
        vampire.attack(werewolf);

        System.out.println("--- END OF BATTLE ---\n");
        System.out.println();

//        System.out.println(soldier);
//        System.out.println(rogue);
        System.out.println(berserker);
        System.out.println(werewolf);
        System.out.println(vampire);
//        System.out.println(wizard);

    }
    
}
