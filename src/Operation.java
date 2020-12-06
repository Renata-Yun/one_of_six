public class Operation
{
    public static String operation(int N, int a, int b)
    {
        String t = "";
        if (a+b == N)
        {
            t = "added";
        }
        else if (a-b == N)
        {
            t = "subtracted";
        }
        else if (a*b == N)
        {
            t = "multiplication";
        }
        else if (a/b == N)
        {
            t = "division";
        }
        else
            t = "none";
        return t;
    }
}
