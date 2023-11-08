// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1{
    
       // Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Иванов Иван", 123, bookPhone);
        addNumber("Иванов Иван", 1234, bookPhone);
        addNumber("Петров Сергей", 546585, bookPhone);
        addNumber("Сидоров Анатолий", 8956477, bookPhone);
        addNumber("Иванов Иван", 12356233, bookPhone);
        addNumber("Петров Сергей", 787897, bookPhone);
        addNumber("Гордеева Анна", 78754637, bookPhone);
        addNumber("Борисова Людмила", 765897, bookPhone);
        printBook(bookPhone);
       }
}