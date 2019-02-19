import java.lang.Math;

public class Grid {
    Cell [][] cells = new Cell[101][101];

    int startx = 0;
    int starty = 0;
    int targetx = 100;
    int targety = 100;



    public Grid() {

        boolean blocked = false;
        boolean visited = false;
        int blockedProb = 0;

        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[0].length; j++){

                if((i == 0 && j == 0)) {
                    visited = true;
                    cells[i][j] = new Cell(i, j, visited, blocked);
                    visited = false;
                    continue;
                }
                else {
                    if(i == 100 && j == 100){
                        cells[i][j] = new Cell(i, j, visited, blocked);
                        continue;
                    }

                    blockedProb = (int) (Math.random() * 10);
                    if(blockedProb < 3)
                        blocked = true;
                }

                cells[i][j] = new Cell(i,j, visited, blocked);
                blocked = false;
            }
        }

    }

    public Cell getCell(int x, int y){
        return cells[x][y];
    }



    public void display() {
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[0].length; j++){
                cells[i][j].display();
            }
            System.out.println();
        }

    }
}
