package sessia13;

public class StringCalculator {

    //1. Реализуйте класс с тремя методами.
    //2. Написать тестовый класс с использованием JUnit
    //3. Покрыть каждый метод класса тестами для достижения 100% покрытия кода.
    //Класс StringCalculator
    //1. Метод для подсчета количества символов в строке:
    //int countCharacters(String str).
    //2. Метод для подсчета количества вхождений символа в строке:
    //int countCharOccurrences(String str, char target).
    //3. Метод для замены всех вхождений символа в строке:
    //String replaceChar(String str, char oldChar, char newChar).

    public int countCharacters(String str){
        return str.length();
    }

    public int countCharOccurrences(String str, char target){
        String lower_str = str.toLowerCase();
        int count = 0;
        while (lower_str.contains(String.valueOf(target))) {
            count++;
            lower_str = lower_str.replace(String.valueOf(target),"");
        }
        return count;
    }

    public int countCharOccurrences2(String str, char target){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target) count++;
        }
        return count;
    }


}
