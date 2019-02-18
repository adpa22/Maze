import java.lang.Math;
public class Cell {

    int x;
    int y;
   // int f, g;
    int h;
    boolean visited;
    boolean blocked;

    public Cell(int x, int y, boolean visited, boolean blocked){

        this.x = x;
        this.y = y;
        this.visited = visited;
        this.blocked = blocked;

        h = Math.abs(x - 100) + Math.abs(y - 100);
        //g = Math.abs(0 - x) + Math.abs(0 - y);
        //f = g + h;
    }

    public void display(){
        if(blocked)
            System.out.print('x');
        else
            System.out.print(' ');
    }



}
