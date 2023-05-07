package cellulantChallenge;
 
public class Main {

    private static int digitInput(int number){
        return number;
    }

    private static String reverseString(String str){
        String reverse = "";


        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }

    private static String decimalToOctal(int number){
        int remainder;
        String result = "";
        while (number > 0){
            remainder = number % 8;
            result = result + remainder;
            number = number / 8;
        }
        result = reverseString(result);
        //int int_result = Integer.parseInt(result);
        return result;
    }

    private static String digitAddition(String octalNumber){
        int sum = 0;
        for(int i = 0; i < octalNumber.length(); i++) {
            sum = sum + Integer.parseInt(String.valueOf(octalNumber.charAt(i)));
        }
        return decimalToOctal(sum);
    }

    private static String appendChecksum(String number, String checksum){
        String validNumber = number + "" + checksum;
        System.out.println(validNumber);
        return validNumber;
    }

    private static boolean validateScratchCard(String cardNumber){
        if(!String.valueOf(cardNumber.charAt(5)).equals("-") || !String.valueOf(cardNumber.charAt(11)).equals("-") ||
                !String.valueOf(cardNumber.charAt(17)).equals("-") || cardNumber.length() != 23){
            System.out.println("Card is invalid!");
            return false;
        }
        String[] NumberArray = cardNumber.split("-", 4);
        for(int i = 0; i <= 3; i++){
            int number = digitInput(Integer.parseInt(NumberArray[i]));
            String numberToString = String.valueOf(number);
            StringBuilder stringBuilder = new StringBuilder(numberToString);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            String NewNumberToString = stringBuilder.toString();
            number = Integer.parseInt(NewNumberToString);

            String octalNumber = decimalToOctal(number);
            String octalSum = digitAddition(octalNumber);
            int int_OctalSum = Integer.parseInt(octalSum);
            while(int_OctalSum > 9){
                octalSum = digitAddition(octalSum);
                int_OctalSum = Integer.parseInt(octalSum);
            }
            if (int_OctalSum != Character.getNumericValue(numberToString.charAt(numberToString.length()-1))){
                System.out.println("Card is invalid!");
                return false;
            }
        }
        System.out.println("Card is valid.");
        return true;
    }

    public static void main(String[] args) {
        int number = digitInput(623);
        String octalNumber = decimalToOctal(number);
        String octalSum = digitAddition(octalNumber);
        int int_OctalSum = Integer.parseInt(octalSum);
        while(int_OctalSum > 9){
            octalSum = digitAddition(octalSum);
            int_OctalSum = Integer.parseInt(octalSum);
        }
        String validNumber = appendChecksum(String.valueOf(number), octalSum);
//        validateScratchCard("10006-12342-00081-99993"); // Card format is ####-####-####-####
    }
}