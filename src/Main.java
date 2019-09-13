public class Main {
    public static void main(String[] args) {
        System.out.println("Smarthome Dummy 1");

        MikroOvn sunesOvn = new MikroOvn(); //instansierer et objekt af klassen mikroovn

        sunesOvn.drejeHastighed = -100;
        sunesOvn.temperatur = 700;
        sunesOvn.ydelse = 300;

        MikroOvn tommysOvn = new MikroOvn(); //instansierer et objekt af klassen mikroovn
        tommysOvn.drejeHastighed = 20;
        tommysOvn.temperatur = 150;
        tommysOvn.ydelse = 500;




    }
}
