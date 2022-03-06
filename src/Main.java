
public class Main<totalSum> {
    public static void main(String[] args) {
        int addingSum = 500;
        int basicSum = 100;
        int bonus = addingSum / 100;
        int presentSum = bonus + addingSum + basicSum;
        int totalSum;
        if (addingSum >= 1000) {
            totalSum = presentSum;
        } else {totalSum=addingSum+basicSum;

        }
        System.out.println("Итоговая сумма"+totalSum) ;
    }
}