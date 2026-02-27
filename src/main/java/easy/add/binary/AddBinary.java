package easy.add.binary;

public class AddBinary {
    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1; //крайний правый чар строки
        int carry = 0; // перенос

        while (i >= 0 || j >= 0 || carry != 0) { // пока есть чары в строках или есть перенос
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0; // получаем 1 или 0 вычитая чар из чара или число 0 если пусто

            int sum = bitA + bitB + carry; // сумма ряда

            result.append(sum % 2); // добавляем чар
            carry = sum / 2; // определяем перенос

            i--;
            j--; // движение по строчке
        }
        return result.reverse().toString(); // переворот итоговой строки
    }
}
