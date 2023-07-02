import java.awt.*;
import java.awt.event.*;
 
 class LoginForm extends Frame implements ActionListener {
    private TextField usernameField;
    private TextField passwordField;
    private CheckboxGroup genderGroup;
    private Button loginButton;

    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 250);
        setLayout(new FlowLayout());

        Label usernameLabel = new Label("Username: ");
        usernameField = new TextField(20);
        add(usernameLabel);
        add(usernameField);

        Label passwordLabel = new Label("Password: ");
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');
        add(passwordLabel);
        add(passwordField);

        Label genderLabel = new Label("Gender: ");
        add(genderLabel);

        genderGroup = new CheckboxGroup();
        Checkbox maleCheckbox = new Checkbox("Male", genderGroup, false);
        Checkbox femaleCheckbox = new Checkbox("Female", genderGroup, false);
        add(maleCheckbox);
        add(femaleCheckbox);

        loginButton = new Button("Login");
        loginButton.addActionListener(this);
        add(loginButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String gender = "";

        if (genderGroup.getSelectedCheckbox() != null) {
            gender = genderGroup.getSelectedCheckbox().getLabel();
        }

        if (username.equals("DP") && password.equals("123")) {
            System.out.println("Login successful!");
            System.out.println("Username: " + username);
            System.out.println("Gender: " + gender);
            // Add your desired logic here after successful login
        } else {
            System.out.println("Invalid username or password.");
            // Add your desired logic here for handling invalid login attempts
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
