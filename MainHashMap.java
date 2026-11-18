import java.util.HashMap;

public class MainHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");

        System.out.println("STUDENT RECORDS");

        for (Integer key : students.keySet()) {
            System.out.println(key + " - " + students.get(key));
        }
    }
}
