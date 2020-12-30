package LambdaKata;

import java.util.List;
import java.util.stream.Collectors;


public class FlattenCollection {

    public static List<String> transform(List<List<String>> l){
      return l.stream().flatMap(element->element.stream()).collect(Collectors.toList());
        //  throw new UnsupportedOperationException("Not supported yet.");
    }

    //valfri att implementera
    static List<String> goingDeeper(List<List<List<String>>> collection) {
   return collection.stream().flatMap(element->element.stream()).flatMap(element2->element2.stream()).collect(Collectors.toList());
        //     throw new UnsupportedOperationException("Not supported yet.");
    }
}
