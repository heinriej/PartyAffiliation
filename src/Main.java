import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String partyAffil = "";

        System.out.print("Enter your party affiliation [R/D/I]: ");
        partyAffil = in.nextLine();

        if (partyAffil.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if (partyAffil.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (partyAffil.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Man!");
        }
        else
        {
            System.out.println("I don't know what party this is: " + partyAffil);
        }
    }
}