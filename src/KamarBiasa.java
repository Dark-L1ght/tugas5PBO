public class KamarBiasa extends Kamar{

    public KamarBiasa(int nomorKamar) {
        super(nomorKamar, 500000, false);
    }

    // Overriding metode getRoomType
    @Override
    public String getRoomType() {
        return "Standard";
    }
}
