import java.io.FileReader;

public class Main {


    public static void main(String[] args) {
        String nazwapliku = "plik.txt"; //to idzie od czarka
        String nazwawyjsciowego = "plikout.txt";  //to idzie od czarka
        int genNumber = 10; //to idzie od czarka
        int x = 10; //to idzie od czarka
        int y = 10; //to idzie od czarka


        FileReader read = new FileReader(nazwapliku, x, y);

        read.readFileWW();

        Grid myGrid = new Grid(x, y);

        read.printGrid();






    }
}
