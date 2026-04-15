package sessia19;

public class NumberStringOperations {
    //1. Метод для нахождения суммы цифр числа, представленного в виде строки:
    //int sumDigitsInString(String str).
    //2. Метод для нахождения произведения цифр числа, представленного в виде строки:
    //long productDigitsInString(String str).
    //3. Метод для проверки, является ли строка числом, кратным 5:
    //boolean isMultipleOf5(String str).

    public int sumDigitsInString(String str){
        int sum = 0;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            sum += Character.getNumericValue(ch);
        }
        return sum;
    }

    public long productDigitsInString(String str){
        long pr = 1;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            pr *= Character.getNumericValue(ch);
        }
        return pr;
    }

    public boolean isMultipleOf5(String str){
        return Integer.parseInt(str) % 5 == 0;
    }
}
