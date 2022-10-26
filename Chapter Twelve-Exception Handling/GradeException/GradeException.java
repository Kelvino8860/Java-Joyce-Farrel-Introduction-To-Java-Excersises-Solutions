public class GradeException extends Exception
{ 
    public static final char[] LETTERS = {'A','B','C','D','F','I'};

    public GradeException()
       {
          super("Sorry! wrong grade entry");
       }
}