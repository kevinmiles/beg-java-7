import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class FrequencyDemo
{
   public static void main(String[] args)
   {
      List<String> listOfArgs = new LinkedList<>();
      String lastArg = (args.length == 0) ? null : args[args.length-1];
      for (int i = 0; i < args.length-1; i++)
         listOfArgs.add(args[i]);
      System.out.println("Number of occurrences of "+lastArg+" = "+
                         Collections.frequency(listOfArgs, lastArg));
   }
}
