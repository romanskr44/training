package basics;

public class Strings {
    public static void main(String[] arg){

        String bookTitle;
        String wordChoice = "The";
        bookTitle = "The Lord of the Rings";

        if (bookTitle.contains(wordChoice)){
            System.out.println("The book contains the word " + wordChoice);
        }

        String browser = "Chrome";

        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("The browser is Chrome");
        }
        String firstName = "Roman";
        String lastName = "Skarga";
        String SIN = "376756365";

        System.out.println("\nThere are " + SIN.length() + " digits in the SIN");

        //Print the initials plus last 4 digits of SIN
        System.out.print(firstName.substring(0,1));
        System.out.print(lastName.substring(0,1));
        System.out.print(SIN.substring(5));


    }

}
