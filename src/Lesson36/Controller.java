package src.Lesson36;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.*;

public class Controller {

    private Model model;
    private View view;
    static LinkedHashMap<Integer, Film> films;

    public Controller() {
        model = new Model("data.dat");
        view = new View();

        initialize();
    }

    private void initialize(){
        try{
            films = model.loadData();
        } catch (IOException e){
            e.getMessage();
        } catch (ClassNotFoundException e){
            e.getMessage();
        }catch (Exception e){
            films = new LinkedHashMap<>();
        }


    }

    public void run() {

        initialize();

        boolean cont = true;
        while (cont){
            String answer = view.getAnswer();
            switch (answer){
                case "1" -> view.addFilm();
                case "2" -> view.showCatalog();
                case "3" -> view.showFilmDetales(this);
                case "4" -> view.deleteFilm(this);
                case "q" -> cont = false;
                default -> System.out.println("Неверный выбор");
            }
        }

        try{
            model.saveData();
        }catch (Exception e){
            e.getMessage();
        }
    }

    public String getFilmDetales(int nom, Map<String, String> dictionary){
        if (nom > films.size()) return "Фильм с номером " + nom + " в каталоге не найден";
        else{
            Film film = films.get(nom);
            try {
                return "Данные фильма с номером " + nom +
                        film.showFilmDetales(dictionary);
            }catch (Exception e){
                return e.getMessage();
            }
        }
    }

    public String deleteFilm(Integer nom){
        if (nom > films.size()) return "Фильм с номером " + nom + " в каталоге не найден";
        else {
            Film film = films.get(nom);
            String result = "Фильм " + nom + " - " + film + " удален";
            films.remove(nom);

            return result;
        }
    }
}

class Film implements Serializable {

    private String name;
    private String genre;
    private String director;
    private String year;
    private String duration;
    private String company;
    private ArrayList<String> actors;

    public Film() {
        actors = new ArrayList<>();
    }

    public void setField(String fieldName, String value) {
        try {
            if (fieldName.equals("actors")) {
                String[] actors = value.split(",");
                Collections.addAll(this.actors, actors);
            }else {
                Field field = this.getClass().getDeclaredField(fieldName);
                field.set(this, value);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String showFilmDetales(Map<String, String> dictionary) throws NoSuchFieldException, IllegalAccessException{
        String result = "";
        for (Map.Entry<String, String> field : dictionary.entrySet()){
            result += "\n";
            Field f = this.getClass().getDeclaredField(field.getKey());
            Object data = f.get(this);
            result += field.getValue() + ": ";
            if (field.getKey().equals("actors")){
                 result += String.join(", ", (ArrayList<String>) data);
            }else result += (String) data;
        }
        return result;
    }

}