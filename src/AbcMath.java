public class AbcMath
{
    public static boolean abcMath (int a, int b, int c)
    {
        for (int i=0; i<b; i++)
        {
            a *= 2;
        }
        return (a%c==0);
    }
}
