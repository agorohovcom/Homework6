public class Main {
    public static void main(String[] args) {

        // Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        // Задача 2
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
        System.out.println();

        // Задача 3
        for (int i = 0; i <= 17; i += 2){
            System.out.println(i);
        }
        System.out.println();

        // Задача 4
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        System.out.println();

        // Задача 5
        for (int i = 1904; i <= 2096; i += 4){
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        // Задача 6
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // Задача 7
        for (int i = 1; i <= 512; i *= 2){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // Задача 8
        int stashPerMonth = 29_000;
        for(int monthNumber = 1; monthNumber <= 12; monthNumber++){
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + stashPerMonth * monthNumber + " рублей");
        }
        System.out.println();

        // Задача 9
        double savingsVolume = 0.0;
        double percentPerYear = 0.12;
        double percentPerMonth = percentPerYear / 12;       // 0.01
        for (int monthNumber = 1; monthNumber <= 12; monthNumber++) {
            savingsVolume += savingsVolume * percentPerMonth + stashPerMonth;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", monthNumber, savingsVolume);
        }
        System.out.println();

        // Задача 10
        for (int i = 1; i <= 10; i++){
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}