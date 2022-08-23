import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
-----------Кучмель Павел----------------------------------------------------------------------------
         */
        //Proc17. Описать функцию RootsCount(A, B, C) целого типа, определяющую
        //количество корней квадратного уравнения A·x^2 + B·x + C = 0
        //(A, B, C — вещественные параметры, A != 0). С ее помощью найти количество корней
        //для каждого из трех квадратных уравнений с данными коэффициентами.
        //Количество корней определять по значению дискриминанта:
        //D = B^2 - 4·A·C.
        /*
        System.out.println("Введите вещественные параметры для уравнения A·x^2 + B·x + C = 0: ");
        double a = 0;
        do {
            System.out.print("A=");
            a = in.nextDouble();
            if (a==0) System.out.println("Неподходящий параметр. А не модет равняться 0");
        }while(a==0);
        System.out.print("B=");
        double b = in.nextDouble();
        System.out.print("C=");
        double c = in.nextDouble();
        System.out.println("Количество корней: "+rootsCount(a,b,c));
        */
        /*
--------------------------------------------------------------------------------------------
         */
        //Proc18. Описать функцию CircleS(R) вещественного типа, находящую площадь круга радиуса R
        //(R — вещественное). С помощью этой функции найти площади трех кругов с данными радиусами.
        //Площадь круга радиуса R вычисляется по формуле S = π·R^2. В качестве значения π использовать 3.14.
        /*
        double r = 0;
        for (int i = 1;i<=3;i++){
            System.out.print("Введите радиус круга "+i+": ");
            r = in.nextDouble();
            System.out.println("Площадь круга равна "+Math.round(circleS(r)*100)/100.0);
        }
         */
        /*
-------------------------------------------------------------------------------------------------------
         */
        //Proc19. Описать функцию RingS(R1, R2) вещественного типа, находящую площадь кольца,
        //заключенного между двумя окружностями с общим центром и радиусами R1 и R2
        //(R1 и R2 — вещественные, R1 > R2). С ее помощью
        //найти площади трех колец, для которых даны внешние и внутренние радиусы.
        //Воспользоваться формулой площади круга радиуса R: S = π·R^2. В качестве значения π использовать 3.14.
        /*
        System.out.print("Введите радиус окружности R1: ");
        double r1 = in.nextDouble();
        double r2 = 0;
        do {
            System.out.print("Введите радиус окружности R2: ");
            r2 = in.nextDouble();
            if (r2<=r1)System.out.println("Окружность R2 должна быть больше R1. R1="+r1);
        }while (r2<=r1);
        System.out.println("Площадь кольца между окружностями R1 и R2 = "+Math.round(ringS(r1, r2)*100)/100.0);
        */
        /*
------------------------------------------------------------------------------------------------
         */
        //Proc20. Описать функцию TriangleP(a, h), находящую периметр равнобедренного
        //треугольника по его основанию a и высоте h, проведенной к
        //основанию (a и h — вещественные). С помощью этой функции найти
        //периметры трех треугольников, для которых даны основания и высоты.
        //Для нахождения боковой стороны b треугольника использовать теорему
        //Пифагора: b^2 = (a/2)2 + h^2.
        /*
        for (int i = 1;i<=3;i++){
            System.out.print("Введите основание треугольника "+i+" а: ");
            double a = in.nextDouble();
            System.out.print("Введите высоту треугольника "+i+" h: ");
            double h = in.nextDouble();
            System.out.println("Периметр треугольника "+i+" = "+Math.round(triangleP(a, h)*100)/100.0);
        }
        */
        /*
----------------------------------------------------------------------------------------------------
         */
        //Proc21. Описать функцию SumRange(A, B) целого типа, находящую сумму
        //всех целых чисел от A до B включительно (A и B — целые). Если A > B,
        //то функция возвращает 0. С помощью этой функции найти суммы чисел
        //от A до B и от B до C, если даны числа A, B, C
        /*
        System.out.println("Введите 3 целых числа");
        System.out.print("A=");
        int a = in.nextInt();
        System.out.print("B=");
        int b = in.nextInt();
        System.out.print("C=");
        int c = in.nextInt();
        System.out.println("Сумма целых чисел от А до В = "+sumRange(a, b)+". Сумма целых чисел от В до С = "+sumRange(b, c));
        */
    }
    static int sumRange(int a, int b){
        int sum = 0;
        if (a>b) return sum;
        for (int i = a;i<=b;i++)sum+=i;
        return sum;
    }
    static double triangleP(double a, double h){
        double b = Math.sqrt((a/2)*2+(h*h));
        double c = b;
        return a+b+c;
    }
    static double ringS(double r1, double r2){
        final double pi = 3.14;
        double s1 = pi * (r1*r1);
        double s2 = pi * (r2*r2);
        return s2-s1;
    }
    static double circleS (double r){
        final double pi = 3.14;
        return pi*(r*r);
    }
    static int rootsCount (double a, double b, double c){
        int d=0;
        //if (d>(b*b)-4*a*c)d=0;
        if (d==(b*b)-4*a*c)d=1;
        if (d<(b*b)-4*a*c)d=2;
        return d;
    }
}