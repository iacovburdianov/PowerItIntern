package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Write a Java program which takes a string as input “aaabbc”
* and show the number of repeating characters ouput: a = 3, b = 2, c = 1. */
public class TaskNo11 {
    public static void main(String[] args) throws IOException {
        String ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Statement:");
        ch = br.readLine();
        int count=0,len=0;
        do
        {
            try
            {
                char name[]=ch.toCharArray();
                len=name.length;
                count=0;
                for(int j=0;j<len;j++)
                {
                    if((name[0]==name[j])&&((name[0]>=65&&name[0]<=91)||(name[0]>=97&&name[0]<=123)))
                        count++;
                }
                if(count!=0)
                    System.out.println(name[0]+" = "+count);
                ch=ch.replace(""+name[0],"");
            }
            catch(Exception ex){}
        }
        while(len!=1);
    }
}
