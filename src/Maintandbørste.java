public class Maintandbørste {
    public static void main(String[] args) {
        Tandbørste patricksTandbørste = new Tandbørste();
        Tandbørste lisasTandbørste = new Tandbørste();
        //patricksTandbørste.erStartet = true;// de 2 linjer er det samme men metoder fra class er bedst

        //input: start
        patricksTandbørste.start();// pånær ved test af programmet
        if(patricksTandbørste.erStartet == true) //<- forventet output
            System.out.println("Pass"); //test
        else //test
            System.out.println("fail"); //test

    }
}
//hvis man bruger {} ved if statements kan man lave flere linier under selv if'en