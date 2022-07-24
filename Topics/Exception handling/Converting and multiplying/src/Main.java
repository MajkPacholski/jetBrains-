import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final List<Object> objects = scanElementToList();
        validateList(objects);
    }

    private static void validateList(List<Object> objects) {
        objects.forEach(element -> {
            try {
                System.out.println(Integer.parseInt((String) element) * 10);
            } catch (Exception exception){
                System.out.println("Invalid user input: " + element);
            }
        });
    }

    public static List<Object> scanElementToList() {
        List<Object> objectList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        while (!"0".equals(line)) {
            objectList.add(line);
            line = scan.nextLine();
        }
        return objectList;
    }
}