import easy.task88.MergeSortedArray;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class Task88Test {

    @Disabled
    @ParameterizedTest
    @MethodSource("mergeData")
    public void mergeTest(int[] nums1, int m, int[] nums2, int n, int[] res){
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(res, nums1);
    }

    static Stream<Arguments> mergeData() {
        return Stream.of(
                Arguments.of(
                        new int[]{1,2,3,0,0,0}, 3,
                        new int[]{2,5,6}, 3,
                        new int[]{1,2,2,3,5,6}
                )
        );
    }
}
