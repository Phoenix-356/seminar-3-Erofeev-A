//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.


public class task3 {
    public static void main(String[] args) {

        int n = 3;
        int[] array = new  int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
            System.out.println("Дан массив: " + array[i] );
        }

        int max = array[0]; // Массив не должен быть пустым
        int min = array[0];
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
            if(min > array[i])
                min = array[i];
            avg += array[i]/array.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}