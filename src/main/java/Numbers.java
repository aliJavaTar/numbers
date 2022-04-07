import java.util.regex.Pattern;

public class Numbers {
    char[] arrayNumber = new char[10];

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
        if (isValidNumber(number))
        {
            for (int index = 0; index < number.length(); index++)
            {
                char num = number.charAt(index);
                arrayNumber[num] = num;
            }
        }

        return 'n';
    }

    public boolean isValidNumber(String text) {
        String regex = "^([0-9])+$";
        return Pattern.matches(regex, text);
    }
}
