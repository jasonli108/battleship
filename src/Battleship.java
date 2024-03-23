
public class Battleship{
    public GameCoordinate[] getLocationList() {
        return locationList;
    }
    public void setLocationList(GameCoordinate[] locationList) {
        this.locationList = locationList;
    }

    public Battleship(String name, int size, boolean isSunk) {
        this.name = name;
        this.size = size;
        this.locationList = new GameCoordinate[size];
        this.isSunk = isSunk;
    }

    public boolean isSunk() {
        return isSunk;
    }

    public void setSunk(boolean sunk) {
        isSunk = sunk;
    }

    public class GameCoordinate {

        int row;

        public GameCoordinate(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public int getColumn() {
            return column;
        }

        public void setColumn(int column) {
            this.column = column;
        }

        int column;

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }
    }
        String name;
        int size;
        GameCoordinate[] locationList;
        boolean isSunk;

}
