public class Kamar {
    private int nomorKamar;
    private double hargaPerMalam;
    private boolean diReservasi;

    public Kamar(int nomorKamar, double hargaPerMalam, boolean diReservasi) {
        this.nomorKamar = nomorKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.diReservasi = false;
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public void setNomorKamar(int nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public void setHargaPerMalam(double hargaPerMalam) {
        this.hargaPerMalam = hargaPerMalam;
    }

    public boolean isDiReservasi() {
        return diReservasi;
    }

    public void setDiReservasi(boolean diReservasi) {
        this.diReservasi = diReservasi;
    }

    public String getRoomType() {
        return "Generic Room";
    }

    public void reserve() {
        diReservasi = true;
    }

    public void release() {
        diReservasi = false;
    }


}
