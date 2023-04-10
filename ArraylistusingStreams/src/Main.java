import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<String> l1= Arrays.asList(
//                "PHi", "PI", "pAM", "Srinivasan","R","Bashyam"
//        );
//
////        l1.forEach(n->{
////            if(n.toUpperCase().startsWith("P")){
////               // System.out.println(n);
////            }
////        });
//        l1
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.startsWith("P"))
//                .sorted()
//                .forEach(System.out::println);


        Stream<String> n1=Stream.of("I26","I27","I28","I29");
        Stream<String> n2=Stream.of("N40","N36","I23");
        Stream<String> con=Stream.concat(n1,n2);


        System.out.println(con.distinct().peek(System.out::println).count());
    }

    List country = Stream.of(Arrays.asList("Colombia", "Finland", "Greece", "Iceland", "Liberia", "Mali", "Mauritius")
            ,  Arrays.asList("Peru", "Serbia", "Singapore", "Turkey", "Uzbekistan", "Yemen", "Zimbabwe", "Greece", "Iceland")).flatMap(List::stream).collect(Collectors.toList());
}

