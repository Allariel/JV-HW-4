/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 

class Reverse
{
    
    public static<T> List<T> reverseList(List<T> list)
    {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }

}
 
public class Main
{
    public static void main(String[] args)
    {
        Reverse rev = new Reverse();
        List<Integer> list = Arrays.asList(1, 2, 3,4);
        List<Integer> reverse = rev.reverseList(list);
        System.out.println(reverse);
    }

}


