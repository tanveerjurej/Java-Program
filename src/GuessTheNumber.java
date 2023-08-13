import java.util.Random;
import java.util.Scanner;

class game{
    Random rand=new Random();
    Scanner n=new Scanner(System.in);

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public Random getRand() {
        return rand;
    }

    public void setN(Scanner n) {
        this.n = n;
    }

    public Scanner getN() {
        return n;
    }
}





public class GuessTheNumber {
    public static void main(String[] args) {
        game g = new game();

    }
}
