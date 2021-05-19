import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
// for now, until I can configure classpath for vscode/gitpod, use "java -cp als¥gs4.jar RandomWord.java"
// to make use of the princeton library

class RandomWord {
    public static void main(String[] args){
        String champion = "Champion";
        
        for(var i = 0; i < args.length; i++){
            double p = 1.0/(i+1);
            System.out.println(p);
            boolean coinflip = StdRandom.bernoulli(p);
            if(coinflip){
                
                champion = args[i];
                System.out.println(champion);
            }
        }

        System.out.println(champion);
    }
}