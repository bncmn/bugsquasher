package ca.sfu.dbuencam.mineseeker.model;

public class UserOptions {
    private int columns;
    private int rows;
    private int numMines;

    private static UserOptions instance;
    public static UserOptions getInstance(){
        if(instance == null)
            instance = new UserOptions(6, 4, 6);
        return instance;
    }

    public UserOptions(int columns, int rows, int numMines){
        this.columns = columns;
        this.rows = rows;
        this.numMines = numMines;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getNumMines() {
        return numMines;
    }

    public void setNumMines(int numMines) {
        this.numMines = numMines;
    }
}
