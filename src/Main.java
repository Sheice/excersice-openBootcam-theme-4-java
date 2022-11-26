public class Main {
    public static void main(String[] args) {

        //check if numIf is positive, negative or 0
        int numIf = 1;

        if (numIf > 0){
            System.out.println("POSITIVO");
        } else if (numIf < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("The num is 0");
        }

        // loop while numWhile is less than 3

        int numWhile = 0;

        while (numWhile < 3){
            System.out.println("Loop number: " + (numWhile + 1) );
            numWhile++;
        }

        // loop do while only one time

        int numDoWhile = 0;

        do{
            System.out.println("I am a Do While");
            numDoWhile = 3;
        }while (numDoWhile < 3);

        // for and print 3 time one thing

        for (int numFor = 0; numFor <= 3; numFor++){
            System.out.println("This is a lap number: " + numFor);
        }

        //switch for search a season

        String season = "SUMMER";

        switch (season){
            case "SUMMER":
                System.out.println("We are in " + season);
                break;
            case "AUTUMNAL":
                System.out.println("We are in " + season);
                break;
            case "VERNAL":
                System.out.println("We are in " + season);
                break;
            case "wintry":
                System.out.println("We are in " + season);
                break;
            default:
                System.out.println("season invalid");
                break;
        }
    }
}