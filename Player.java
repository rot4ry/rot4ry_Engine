package rot4ry_Engine;

public class Player implements Character_Interface{

    String name;
    private Point player_position;
    
    public Player(String name, int x, int y){
        this.name = name;
        player_position = new Point(x,y);
    }

    public int getX(){
        return this.player_position.getX();
    }

    public int getY(){
        return this.player_position.getY();
    }

    @Override
    public void Attack(Character_Interface character){
        System.out.println("Player attacking");
    }

    @Override
    public void Jump(String direction){
        System.out.println("Player jumping");
    }

}