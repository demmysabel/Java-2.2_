
public class Main<totalSum> {
    public static void main(String[] args) {
        int addingSum = 1000;
        int basicSum = 100;
        int totalSum;
        if (addingSum >= 1000) {
            int bonus = addingSum / 100;
            int presentSum = bonus + addingSum + basicSum;
            totalSum = presentSum;
        } else {totalSum=addingSum+basicSum;

        }
        System.out.println("Итоговая сумма"+totalSum) ;
    }
}