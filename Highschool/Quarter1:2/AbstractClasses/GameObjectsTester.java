import java.util.*;

public class GameObjectsTester
{
    public static void main()
    {
        //GameObjects obj = new GameObjects();
        ArrayList<GameObjects> obj = new ArrayList<GameObjects>();
        /*GameObjects hero = new Hero();
        GameObjects enemy = new Enemy();
        GameObjects armor = new Armor();
        GameObjects weapon = new Weapon();
        //abstract classes exist to be extended, they cannot be instantiated

        hero.draw();
        enemy.draw();
        armor.draw();
        weapon.draw();
         */
        obj.add(new Hero());
        obj.add(new Enemy());
        obj.add(new Armor());
        obj.add(new Weapon());
        
        for(GameObjects game:obj)
        {
            game.draw();
            game.blah();
        }
        
        //obj.get(0).someMethod();
    }
}
