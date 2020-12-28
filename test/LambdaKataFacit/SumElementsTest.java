package LambdaKataFacit;


import java.util.List;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import LambdaKata.SumElements;
import org.junit.jupiter.api.Test;

/*

Sum all elements of a collection

 */

public class SumElementsTest {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {

        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        int result = SumElements.calculate(numbers);
        
        assertEquals(result, 1 + 2 + 3 + 4 + 5);
    }
}
