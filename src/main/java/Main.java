// import java.util.ArrayList;
// import java.util.List;

public class Main {
 
    public static void main(String[] args) {
        // int[] myarray = {1,2,3};
        // printArray(myarray);
    }

    public static String fizzBuzzString(String str) {
        if (str.isEmpty()) return null;
        if (str.startsWith("f") && (!str.endsWith("b"))) return "Fizz";
        if (str.endsWith("b") && (!str.startsWith("f"))) return "Buzz";
        if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";
        return str;
    }


    public static String[] fizzBuzzArrays() {
        String[] newArray = {"fib", "fb", "fix"};
        String[] response = {"", "", ""};
        for(int i=0; i< newArray.length; i++) {
           response[i] = fizzBuzzString(newArray[i]);
        }
        return response;
    }

}
