package src.Lesson36;

import java.io.*;
import java.util.*;

public class Model {

    private String fileName;

    public Model(String fileName) {
        this.fileName = fileName;
    }

    public void saveData() throws FileNotFoundException, IOException{
        if (Controller.films.size() > 0) {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
                oos.writeObject(Controller.films);
        }
    }

    public LinkedHashMap<Integer, Film> loadData() throws FileNotFoundException, IOException, ClassNotFoundException{

        File file = new File(fileName);
        if (file.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            return (LinkedHashMap<Integer, Film>) ois.readObject();
        }else
            return new LinkedHashMap<>();
    }
}


