package programmingPractise.interviewQuestions.genericInterviewAsked;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Problem1 {
//The player name is checked for the number of vowels(a,e,i,o,u) which form the first digit x. If number of vowels is more than 1 digit number the digits are added to get x.
//The year of birth is added among itself to form the second digit y. Again if the sum is more than 1 digit number then the digits are added to get y.And finally the lucky alphabet is converted into
// number(A/a = 1, --Z/z = 26)to for the third digit Z.Also if the converted number is more then one digit number then digits are added to z.
//Contraint: Length of player name is less than 50
//Input
//sam
//1000
//a

//output
//111
//1

    public static void main(String[] args) {
        System.out.println(getCompleteNumber("aeiouaeiouaeiou", 1993, 'z'));
    }

    public static int getCompleteNumber(String name, int yearOfBirth, char luckyAlphabet) {
        int x = getSingleDigitNumberOutOfName(name);
        int y = getSingleDigitNumberFromDateOfBirth(yearOfBirth);
        int z = getSingleDigitFromCharacterAlphabet(luckyAlphabet);
        return (x * 100) + (y * 10) + (z * 1);
    }


    public static int getSingleDigitNumberOutOfName(String name) {
        name = name.toLowerCase();
        int count = 0;
        //use Regex to achieve the same
        for (int i = 0; i < name.length(); i++) {
            char extractedChanracter = name.charAt(i);
            if (extractedChanracter == 'a' || extractedChanracter == 'e' || extractedChanracter == 'i' || extractedChanracter == 'o' || extractedChanracter == 'u') {
                count++;
            }
        }
        while (count >= 10) {
            int unitDigit = count % 10;
            int base10Digit = count / 10;
            count = unitDigit + base10Digit;
        }
        return count;
    }


    public static int getSingleDigitNumberFromDateOfBirth(int yearOfBirth) {
        int requiredYOB = 0;
        do {
            requiredYOB += (yearOfBirth % 10);
            yearOfBirth = yearOfBirth / 10;
        } while (yearOfBirth / 10 != 0);
        requiredYOB = requiredYOB + yearOfBirth;

        while (requiredYOB >= 10) {
            int unitDigit = requiredYOB % 10;
            int base10Digit = requiredYOB / 10;
            requiredYOB = unitDigit + base10Digit;
        }
        return requiredYOB;
    }

//First way
    public static int getSingleDigitFromAlphabet(char luckyAlphabet) {
        //use index of list
        String alphaBet = new Character(luckyAlphabet).toString().toUpperCase();
        char[] ch = alphaBet.toCharArray();
        String allAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        HashMap alphabetInterMap = new HashMap();
        for (int i = 0; i < allAlphabets.length(); i++) {
            alphabetInterMap.put(allAlphabets.charAt(i), i + 1);
        }

        int requiredDigit = (Integer) alphabetInterMap.get(ch[0]);
        while (requiredDigit >= 10) {
            int unitDigit = requiredDigit % 10;
            int base10Digit = requiredDigit / 10;
            requiredDigit = unitDigit + base10Digit;
        }
        return requiredDigit;
    }

    //Second way
    public static int getSingleDigitFromCharacterAlphabet(char luckyAlphabet) {
        String alphaBet = new Character(luckyAlphabet).toString().toUpperCase();
        List alphabetList = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
        int requiredDigit= alphabetList.indexOf(alphaBet)+1;
        while (requiredDigit >= 10) {
            int unitDigit = requiredDigit % 10;
            int base10Digit = requiredDigit / 10;
            requiredDigit = unitDigit + base10Digit;
        }
        return requiredDigit;
    }

}


