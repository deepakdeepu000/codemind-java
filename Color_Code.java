import java.util.Scanner;
class ColorCode {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.print(ColorCodes(c));
    }
    private static String ColorCodes(char c)
    {
        switch (c) 
        {
            case 'V':
                return "Violet";
            case 'I':
                return "Indigo";
            case 'B':
                return "Blue";
            case 'G':
                return "Green";
            case 'Y':
                return "Yellow";
            case 'O':
                return "Orange";
            case 'R':
                return "Red";
            case 'v':
                return "Violet";
            case 'i':
                return "Indigo";
            case 'b':
                return "Blue";
            case 'g':
                return "Green";
            case 'y':
                return "Yellow";
            case 'o':
                return "Orange";
            case 'r':
                return "Red";
        }
        return "-1";
    }
}