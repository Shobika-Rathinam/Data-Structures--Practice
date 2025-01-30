import java.util.*;
public class RemoveVowels {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        List<Character> L=new ArrayList<Character>();
        L.add('a');
        L.add('e');
        L.add('i');
        L.add('o');
        L.add('u');
        for(int i=0;i<S.length();i++)
        {
            char c=S.charAt(i);
            if(L.contains(c))
            {
                continue;
            }
            else{
                System.out.print(c);
            }
        }



    }
    
}

