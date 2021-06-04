package Assignment1.example;


import java.util.Scanner;

public class ex03
{
    public static void main( String[] args )

    {
        System.out.print( "What is the quote? " );
        Scanner readQuote = new Scanner(System.in);
        String replayQuote = readQuote.nextLine();

        System.out.print( "Who said it? " );
        String replayAuthor = readQuote.nextLine();

        System.out.println(replayAuthor + " says, " + "\"" + replayQuote + "\"");


    }
}
