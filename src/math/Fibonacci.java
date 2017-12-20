package math;

public class Fibonacci {

    public static void main(String[] args) {

                int n1=0;
                int n2=1;

                for(int n=0; n<40; n++)
                {
                    System.out.println(n1);
                    n1=n1+n2;
                    n2=n1-n2;
                }
            }
        }

        /*
          Write 40 Fibonacci numbers with java.
         */



