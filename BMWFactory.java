public class BMWFactory implements Factory{

    @Override
    public Manifacturer findManifacturer() {
        return new BMWManifacturer();
    }
}
