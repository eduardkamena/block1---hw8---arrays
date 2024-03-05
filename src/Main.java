import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // Task 1:
        System.out.println("Task 1:");
        int[] nifNif = new int[3];
        nifNif[0] = 1;
        nifNif[1] = 2;
        nifNif[2] = 3;
        double[] nufNuf = {1.57, 7.654, 9.986};
        int[] nafNaf = new int[6];
        int x = 1643;
        nafNaf[2] = x;
        nafNaf[4] = 2024;
        nafNaf[5] = -2000;
        System.out.println(Arrays.toString(nifNif));
        System.out.println(Arrays.toString(nufNuf));
        System.out.println(Arrays.toString(nafNaf));
        System.out.println(); // Разделение для наглядности в печати

        //Task 2:
        System.out.println("Task 2:");
        for (int i = 0; i < nifNif.length; i++) {
            if (i < nifNif.length - 1) {
                System.out.print(nifNif[i] + ", ");
            } else {
                System.out.print(nifNif[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < nufNuf.length; i++) {
            if (i < nufNuf.length - 1) {
                System.out.print(nufNuf[i] + ", ");
            } else {
                System.out.print(nufNuf[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < nafNaf.length; i++) {
            if (i < nafNaf.length - 1) {
                System.out.print(nafNaf[i] + ", ");
            } else {
                System.out.print(nafNaf[i]);
            }
        }
        System.out.println();
        System.out.println(); // Разделение для наглядности в печати

        //Task 3:
        System.out.println("Task 3:");
        for (int i = nifNif.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(nifNif[i] + ", ");
            } else {
                System.out.print(nifNif[i]);
            }
        }
        System.out.println();
        for (int i = nufNuf.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(nufNuf[i] + ", ");
            } else {
                System.out.print(nufNuf[i]);
            }
        }
        System.out.println();
        for (int i = nafNaf.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(nafNaf[i] + ", ");
            } else {
                System.out.print(nafNaf[i]);
            }
        }
        System.out.println();
        System.out.println(); // Разделение для наглядности в печати
        /*
        Ниже решение подсмотрел в сети
        Создание обратной копии массива
         */
        int[] reverseNifNif = new int[nifNif.length];
        int count = 0;
        for (int i = 1; i <= nifNif.length; i++) {
            reverseNifNif[count++] = nifNif[nifNif.length - i];
        }
        System.out.println(Arrays.toString(reverseNifNif));
        //
        double[] reverseNufNuf = new double[nufNuf.length];
        count = 0;
        for (int i = 1; i <= nufNuf.length; i++) {
            reverseNufNuf[count++] = nufNuf[nufNuf.length - i];
        }
        System.out.println(Arrays.toString(reverseNufNuf));
        //
        int[] reverseNafNaf = new int[nafNaf.length];
        count = 0;
        for (int i = 1; i <= nafNaf.length; i++) {
            reverseNafNaf[count++] = nafNaf[nafNaf.length - i];
        }
        System.out.println(Arrays.toString(reverseNafNaf));
        System.out.println(); // Разделение для наглядности в печати

        // Task 4:
        System.out.println("Task 4:");
        for (int i = 0; i < nifNif.length; i++) {
            if (nifNif[i] % 2 != 0) {
                nifNif[i]++;
            }
        }
        System.out.print(Arrays.toString(nifNif));
    }
}