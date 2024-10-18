package boardgame;

public class Position {

    private int row;
    private int col;

    public Position(int row, int column) {
        this.row = row;
        this.col = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return col;
    }

    public void setColumn(int column) {
        this.col = column;
    }

    @Override
    public String toString() {
        return row + ", " + col;
    }
}
