import easy.merge.two.sorted.lists.ListNode;
import easy.merge.two.sorted.lists.RemoveDuplicates;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {
    static RemoveDuplicates removeDuplicates;

    @ParameterizedTest
    @MethodSource("listProvider")
    public void dublicateTest(ListNode node){
        removeDuplicates = new RemoveDuplicates();
        String string = removeDuplicates.deleteDuplicates(node).toString();
        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3))).toString(), string);
    }

    static Stream<ListNode> listProvider() {
        return Stream.of(
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(3)))))
        );
    }
}
