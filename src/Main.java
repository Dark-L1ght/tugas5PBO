public class Main {
    public static void main(String[] args) {
        // Inisialisasi tamu
        Tamu tamu1 = new Tamu("Nizar", "nizar772@gmail.com");
        Tamu tamu2 = new Tamu("Agus", "agus992@gmail.com");

        // Inisialisasi fasilitas
        Fasilitas wifi = new Fasilitas("Wi-Fi", 50000);
        Fasilitas breakfast = new Fasilitas("Breakfast", 75000);
        Fasilitas[] facilities1 = { wifi, breakfast };
        Fasilitas[] facilities2 = { wifi };

        // Inisialisasi kamar
        Kamar KamarBiasa1 = new KamarBiasa(101);
        Kamar KamarPremium1 = new KamarPremium(202);

        // Inisialisasi reservasi
        Reservasi reservation1 = new Reservasi(KamarBiasa1, tamu1, 3, facilities1);
        Reservasi reservation2 = new Reservasi(KamarPremium1, tamu2, 2, facilities2);

        // Menampilkan data reservasi pertama
        System.out.println("Data Reservasi 1:");
        displayReservationData(reservation1);

        // Menampilkan data reservasi kedua
        System.out.println("\nData Reservasi 2:");
        displayReservationData(reservation2);
    }

    // Method untuk menampilkan data reservasi
    public static void displayReservationData(Reservasi reservation) {
        System.out.println("Tamu: " + reservation.getGuest().getName());
        System.out.println("Kontak: " + reservation.getGuest().getContactInfo());
        System.out.println("Kamar: " + reservation.getKamarType() + " - Nomor " + reservation.getRoom().getNomorKamar());
        System.out.println("Status Reservasi: " + reservation.getReservationStatus());
        System.out.println("Total Biaya: Rp" + reservation.calculateTotalCost());
    }
}