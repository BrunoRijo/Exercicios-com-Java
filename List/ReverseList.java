import java.util.ArrayList;
import java.util.List;

/*
Well, I decided to practice making a list and doing it to be reversed and print it's values

Connect me on LinkedIn
https://linkedin.com/in/brunorijo

* */

public class ReverseList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() {{
                add("First ");
                add("Second ");
                add("Thirdh ");
                add("Forth ");
                add("Fifth ");
            }};
        list.forEach(System.out::print);

        List<String> tsil = new ArrayList<>();
        for (int i = list.size()-1; i > 0; i--) {
            tsil.add(list.get(i));
        }
        tsil.forEach(System.out::print);
    }
}

