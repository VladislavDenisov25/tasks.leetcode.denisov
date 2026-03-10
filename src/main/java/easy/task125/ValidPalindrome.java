package easy.task125;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String[] array = s.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> (char) c)
                .map(c -> c.toString())
                .toArray(String[]::new);

        for (int i = 0; i < array.length / 2; i++) {
            if (!(array[i].equalsIgnoreCase(array[array.length - i - 1]))){
                return false;
            }

        }
        return true;
    }
}
