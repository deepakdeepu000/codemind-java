import java.util.Scanner;
class vowel_or_consonant
{
      public static void main(String[] args)
      {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        switch(a)
        {
            case "A":
            case "a":
            case "E":
            case "e":
            case "I":
            case "i":
            case "O":
            case "o":
            case "U":
            case "u":
                System.out.print("Vowel");
                break;
            default:
                System.out.print("Consonant");
        }
        
      }
     
}