public class MercedesFactory implements Factory{

    @Override
    public Manifacturer findManifacturer() {
        return new MercedesManifacturer();
    }
}
