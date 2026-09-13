public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50); 
        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setStatusMesin(true); 
        motor2.setKecepatan(40);
        motor2.displayStatus();

        // Menguji kecepatan di atas 100
        Motor motor3 = new Motor();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setStatusMesin(true);
        motor3.setKecepatan(120); 
        motor3.displayStatus();

        // Menguji kecepatan negatif
        motor3.setKecepatan(-20);
        motor3.displayStatus();
    }
}