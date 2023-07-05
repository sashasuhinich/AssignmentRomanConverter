import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Converting {
    private final Map<Integer , String> roman_numbers = new LinkedHashMap<>();
    {
        roman_numbers.put(1000, "M");
        roman_numbers.put(900, "CM");
        roman_numbers.put(500, "D");
        roman_numbers.put(400, "CD");
        roman_numbers.put(100, "C");
        roman_numbers.put(90, "XC");
        roman_numbers.put(50, "L");
        roman_numbers.put(40, "XL");
        roman_numbers.put(10, "X");
        roman_numbers.put(9, "IX");
        roman_numbers.put(5, "V");
        roman_numbers.put(4, "IV");
        roman_numbers.put(1, "I");
    }

    public String convertingIntoRomanNumbers(int number){
        StringBuilder convertedNumber = new StringBuilder();
        for (Map.Entry<Integer, String> entry : roman_numbers.entrySet()) {
            int value = entry.getKey();
            String numeral = entry.getValue();

            while (number >= value) {
                convertedNumber.append(numeral);
                number -= value;
            }
        }
        return convertedNumber.toString();
    }

}
