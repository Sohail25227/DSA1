package Day4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie","Ahmad","Alice", "Bob", "Charlie","Ahmad");
        names.stream()
             .filter(name -> name.startsWith("A")).forEach(System.out::println);

        Stream<String> filteredStream=names.stream().filter((name)->name.length()<4);
        List<String> nameList=filteredStream.collect(Collectors.toList());
        System.out.println(nameList);

        Stream<String> filteredName2=names.stream().map((name)->name.toLowerCase());
        List<String> lowerNameList=filteredName2.collect(Collectors.toList());
        System.out.println(lowerNameList);

        List<List<String>> list2=List.of(List.of("hello","world"),
        List.of("Namaste","Dunia"));
        System.out.println(list2);
        Stream<String> st2=list2.stream().flatMap((sentence)->sentence.stream());
        List<String> st2Result=st2.collect(Collectors.toList());
        System.out.println(st2Result);

        names.stream().distinct().sorted().forEach(n -> System.out.print(n + " "));
    }
}
