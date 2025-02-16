package src.Lesson36;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class View {

    private static Scanner scanner = new Scanner(System.in);
    static Map<String, String> dictionary;

    public View() {
        dictionary = new LinkedHashMap<>();

        dictionary.put("name", "название");
        dictionary.put("genre", "жанр");
        dictionary.put("director", "режиссер");
        dictionary.put("year", "год");
        dictionary.put("duration", "длительность");
        dictionary.put("company", "студия");
        dictionary.put("actors", "актеры");
    }

    public String getAnswer() {
        String header = "=".repeat(5) + " Редактирование данных каталога фильмов " + "=".repeat(5);
        System.out.println(header);
        System.out.println("Действия с фильмами:");
        System.out.println("1 - добавление фильма");
        System.out.println("2 - каталог фильмов");
        System.out.println("3 - просмотр определенного фильма");
        System.out.println("4 - удаление фильма");
        System.out.println("q - выход из программы");
        System.out.println("=".repeat(header.length()));
        System.out.print("Выберите вариант действия: ");
        String result = scanner.nextLine();

        return result;
    }

    public void addFilm() {
        Film film = new Film();

        for (Map.Entry dict : dictionary.entrySet()) {
            System.out.print(dict.getValue() + (dict.getKey().equals("actors") ? " (через запятую)" : "") + ": ");
            film.setField((String) dict.getKey(), scanner.nextLine());
        }

        Controller.films.put(Controller.films.size() + 1, film);
    }

    public void showCatalog() {
        if (Controller.films.size() == 0) {
            System.out.println("Каталог фильмов пустой");
        }else {
            for (Map.Entry film : Controller.films.entrySet()) {
                System.out.println(film.getKey() + " - " + film.getValue());
            };
        }
    }

    public void showFilmDetales(Controller controller) {
        System.out.print("Номер фильма в каталоге: ");
        int nom = Integer.valueOf(scanner.nextLine());

        System.out.println(controller.getFilmDetales(nom, dictionary));

    }

    public void deleteFilm(Controller controller){
        System.out.print("Номер фильма в каталоге: ");
        int nom = Integer.valueOf(scanner.nextLine());

        System.out.println(controller.deleteFilm(nom));
    }
}
