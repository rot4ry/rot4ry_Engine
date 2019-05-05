package rot4ry_Engine;

import rot4ry_Engine.Point;

public class Item{
    public String name;
    private Point position;
    
    public Item(String name, int x, int y){
        System.out.println("I'm an Item");
        this.name = name;
        position = new Point(x,y);
        this.printValues();
    }

    public void printValues(){
        System.out.println(this.name);
        position.printValues();
    }
}