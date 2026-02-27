import easy.add.binary.AddBinary;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {

    static AddBinary addBinary;

@Disabled
    @ParameterizedTest
    @CsvSource({"11, 1, 100"})
    public void sumTest(String a, String b, String result) {
        addBinary = new AddBinary();
        String s = addBinary.addBinary(a, b);
        assertEquals(result, s);
    }

}
