public class Main {
    public static void main(String[] args) {
        Factory BMWF = new BMWFactory();
        Manifacturer BMWM = BMWF.findManifacturer();
        BMWM.creare();

        Factory MercedesF = new MercedesFactory();
        Manifacturer MercedesM = MercedesF.findManifacturer();
        MercedesM.creare();
    }
}