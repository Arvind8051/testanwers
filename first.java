import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class first {
    public static void main(String[] args)  {
        //read the data from file1
        try (FileReader fr = new FileReader("file1.txt")) {
            int i;
                while ((i=fr.read())!= -1) {
                    System.out.println((char) i);
                }
            }
        catch (IOException e) {
            e.printStackTrace();
        }
        //write the data in file2.
        try (FileWriter fw = new FileWriter("file2.txt")) {
            fw.write("this is a test");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
