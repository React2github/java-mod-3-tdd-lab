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
            if(newArray[i].startsWith("f") &&  (!newArray[i].endsWith("b"))) response[i] = "Fizz";
            if(newArray[i].endsWith("b") &&  (!newArray[i].startsWith("f"))) response[i] = "Buzz";
            if (newArray[i].startsWith("f") && newArray[i].endsWith("b")) response[i] = "FizzBuzz";
        }
        return response;

    }

}
