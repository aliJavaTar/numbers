import java.util.regex.Pattern;

public class Numbers {

    int[] arrayNumber = new int[10];

    /*
    array number
   ---------------------------
    get this number = 176421

   [ 0 ]  = 0
   [ 1 ]  = 2
   [ 2 ]  = 1
   [ 3 ]  = 0
   [ 4 ]  = 1
   [ 5 ]  = 0
   [ 6 ]  = 1
   [ 7 ]  = 1
   [ 8 ]  = 0
   [ 9 ]  = 0

     */
    public char isDouDigit(String number) {
        placement(number);

        for (int i : arrayNumber) {
            if (i > 1)
                return 'y';
        }
        return 'n';
    }

    private void placement(String number) {
        if (isValidNumber(number))
        {
            for (int index = 0; index < number.length(); index++) {
                char num = number.charAt(index);
                plusNumberOfHome(num);
            }
        } else System.out.println("just Enter digit between [ 0 ] and [ 9 ]");
    }

    public void plusNumberOfHome(char character) {
        Integer integer = convertToInteger(character);
        arrayNumber[integer]++;
    }

    public Integer convertToInteger(char value) {
        return (int) value - 48;
    }

    public boolean isValidNumber(String text) {
        String regex = "^([0-9])+$";
        return Pattern.matches(regex, text);
    }
}
