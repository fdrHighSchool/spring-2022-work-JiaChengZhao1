import java.util.*;
  public class GameOfLife{
    public static void main(String[] args) {
      String[][] world = new String[30][20];
        setWorld(world);
        displayWorld(world);
        // System.out.println(life(world));
        world[0][0] = "[ x ]";
  }
  // public static life(String[][]world){
  //      world[2][3] = "x";
  // }

  public static void setWorld(String[][]world){
      for(int row = 0; row < world.length; row++) {
        for(int col = 0; col < world[row].length; col++){
          world[row][col] = "[ ]";
      }
    }
  }
  public static void displayWorld(String[][]world){
    for(int row = 0; row < world.length; row++) {
      for(int col = 0; col < world[row].length; col++) {
        System.out.print(world[row][col] + " ");
      }
    }
  }
}
