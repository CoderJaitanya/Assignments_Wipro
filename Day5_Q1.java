import java.util.*;

interface StringProcessor {
    String p(String str);
}

public class Day5_Q1 {
    public static void main(String[] args) {
   
        List<String> s = Arrays.asList("Jaitanya", "Raj", "Aman", "Ashish", "Smarth");

        s.sort((s1, s2) -> s2.compareTo(s1));                                 // Lambda Expression

        System.out.println("-----------------Decreasing order of list :------------------");
        s.forEach(System.out::println);

        StringProcessor tuc = str -> str.toUpperCase();                       // Lambda Expression

        System.out.println("-----------------Converted to Uppercase :--------------------");
        s.forEach(str -> System.out.println(tuc.p(str)));
    }
}