class Reservasi {
    private Kamar room;
    private Tamu tamu;
    private int malam;
    private Fasilitas[] facilities;

    public Reservasi(Kamar room, Tamu tamu, int malam, Fasilitas[] facilities) {
        this.room = room;
        this.tamu = tamu;
        this.malam = malam;
        this.facilities = facilities;
        room.reserve(); // Reserve room
    }

    public double calculateTotalCost() {
        double roomCost = room.getHargaPerMalam() * malam;
        double facilityCost = 0;
        for (Fasilitas facility : facilities) {
            facilityCost += facility.getFacilityCost();
        }
        return roomCost + facilityCost;
    }

    public String getReservationStatus() {
        return room.isDiReservasi() ? "Reserved" : "Available";
    }

    public String getKamarType() {
        return room.getRoomType();
    }

    public void cancelReservation() {
        room.release();
    }

    public Tamu getGuest() {
        return tamu;
    }

    public void setGuest(Tamu tamu) {
        this.tamu = tamu;
    }

    public Kamar getRoom() {
        return room;
    }

    public void setRoom(Kamar room) {
        this.room = room;
    }
}