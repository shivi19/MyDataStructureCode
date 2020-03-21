package GeeksForGeeks;

import java.util.Stack;

public class Paranthesis
{
    static boolean matching(char ch1, char ch2)
    {
        if(ch1 == '(' && ch2 == ')')
        {
            return true;
        }
        else if(ch1 == '{' && ch2 == '}')
        {
            return true;
        }
        else if(ch1 == '[' && ch2 == ']')
        {
            return true;
        }
        else return false;
    }
    static boolean areParenthesisBalanced(char[] exp)
    {
        Stack sts = new Stack();
        boolean res = false;
        for(int i=0;i<exp.length;i++)
        {
            if(exp[i] == '(' || exp[i] == '{' || exp[i] == '['  )
            {
                sts.push(exp[i]);
            }

            if(exp[i] == ')' || exp[i] == '}' || exp[i] == ']'  )
            {
                if(sts.empty())
                {
                    return false;
                }
                res = matching((Character) sts.pop(), exp[i]);
               // char t = (Character) sts.pop();

            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        char exp[] = {'{','(',')','}','[',']'};
        if (areParenthesisBalanced(exp))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
