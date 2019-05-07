public class Second {
    // ctrl + alt + l
    public static void main(String[] args) {
        t1();
        t2();
        t3();
    }

    public static void t1() {
        System.out.println("Масив з усіх непарних чисел від 1 до 99");
        int[] mas = new int[50];
        int j = 1;
        for (int i = 0; i < mas.length; i++, j += 2) {
            mas[i] = j;
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println("\n");
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
        System.out.println("\n\n");

    }


    public static void t2() {
        System.out.println(" 8 випадкових цілих чисел з відрізка [1; 10]");
        int[] mas = {2, 7, 5, 9, 2, 7, 5, 9};

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 1) mas[i] = 0;
        }
        System.out.println("\n");

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println("\n\n\n");

    }

    public static void t3() {
        System.out.println("день тижня");
        int day = 3;
        String weekday;

// test
        switch (day) {
            case 1:
                weekday = "Понеділок";
                break;
            case 2:
                weekday = "Віторок";
                break;
            case 3:
                weekday = "Середа";
                break;
            case 4:
                weekday = "Четвер";
                break;
            case 5:
                weekday = "П'ятниця";
                break;
            case 6:
                weekday = "Субота";
                break;
            case 7:
                weekday = "Неділя";
                break;
            default:
                weekday = "Некоректні дати";
        }
        System.out.println(weekday);


    }
}
