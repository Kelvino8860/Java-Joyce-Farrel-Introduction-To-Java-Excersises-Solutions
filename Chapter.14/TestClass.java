import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        
        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
        }

        
        int[] lastDigits = new int[N];
        int remainder = 0;

        for(int i = 0; i < N; i++)
        {
            remainder = data[i] % 10;

            if(remainder != 0)
            lastDigits[i] = remainder;
        } 

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < lastDigits.length; i++)
           sb.append(lastDigits[i]);
        
        String str = sb.toString();
        int finalInt = Integer.parseInt(str);
        
        if((finalInt % 10) == 0)
          System.out.println("Yes");
        else
          System.out.println("No");
    }
}