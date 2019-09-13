public class MikroOvn {
    // Objektets egenskaber er ikke angivet dvs instansvariabler
    //
    double temperatur; //celcius
    int timer; //Mikrosekunder
    String funktioner; //optøning, opvarmning osv
    boolean drejeTallaerken; //true -den drejer, false, den drejer ikke
    byte drejeHastighed; // 1 - 100
    short ydelse;
    //gør ting, dvs metoder
    boolean start() {
        //Tændefunktion til mikroovnen
        return true;
        }
        void stop() {
        //sluk for mikroovnen

    }
}
