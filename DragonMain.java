public class DragonMain {
    public static void main(String[] args) {
        // Instansiasi 2 objek Dragon
        Dragon dragon1 = new Dragon();
        Dragon dragon2 = new Dragon();

        System.out.println("=== DRAGON 1 ===");
        dragon1.printStatus(); 
        dragon1.move(5);    
        dragon1.changeDirection(1); 
        dragon1.move(3);       
        dragon1.printStatus();

        System.out.println("\n=== DRAGON 2 ===");
        dragon2.printStatus();
        dragon2.changeDirection(4);
        dragon2.move(2);      
        dragon2.changeDirection(3); 
        dragon2.move(4);     
        dragon2.printStatus(); 
    }
}