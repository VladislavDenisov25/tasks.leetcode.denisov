import easy.climbing.stairs.ClimbingStairs;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {

    static ClimbingStairs climbingStairs;

    @ParameterizedTest
    @ValueSource(ints = 45)
    public void fibonachiTest(int n){
        climbingStairs = new ClimbingStairs();
        int i = climbingStairs.climbStairs(n);
        assertEquals(1836311903, i);
    }
}
