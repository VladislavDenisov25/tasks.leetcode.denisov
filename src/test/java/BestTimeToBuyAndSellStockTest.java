import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import task121.BestTimeToBuyAndSellStock;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockTest {

    @ParameterizedTest
    @MethodSource("inializInts")
    public void priceMaxTest(int[] ints, int result){
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int i = bestTimeToBuyAndSellStock.maxProfit(ints);
        assertEquals(result, i);
    }

    static Stream<Arguments> inializInts() {
        return Stream.of(Arguments.of(new int[]{1,2}, 1));
    }
}
