import java.util.Random;

public class GameGrid {

    public class DotState{
        public DotState() {
            this.hit=false;
            this.occupied=false;
        }


        public boolean isOccupied() {
            return occupied;
        }

        public void setOccupied(boolean occupied) {
            this.occupied = occupied;
        }

        boolean occupied;

        public boolean isHit() {
            return hit;
        }

        public void setHit(boolean hit) {
            this.hit = hit;
        }

        boolean hit;
    }

    public class DotGrid{
        DotState[] []gridLocation;
        public DotGrid(){
            Random rand = new Random();
            this.gridLocation = new DotState[10][10];

            int start = rand.nextInt(5);
            for(int i =0; i <10; i++) {
                for (int j=0; j <10; j++){
                this.gridLocation[i][j]= new DotState();
                }
            }
        }
        public void setOcuppancy(int row, int col){
            this.gridLocation[row][col].setOccupied(true);
        }

    }


}
