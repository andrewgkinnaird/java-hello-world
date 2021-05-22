import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
// for now, until I can configure classpath for vscode/gitpod, use "java -cp algs4.jar RandomWord.java"
// to make use of the princeton library

public class RandomWord {
    public static void main(String[] args)
    {
        String champion = "Champion";
        int j = 1;

        while (!StdIn.isEmpty())
        {
            String currentWord = StdIn.readString();
            double p = 1.0/j;
            boolean coinflip = StdRandom.bernoulli(p);
            if (coinflip)
            {
                
                champion = currentWord;
            }
            j++;
        }
            

        StdOut.println(champion);
    }
}