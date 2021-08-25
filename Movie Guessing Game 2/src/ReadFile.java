
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public ArrayList<String> movieName = new ArrayList<String>();
    public void fileReader() {
        try {
            File myFile = new File("movies.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String name = myReader.nextLine();
                movieName.add(name);
            }
            myReader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An Error Occurred.");
            e.printStackTrace();
        }
    }


}