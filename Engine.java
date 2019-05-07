package rot4ry_Engine;

import rot4ry_Engine.Map;

public class Engine{

    private Map currentMap;
    private Player player;
    private Enemy[]enemies;
    private Item[]items;

    public Engine(){
        currentMap = new Map(10,10);
        printMap(currentMap);
    }
    


    public void printMap(Map map){
        for(int i = 0; i<map.getA(); i++){
            for(int j = 0; j<map.getB(); j++){
                System.out.print(map.getMapARRAY(i,j));
            }
            System.out.println();
        }
    }

    //abstract void Gravity(Map map); //need to create a class to group Item,Player,Enemy
    //abstract void Slide(Map map);

}