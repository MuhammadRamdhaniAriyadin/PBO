public class Dragon {
    int x;
    int y;
    int direction;

    
    public Dragon() {
        x = 0;
        y = 0;
        
        direction = 2; 
    }

    // mengubah arah 
    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            this.direction = newDirection;
        } else {
            System.out.println("Arah tidak valid! Silakan masukkan 1 (atas), 2 (kanan), 3 (bawah), atau 4 (kiri).");
        }
    }

    // memindahkan Dragon berdasarkan direction 
    public void move(int steps) {
        switch (direction) {
            case 1: // Atas
                y += steps;
                break;
            case 2: // Kanan
                x += steps;
                break;
            case 3: // Bawah
                y -= steps;
                break;
            case 4: // Kiri
                x -= steps;
                break;
        }
    }

    // cetak status Dragon
    public void printStatus() {
        String namaArah = "";
        switch (this.direction) {
            case 1: namaArah = "Atas"; break;
            case 2: namaArah = "Kanan"; break;
            case 3: namaArah = "Bawah"; break;
            case 4: namaArah = "Kiri"; break;
            default: namaArah = "Tidak terdefinisi"; break;
        }
        System.out.println("Posisi: (" + x + ", " + y + ") | Arah: " + namaArah + " (" + direction + ")");
    }
}