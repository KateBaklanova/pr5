public class rec1 {
    public int triangle1(int a, int b)
    {
        int i = 0;
        while (i!=b)
        {
            System.out.println(b);
            ++i;
        }
        b+=1;
        if (a>=b) {
            return (triangle1(a, b));
        }
        return 0;
    }

    public int reverse10(int a, int reversed)
    {

        if (a != 0) {

            int digit = a % 10;
            reversed = reversed * 10 + digit;

            a /= 10;
            return(reverse10(a, reversed));
        }
        System.out.println(reversed);
        return 0;
    } 
    
    public int odd12(int a)
    {
            int b = a%10;
            if (b%2 != 0)
            {
                System.out.println(b);
            }
            if (String.valueOf(a).length()==1)
            {
                return 0;
            }

            return odd12(a/10);
    }

    int lr15(int a)
    {
        int b = a%10;

        System.out.print(a%10+" ");

        if ((int)(Math.log10(a) + 1)==1)
        {
            return 0;
        }

        return lr15(a/10);
    }

    public static void main (String args[])
    {
        rec1 r = new rec1();
        System.out.println("1. Треугольная последовательность 5");
        r.triangle1(5, 1);
        System.out.println("10. Разворот числа 12345");
        r.reverse10(12345, 0);
        System.out.println("12. Вывести нечетные числа последовательности 16890");
        r.odd12(16890);

        System.out.println("15. Дано натуральное число N. Выведите все его цифры по одной, в обратном " +
                "порядке, разделяя их пробелами или новыми строками." + " 12345");
        r.lr15(12345);

    }
}
