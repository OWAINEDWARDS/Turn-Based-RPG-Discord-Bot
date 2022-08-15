import enemy.Chielle;
import enemy.Enemy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

// aka "game state"
public class WorldStack {
    Object[] stack = new Object[3];
    ArrayList<Enemy> enemySelectionPool = new ArrayList<>();
    ArrayList<String> locationSelectionPool = new ArrayList<>();

    public WorldStack(){
        //set Pool to select from.
        setEnemySelectionPool();
        setLocationSelectionPool();

        //Enemy has a .25 chance of being selected. // A location has .75 - Currently WIP - MAY CHANGE

        int indexOneSelection = new Random().nextInt(4 - 0 ) + 0;
        int indexTwoSelection = new Random().nextInt(4 - 0 ) + 0;
        int indexThreeSelection = new Random().nextInt(4 - 0 ) + 0;

        if(indexOneSelection > 0){
            stack[0] = locationSelectionPool.get(0);
        }else{
            stack[0] = enemySelectionPool.get(0);
        }

        if(indexTwoSelection > 0){
            stack[1] = locationSelectionPool.get(0);
        }else{
            stack[1] = enemySelectionPool.get(0);
        }

        if(indexThreeSelection > 0){
            stack[2] = locationSelectionPool.get(0);
        }else{
            stack[2] = enemySelectionPool.get(0);
        }
        

    }
    private void setEnemySelectionPool(){
        enemySelectionPool.add(new Chielle());
    }
    private void setLocationSelectionPool(){
        locationSelectionPool.add("The Bug Forrest");
        locationSelectionPool.add("The Sewer");
    }

}
