public class Main {
    public static void main(String[] args) {
        // your code here
    }

    public static String fizzBuzzString(String str) {
        if (str == "") return null;
        if (str == "f") return "Fizz";
        if (str == "b") return "Buzz";
        if(str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";
        return str;
    }


}
