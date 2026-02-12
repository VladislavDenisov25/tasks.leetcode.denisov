package easy.roman.to.integer;

public class RomanToInteger {

    public int romanToInt(String s) {
        int resultValue = 0;
        char[] charRoman = s.toCharArray();

        for (int i = 0; i < charRoman.length; i++) {
           int current = RomanSymbols.valueOf(String.valueOf(charRoman[i])).getCount();

           if (i + 1 < charRoman.length){
               int next = RomanSymbols.valueOf(String.valueOf(charRoman[i + 1])).getCount();
               if (current < next) {
                   resultValue -= current;
                   continue;
               }
           }
           resultValue += current;
        }
        return resultValue;
    }
    public enum RomanSymbols {

        I(1),
        V (5),
        X (10),
        L (50),
        C (100),
        D(500),
        M(1000);
        private final int count;

        RomanSymbols(int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }
    }
}
