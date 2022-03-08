import java.utl.*;
  public class GameOfLife{
    public static void main(String[] args) {
      System s = new scanner(System.in);
      String[][] world = new String[30][30];
        setWorld();
  }


  public static void setWorld(String[][]world ){
      for(int row = 0; row < world.length; row++) {
        for(int col = 0; col < world[row].length; col++){
          world[row][col] = "[ ]";
      }
    }
  }
}
