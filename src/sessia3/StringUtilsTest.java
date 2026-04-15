package sessia3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void isPalindromeTest(){
        StringUtils su = new StringUtils();
        boolean isResult = true;
        assertEquals(isResult, su.isPalindrome("А роза упала на лапу Азора"));
    }

    @Test
    public void countSubstringOccurrencesTest(){
        StringUtils su = new StringUtils();
        int isResult = 2;
        assertEquals(isResult, su.countSubstringOccurrences("asdagb", "a"));
    }

    @Test
    public void removeVowelsTest(){
        StringUtils su = new StringUtils();
        String isResult = " рз пл н лп зр";
        assertEquals(isResult, su.removeVowels("А роза упала на лапу Азора"));
    }
}
