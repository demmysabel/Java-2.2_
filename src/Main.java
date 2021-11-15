
public class Main {
    public static void main(String[] args) {
        int addingSum = 500;
        int basicSum = 100;
        int bonus = addingSum / 100;
        int PresentSum = bonus + addingSum + basicSum;
        int noPresent = addingSum+basicSum;
        int totalSum;
        if (addingSum < 1000) {
            totalSum = noPresent;
        } else {
            totalSum=PresentSum;

        }
        System.out.println("Итоговая сумма"+totalSum);
    }
}