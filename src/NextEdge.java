public class NextEdge
{
    public static double nextEdge (int a, int b)
    {
        return Math.floor(Math.sqrt((a*a)+(b*b)+(2*a*b*0.99)));
    }
}
