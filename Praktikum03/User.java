public class User {
    public String username;
    public String email;
    public String pasword;
    public String name;
    
    public void displayinfo() {
        System.out.println("username: " + username);
        System.out.println("email: " + email);
        System.out.println("pasword: " + pasword);
        System.out.println("name " + name);
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.pasword = "polinema123";
    }

}