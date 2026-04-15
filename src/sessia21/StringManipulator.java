package sessia21;

public class StringManipulator {

    //Класс StringManipulator
    //1. Метод для проверки, является ли строка палиндромом:
    //boolean isPalindrome(String str).
    //2. Метод для подсчета количества гласных в строке:
    //int countVowels(String str).
    //3. Метод для реверсирования строки:
    //String reverse(String str).

    public boolean isPalindrome(String str){
        String cleaned = str.toLowerCase().replace(" ", "");
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    int countVowels(String str){
        int count = 0;
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        for(int i = 0; i<str.length(); i++){
            if(vowels.indexOf(str.charAt(i)) != -1) count++;
        }
        return count;
    }

    public String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
