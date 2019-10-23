import java.util.Scanner;

abstract class Master{
    // Notify the player that its their turn
    abstract void notifyPlayer();
    
    // Ask user which row they want to remove rocks/cards from
    abstract char getUserRow(); {
    Scanner myObj = new Scanner(System.in);
    String x = myObj.nextLine();
    System.out.println("What row:"+ x);
    myObj.close();    
    }
    
    // ask user how many elements they want to remove
    abstract int getUserElements(); {    
    }
}
class player extends Master {
    String Name;
    player(String inName) {
        name = inName;
    }
}