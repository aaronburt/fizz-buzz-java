import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {
    public static List<String> fizzBuzz(){
        LinkedList<String> list = new LinkedList<String>();
        for(int i = 1; i <= 1000; i++){
            String fizz = i % 3 == 0 ? "Fizz" : "";
            String buzz = i % 5 == 0 ? "Buzz" : "";
            String result = (fizz + buzz).isEmpty() ? String.valueOf(i) : fizz + buzz;
            list.add(result);
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz());
    }
}

