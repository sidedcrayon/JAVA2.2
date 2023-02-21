public class Main {
    public static void main (String[] args) {

        int account = 324;
        int deposit = 1126;

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;

        } else {
            bonus = 0;
        }

        System.out.println("Итоговая сумма = ");
        System.out.println(account + deposit + bonus);
        System.out.println("Количество бонусов =");
        System.out.println(bonus);

    }

}


