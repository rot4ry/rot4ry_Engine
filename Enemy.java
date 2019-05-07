package rot4ry_Engine;

public class Enemy implements Character_Interface{
    
    String name;
    Point enemy_position;
    
    private int healthPoints;
    private int manaPoints;

    private int defense;
    private int attack;
    
    public Enemy(String name, int x, int y){

        this.name = name;
        enemy_position = new Point(x,y);
        
        healthPoints = 50;
        manaPoints = 0;
        defense = 50;
        attack = 5;
        
    }

    public int getHP(){
        return healthPoints;
    }

    
    public int getMP(){
        return manaPoints;
    }


    public int getDEF(){
        return defense;
    }

    public int getATT(){
        return attack;
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