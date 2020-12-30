package LambdaKata;

import java.util.List;
import java.util.stream.Collectors;


public class LessThanFour {

    public static List<String> transform(List<String> l){
      return l.stream().filter(s->s.length() <4).collect(Collectors.toList());
        //  throw new UnsupportedOperationException("Not supported yet.");
    }
}
