/*Andrew Kulpa
  Example of Quine
  AKA: Self-replicating program*/
import java.util.Scanner;
public class QuineExample2{
   public static void main(String [] args){
      Scanner scanner = new Scanner(System.in); // tab = %3$c  newline = %2$c quotations = %4$c 
      System.out.print("Enter number 1: ");
      int num1 = scanner.nextInt();
      System.out.print("Enter number 2: ");
      int num2 = scanner.nextInt();
      System.out.println("Sum: " + Integer.toString(num1+num2)+ "\n");
      String[] s = {"import java.util.Scanner;",
                   "%2$cpublic class QuinceExample2{",
                   "%2$c%3$cpublic static void main (String[] args){",
                   "%2$c%3$c%3$cScanner scanner = new Scanner(System.in);",
                   "%2$c%3$c%3$cSystem.out.print(%4$cEnter number 1: %4$c);",
                   "%2$c%3$c%3$cint num1 = scanner.nextInt();",
                   "%2$c%3$c%3$cSystem.out.print(%4$cEnter number 2: %4$c);",
                   "%2$c%3$c%3$cint num2 = scanner.nextInt();",
                   "%2$c%3$c%3$cSystem.out.println(%4$cSum: %4$c + Integer.toString(num1+num2)+ %4$c%5$cn%4$c);",
                   "%2$c%3$c%3$cfor(String substr : s){",
                   "",
                   "%2$c%3$c%3$cString sPrint = %4$cString[] s = {%4$c;",
                   "%2$c%3$c%3$cfor(String substr : s){",
                   "%2$c%3$c%3$c%3$csPrint += %4$c%5$c%4$c%4$c + substr + %4$c%5$c%4$c,%5$cn%5$ct%5$ct%5$ct%5$ct %4$c;",
                   "%2$c%3$c%3$c}",
                   "%2$c%3$c%3$csPrint += %4$c};%5$cn%4$c;",
                   "%2$c%3$c%3$cs[10] = sPrint;",
                   "%2$c%3$c%3$cfor(int i = 0; i<10;i++){",
                   "%2$c%3$c%3$c%3$cSystem.out.printf(substr,s,13,9,34,92);",
                   "%2$c%3$c%3$c}",
                   "%2$c%3$c%3$cfor(int i = 11; i<s.length;i++){",
                   "%2$c%3$c%3$c%3$cSystem.out.printf(substr,s,13,9,34,92);",
                   "%2$c%3$c%3$c}",
                   "%2$c%3$c}",
                   "%2$c}"
                   };
                   
      String sPrint = "String[] s = {";
      for(String substr : s){
         sPrint += "\"" + substr + "\",\n\t\t\t\t ";
      }
      sPrint += "};\n";
      s[10] = sPrint;
      for(int i = 0; i<10;i++){            
         System.out.printf(s[i],s,13,9,34,92);//substr,s,'\n','\t','"',"\\n","\\\n");
      }
      System.out.print("\n\t\t\t" + sPrint);
      for(int i = 11; i<s.length;i++){       
         System.out.printf(s[i],s,13,9,34,92);//substr,s,'\n','\t','"',"\\n","\\\n");
      }
   }
}