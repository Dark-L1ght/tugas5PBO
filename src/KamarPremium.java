public class KamarPremium extends Kamar {
        public KamarPremium(int nomorKamar) {
            super(nomorKamar, 1000000, false); // Harga kamar suite
        }


        // Overriding metode getRoomType
        @Override
        public String getRoomType() {
            return "Suite";
        }
}
