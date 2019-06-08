public class Grid {
    int xSize;
    int ySize;
    Cell[][] grid;


    public  Grid (int xSize, int ySize){
        this.xSize = xSize;
        this.ySize = ySize;
        this.grid = new Cell[xSize][ySize];
    }

    public int getxSize() {
        return xSize;
    }

    public int getySize() {
        return ySize;
    }

    public void setCellAtIndex(int x, int y, Cell state){
        this.grid[x][y] = state;
    }

    void fillGrid(int x, int y, )

    void fillGrid(int x, int y, Cell cell, String[][] temp){
        for(int i = 0; i < x; i++){
            for (int j = 0; j < y; j++)
            {
                switch (temp[i][j]){
                    case "E":
                        this.grid[i][j] = new Head();
                        break;
                    case"C":
                        this.grid


                }
            }
        }

    }


    public Cell[][] getGrid(){
        return this.grid;
    }

    public Cell getCell(int x, int y){
        return this.grid[x][y];
    }
}
