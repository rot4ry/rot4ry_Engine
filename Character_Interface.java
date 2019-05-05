package rot4ry_Engine;

interface Character_Interface{
    //what can Player and Enemy do?
    //also, can create Character_Interface array to check positions on the map
    int healthPoints = 100;


    void Attack(Character_Interface character);
    void Jump(String direction);    //Should be a vector -  final Vector * int direction?
}