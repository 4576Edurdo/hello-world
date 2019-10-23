import java.util.Random;

public class Row {
    int rock;
    Row(){
        Random ran = new Random();
        rock = ran.nextInt(3)+1;
    }
    int getNumRocks() {
        return rock;
    }
    void remRock(int delRocks) {
        rock-= delRocks;
    }
    boolean isEmpty() {
        if(rock <= 0)
            return true;
        else
            return false;
    }
    void displayRow() {
        for(int i=0 ; i<rock ; i++){
            System.out.print("0");
        }
        System.out.println();
    }
}