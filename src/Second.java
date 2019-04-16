public class Second {
    // ctrl + alt + l
    public static void main(String[] args) {
        t3();
    }

    public static void t1() {
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
        System.out.println("\n");

    }


    public static void t2() {
        int[] mas = {2, 7, 5, 9, 2, 7, 5, 9};

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 1) mas[i] = 0;
        }
        System.out.println("\n");

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println("\n");

    }

    public static void t3() {
        int day = 9;
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
