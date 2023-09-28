import java.sql.SQLOutput;
import java.util.Scanner;

// вариант 9 одномерные массивы
public class massiv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 0;
        int sum = 0;
        int count1 = 0;
        int[] arr = new int[]{-1, -2, -3, -4, -5, 0, 1, 3, 5, 6, 5, 0, 1, 2, 3};
        for (int i = 0; i < arr.length; i++) {  // ищу Количество отрицательных элементов массива с четными номерами
            if (i % 2 == 0 && arr[i] < 0) {
                count1 += 1;
            }
        }
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) { // Сумма элементов массива расположенных до последнего нулевого элемента
            if (arr[i] == 0) {
                index = i;
                break;
            }
        }

        for (int i = 0; i <= index; i++) {
            sum += arr[i];
        }
        System.out.println("вариант 9 одномерные массивы");
        System.out.println("Количество отрицательных элементов массива с четными номерами: " + count1);
        System.out.println("Сумма элементов массива расположенных до последнего нулевого элемента: " + sum);
        System.out.println("Сам массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



        // вариант 9 цикл for
        System.out.println("вариант 9 цикл for");
        System.out.println("Ответ: ");
        int count = 0;
        for(int i = 10; i<100; i++){
            if (((i/10) * (i/10) + (i%10) * (i%10)) % 10 == 0){
                System.out.println(i);
            }
        }




       // вариант 9 двумерный массив
        System.out.println("вариант 9 двумерные массивы");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи числа для размера матрицы: ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] matr = new int [n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = scanner.nextInt();
            }
        }
        int max = matr[0][0];
        for(int i = 0; i<matr.length;i++){ // ищу максимальный элемент на главной диагонали
            if (max < matr[i][i]){
                max = matr[i][i];
            }
        }
        for (int i = 0; i < matr.length; i++) { // поменял местами строки
            var temp = matr[0][i];
            matr[0][i] = matr[1][i];
            matr[1][i] = temp;
        }
        System.out.println("Максмальный элемент на главной диагонали: "+ max);
        System.out.println("Поменял местами строки");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(matr[i][j] + " ");
            }
            System.out.println();
        }


        // вариант 1 графики
        System.out.println("вариант 1 графики");
        Scanner scanner1 = new Scanner(System.in);
        double x = scanner1.nextDouble();
        double a = scanner1.nextDouble();
        double b = scanner1.nextDouble();
        double y;
        System.out.println("Значение аргумента  Значение функции");
        while (x<a){
            if (x>=-9 && x<-6){
                y = -(Math.pow(-(x*x)-12*x-27,0.5));

            } else if (x > -6 && x <= -3) {
                y = x+3;
            }
            else if (x>-3 && x<=0){
                y = Math.pow(-(x*x)+9,0.5);
            }
            else if (x>0 && x<=3){
                y=-(x)+3;
            }
            else{
                y=0.5+(x-3);
            }
            System.out.println(x+"    "+y);
            x+=b;
        }


    }
}

