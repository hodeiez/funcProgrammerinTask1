package LambdaKata;

import java.util.List;
import static java.util.stream.Collectors.toList;


public class KidsNames {
    
      public static List<String> getKidNames(List<Person> people) {
       return people.stream().filter(p->p.getAge()<18).map(Person::getName).collect(toList());
          //throw new UnsupportedOperationException("Not supported yet.");
    }

}

