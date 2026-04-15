package sessia3;

public class StringUtils {
    //1. Метод для проверки, является ли строка палиндромом (игнорируя регистр и пробелы):
    //boolean isPalindrome(String str).
    //2. Метод для подсчета количества вхождений подстроки в строке:
    //int countSubstringOccurrences(String str, String substring).
    //3. Метод для удаления всех гласных из строки:
    //String removeVowels(String str).

    public boolean isPalindrome(String str){
        String cleaned = str.toLowerCase().replaceAll(" ", "");
        String revers = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(revers);
    }

    public int countSubstringOccurrences(String str, String substring){
        int count = 0;
        for(int i = 0; i <= str.length() - substring.length(); i++){
            String part = str.substring(i,i + substring.length());
            if(part.equals(substring)){
                count++;
            }
        }
        return count;
    }

    public String removeVowels(String str){
        return str.replaceAll("[aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ]", "");
    }
}
