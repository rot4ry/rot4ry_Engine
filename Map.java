package rot4ry_Engine;

import rot4ry_Engine.*;

public class Map{

    private int dimensionA;
    private int dimensionB;
    public Integer[][]map; 

    public Player player;
    private Enemy[]enemies;
    private Item[]items;
    private Wall[]walls;

    public Map(int a, int b){
        dimensionA = a;
        dimensionB = b;
        map = new Integer[dimensionA][dimensionB];
        this.fillMap();
        this.printMap();
        System.out.println();
        player = new Player("Test", 5, 10);     
        map[player.getX()][player.getY()]=1;
        this.printMap();
    }

    public int getA(){
        return dimensionA;
    }

    public int getB(){
        return dimensionB;
    }

    public void fillMap(){
        for(int i = 0; i<this.dimensionA; i++){
            for(int j = 0; j<this.dimensionB; j++){
                this.map[i][j]=0;
            }
        }
    }

    public void printMap(){
        for(int i = 0; i<this.dimensionA; i++){
            for(int j = 0; j<this.dimensionB; j++){
                System.out.print(this.map[i][j]);
            }
            System.out.println();
        }
    }
}


