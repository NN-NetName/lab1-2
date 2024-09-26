public class Main
{
    public static void main(String[] args) {
        /**
         * 1.10
         * Проверка есть ли отрицательное значение в массиве
         **/
        hasNegative(new int[]{1, -1, 2, -3});
        /**
         * 1.11
         * Проверить, что в массиве положительные и
         * отрицательные числа чередуются
         **/
        hasPositiveNegativeRotaion(new int []{1, -1, 2, -5});
        /**
         * 1.12
         * Сумма квадратов элементов массива
         **/
        sumSquare(new int[] {2, 3, 4});
        /**
         * 1.13
         * Вернуть новый массив с новыми значениями
         * элементов у которых первичное значение
         * элемента меньше нуля
         **/
        replaceZero(new int[] {1, 2, 3, 4, 5},5);
        /**
         * 1.14
         * Найти сумму тех элементов, которые больше
         * некоторого значение x
         **/
        getSumWithbarrier(new int []{1, 2, 3, 4, 5}, 2);
        /**
         * 1.15
         * Найти результат деления суммы четных (по
         * значения) элементов на сумму нечетных
         **/
        divideEvenOdd(new int [] {1, 2, 3, 4, 6});
        /**
         * 2.1
         * Сумма всех элементов двумерного массива
         **/
        sumMatrix(new int [][] {{1, 2, 3}, {3, 2, 1}, {1, 3, 2}});
        /**
         * 2.2
         * Среднее арифметическое всех элементов
         * двумерного массива
         **/
        averageMatrix(new int [][]  {{1, 2, 3}, {3, 2, 1}, {1, 3, 2}});
        /** 2.3 Определить, верно ли, что сумма элементов
         * нулевого(Первого) столбца матрицы больше суммы элементов
         * нулевой(Первой) строки
         **/
        isFirstColumnBiggerThanFirtRow(new int [][] {{1, 2, 3}, {3, 2, 1}, {3, 3, 2}});
        /** 2.4 Для матрицы определить, есть ли в ней хоть один
         * нулевой столбец
         **/
        hasZeroColumn(new int [][] {{1, 2, 0, 4}, {2, 1, 0, 1}, {3, 3, 0, 1}});
        /** 2.5 Поиск кол-во простых чисел (Алгоритм решето
         * Эратосфена), числа кратные простому числу в
         * диапазоне чисел не будут являться простыми числами
         **/
        calculatePrimeNumbers(100);
    }
    public static void hasNegative(int[] array)
    {
        boolean ysl = false;
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] < 0)
            {
                ysl = true;
                break;
            }
        }
        if (ysl == true)
            System.out.println("В массиве присутствует отрицательное число");
        else
            System.out.println("В массиве отсутствует отрицательное число");
    }
    public static void  hasPositiveNegativeRotaion(int[] array)
    {
        int a = 0;
        boolean posled = false;
        for(int i = 0; i<array.length-1; i++)
        {
            if (array[i]*array[i+1]>0)
            {
                a++;
            }
            else
            {
                a--;
            }
        }
        if(a*-1 == array.length-1)
        {
            System.out.println("В массиве положительные и отрицательные числа чередуются");
        }
        else
        {
            System.out.println("В массиве положительные и отрицательные числа не чередуются");
        }
    }
    public static void sumSquare(int[] array)
    {
        int sum = 0;
        for(int i = 0; i<array.length; i++)
        {
            sum += array[i] * array[i];
        }
        System.out.println("Сумма квадратов элементов массива:" + sum);
    }
    public static void replaceZero(int[] array, int replacement)
    {
        array[0] = array[0] - array[0] - 1;
        System.out.print("Новый массив:" + array[0]);
        for(int i = 1; i<array.length; i++)
        {
            array[i]= replacement;
            System.out.print(array[i]);
        }
        System.out.println();
    }
    public static void getSumWithbarrier(int[] array, int barrier)
    {
        int sum = 0;
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] > barrier)
            {
                sum += array[i];
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
    public static void divideEvenOdd(int[] array)
    {
        int sumcht = 0, sumnecht = 0;
        for(int i = 0; i<array.length; i++)
        {
            if(array[i]%2 == 0)
            {
                sumcht += array[i];
            }
            else
            {
                sumnecht += array[i];
            }
        }
        double itog = sumcht/sumnecht;
        System.out.println("Результат деления суммы четных на суммы нечетных элементов массива: " + itog);
    }
    public static void sumMatrix(int[][] array)
    {
        int sum = 0;
        for(int i = 0; i<array.length; i++)
        {
            for(int j = 0; j<array.length; j++)
            {
                sum += array[i][j];
            }
        }
        System.out.println("Сумма матрицы:" + sum);
    }
    public static void averageMatrix(int[][] array)
    {
        int sum = 0, kolvo=0;
        for(int i = 0; i<array.length; i++)
        {
            for(int j = 0; j<array.length; j++)
            {
                sum += array[i][j];
                kolvo ++;
            }
        }
        double itog = sum/kolvo;
        System.out.println("Среднее арифмитическое матрицы: " + itog);
    }
    public static void isFirstColumnBiggerThanFirtRow(int[][] array)
    {
        int sum = 0, sum2=0;
        for(int i = 0; i<array.length; i++)
        {
            for(int j = 0; j<array.length; j++)
            {
                if (j == 3)
                {
                    break;
                }
                sum = sum + array[i][j];
            }
            break;
        }
        for(int i = 0; i<array.length; i++)
        {
            for (int j = 0; j < 1; j++)
            {
                sum2 = sum2 + array[i][j];
            }
        }
        if (sum2>sum)
            System.out.println("Сумма элементов первого столбца больше суммы элементов первой строки"+ ' ' + sum2 + '>' + sum);
        else
            System.out.println("Сумма элементов первого столбца меньше суммы элементов первой строки"+ ' ' + sum2 + '<' + sum);
    }
    public static void hasZeroColumn(int[][] array)
    {
        boolean ysl = false;
        for(int j = 0; j<array.length; j++)
        {
            boolean promysl = true;
            for(int i = 0; i<array.length; i++)
            {
                if(array[i][j] != 0)
                {
                    promysl = false;
                    break;
                }
            }
            if(promysl == true)
            {
                ysl = true;
                break;
            }
        }
        if(ysl == true)
            System.out.println("В матрице присутствует нулевой столбец");
        else
            System.out.println("В матрице отсутствует нулевой столбец");
    }
    public static void calculatePrimeNumbers(int N)
    {
        int[] chisla = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            chisla[i] = i;
        }
        chisla[1] = 0;
        for (int i = 2; i <= N; i++) {
            if (chisla[i] != 0) {
                for (int j = i + i; j <= N; j += i) {
                    chisla[j] = 0;
                }
            }
        }
        System.out.print("Простые числа:");
        for (int i = 2; i <= N; i++) {
            if (chisla[i] != 0) {
                System.out.print(chisla[i] + " ");
            }
        }
    }
}