public class Motor {

    private String platNomor;
    private boolean statusMesin = false;
    private int kecepatan = 0;

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean getStatusMesin() {
        return statusMesin;
    }

    public void setStatusMesin(boolean statusMesin) {
        this.statusMesin = statusMesin;
        if (!statusMesin) {
            this.kecepatan = 0;
        }
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        // Validasi 1: Jika mesin Off dan kecepatan > 0
        if (!this.statusMesin && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } 
        // Nilai kecepatan tidak boleh negatif
        else if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh bernilai negatif!");
        } 
        //  Kecepatan maksimal 100
        else if (kecepatan > 100) {
            System.out.println("Kecepatan tidak boleh melebihi 100! Kecepatan diset ke 100.");
            this.kecepatan = 100;
        } 
        else {
            this.kecepatan = kecepatan;
        }
    }

    // Method untuk menampilkan status motor
    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);
        System.out.println("Status Mesin: " + (this.statusMesin ? "On" : "Off"));
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("============================");
    }
}