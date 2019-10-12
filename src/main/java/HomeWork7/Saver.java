package HomeWork7;

import java.io.*;

@SaveTo(path = "d:\\file.txt", method = "save")
public class Saver {
    public static void save (String filename){
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(TextContainer.text);
            writer.close();

        } catch(IOException ex) {
            ex.printStackTrace();
        }

    }
}
