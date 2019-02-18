import java.lang.Math;

public class Grid {
    boolean [][] visited = new boolean[101][101];
    boolean [][] blocked = new boolean[101][101];
    char [][] maze = new char[101][101];
    int [][] h = new int[101][101];

    int startx = 0;
    int starty = 0;
    int targetx = 100;
    int targety = 100;



    public Grid() {
        visited[startx][starty] = true;

        int blockProb = 0;
        int heuristic = 0;

        for(int i = 0; i < maze.length; i++) {
            for(int j = 0; j < maze[0].length; j++) {

                blockProb = (int) (Math.random() * 10);
                heuristic = Math.abs(i - targetx) + Math.abs(j - targety);
                h[i][j] = heuristic;


                if(i == 0 && j == 0)
                    continue;
                if(i == 100 && j == 100)
                    continue;

                if(blockProb < 3) {
                    blocked[i][j] = true;
                    maze[i][j] = 'x';
                }else {
                    maze[i][j] = ' ';
                }

            }
        }

    }



    public void display() {

        for(int i = 0; i < maze.length; i++) {
            for(int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }

    }
}
