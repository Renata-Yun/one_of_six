import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        int kek = 0;
        int lol = 0;
        int pop = 0;
        double rar = 0;
        char zip = ' ';

        Scanner scanner = new Scanner(System.in);

        // 1 program - вывести остаток от деления
        System.out.println("Введите первое число");
        kek = scanner.nextInt();
        System.out.println("Введите второе число");
        lol = scanner.nextInt();
        System.out.println(Remainder.remainder(kek,lol));

        // 2 program - имея высоту и длину треугольника, получаем площадь
        System.out.println("введите высоту");
        kek = scanner.nextInt();
        System.out.println("введите основание треугольника");
        lol = scanner.nextInt();
        System.out.println(TriArea.triArea(kek,lol));

        // 3 program - имея количество ног, получаем общее количество ног всех животных на ферме
        System.out.println("Введите количество ног куриц");
        kek = scanner.nextInt();
        System.out.println("Введите количество ног коров");
        lol = scanner.nextInt();
        System.out.println("Введите количество ног свиней");
        pop = scanner.nextInt();
        System.out.println(Animals.animals(kek,lol,pop));

        // 4 program
        System.out.println("Введите первое значение");
        rar = scanner.nextDouble();
        System.out.println("Введите второе значение");
        lol = scanner.nextInt();
        System.out.println("Введите значение для сравнения");
        pop = scanner.nextInt();
        System.out.println(ProfitableGamble.profitableGamble(rar,lol,pop));

        // 5 program - из двух чисел возможно получить 3 число (вывести операцию или none)
        System.out.println("Первое число");
        kek = scanner.nextInt();
        System.out.println("Второе число");
        lol = scanner.nextInt();
        System.out.println("Итоговое число");
        pop = scanner.nextInt();
        System.out.println("Операция:");
        System.out.println(Operation.operation(kek,lol,pop));

        // 6 program - Создайте функцию, которая возвращает значение ASCII переданного символа
        System.out.println("Введите символ");
        zip = scanner.next().charAt(0);
        System.out.println(Ctoa.ctoa(zip));

        // 7 program - Функция, которая берет последнее число из последовательного
        // списка чисел и возвращает сумму всех чисел до него и включая его.
        System.out.println("введите число");
        kek = scanner.nextInt();
        System.out.println("Получаем сумму:");
        System.out.println(AddUpTo.addUpTo(kek));

        // 8 program - находит максимальное значение третьего ребра треугольника
        System.out.println("Введите значение 1 ребра");
        kek = scanner.nextInt();
        System.out.println("Введите значение 2 ребра");
        lol = scanner.nextInt();
        System.out.println("Значение 3 ребра:");
        System.out.println(NextEdge.nextEdge(kek,lol));

        // 9 program - создайте функцию, которая принимает массив чисел и возвращает сумму его кубов.
        System.out.println("Введите первое число");
        kek = scanner.nextInt();
        System.out.println("Введите второе число");
        lol = scanner.nextInt();
        System.out.println("введите третье число");
        pop = scanner.nextInt();
        System.out.println("Сумма кубов трех чисел:");
        System.out.println(SumOfCubes.sumOfCubes(kek,lol,pop));

        // 10 program
        System.out.println("Введите А");
        kek = scanner.nextInt();
        System.out.println("Введите В");
        lol = scanner.nextInt();
        System.out.println("Введите С");
        pop = scanner.nextInt();
        System.out.println("Результат");
        System.out.println(AbcMath.abcMath(kek,lol,pop));
    }
}
