import easy.task136.SingleNumber;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class SingleNumberTest {

    @Disabled
    @ParameterizedTest
    @MethodSource("init")
    public void singleNUmber(int[] ints, int result) {
        SingleNumber singleNumber = new SingleNumber();
        int single = singleNumber.single(ints);
        assertEquals(result, single);

    }


    public static Stream<Arguments> init() {
        return Stream.of(Arguments.of(new int[]{4, 1, 2, 1, 2}, 4));
    }
}
