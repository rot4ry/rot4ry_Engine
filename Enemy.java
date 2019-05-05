package rot4ry_Engine;

public class Enemy implements Character_Interface{
    
    String name;
    Point enemy_position;
    
    public Enemy(String name, int x, int y){
        this.name = name;
        enemy_position = new Point(x,y);
    }
    
    @Override
    public void Attack(Character_Interface character){
        System.out.println("Enemy jumping");
    }

    @Override
    public void Jump(String direction){
        System.out.println("Enemy jumping");
    }
}