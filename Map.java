package rot4ry_Engine;

import rot4ry_Engine.Point;
import rot4ry_Engine.Vector;
import rot4ry_Engine.Wall;


public class Map{

    private int dimensionA;
    private int dimensionB;
    private Integer[][]mapARRAY;      //how to return an array? 
    private Wall[]walls;
    
    public Map(int a, int b){
        dimensionA = a;
        dimensionB = b;
        mapARRAY = new Integer[dimensionA][dimensionB];
        fillMap();
    }

    public void fillMap(){      
        for(int i = 0; i<this.dimensionA; i++){
            for(int j = 0; j<this.dimensionB; j++){
                this.mapARRAY[i][j]=0;
            }
        }
    }

    public int getMapARRAY(int i, int j){
        return mapARRAY[i][j];
    }

    public int getA(){
        return dimensionA;
    }

    public int getB(){
        return dimensionB;
    }    
}
