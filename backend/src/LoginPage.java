public class LoginPage extends Window{
    public LoginPage(String title) {
        super(title);
    }

    public void init() {
        addButton("Login", 100, 100, 100, 50, (e) -> {
            System.out.println("Login button clicked");
        });
        addInput("Username", 100, 200, 100, 50);
        addInput("Password", 100, 300, 100, 50);
    }
}
