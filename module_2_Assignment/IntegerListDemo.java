import java.util.ArrayList;

public class IntegerListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
