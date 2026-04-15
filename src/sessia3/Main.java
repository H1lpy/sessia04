package sessia3;

public class Main {
    public static void main(String[] args){
        StringUtils su = new StringUtils();

        System.out.println(su.isPalindrome("А роза упала на лапу Азора"));
        System.out.println(su.countSubstringOccurrences("asdasd", "asd"));
        System.out.println(su.removeVowels("Привет, мир!"));
    }
}
