public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice ="10", taxRate="0.06", gibberish="wuyerfgjb1";



        //Parse shirtPrice and taxRate, and print the total tax
        double shirtPrices = Double.parseDouble(shirtPrice);
        double taxRates = Double.parseDouble(taxRate);
        System.out.println((shirtPrices)*(1+taxRates));

        //Try to parse taxRate as an int
        int taxRaters = Integer.parseInt(taxRate);
        //throws exception

        //Try to parse gibberish as an int
        int gibberished = Integer.parseInt(gibberish);
        //throws exception

    }

}
