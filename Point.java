package rot4ry_Engine;

public class Point{

    private int X;
    private int Y;

    public Point(int x, int y){
        this.X = x;
        this.Y = y;
    }

    public int getX(){
        return this.X;
    }

    public int getY(){
        return this.Y;
    }

    public void printValues(){
        System.out.println(this.X);
        System.out.println(this.Y);
    }
}