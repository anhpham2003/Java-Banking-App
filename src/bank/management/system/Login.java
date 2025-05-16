package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login() {
        //Frame setup
        super("Bank Management System");
        setSize(800,400);
        setLocation(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JPanel background = new JPanel() {
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                Color color1 = new Color(92, 107, 192); // Blue
                Color color2 = new Color(144, 202, 249); // Light Blue
                GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        background.setBounds(0, 0, 800, 400);
        background.setLayout(null);

        // Welcome Text
        JLabel welcome = new JLabel("Welcome Back");
        welcome.setFont(new Font("Arial", Font.BOLD, 22));
        welcome.setForeground(new Color(26, 13, 171));
        welcome.setBounds(120, 50, 200, 30);
        background.add(welcome);

        JLabel subtext = new JLabel("Hello there, sign in to continue");
        subtext.setFont(new Font("Arial", Font.PLAIN, 12));
        subtext.setBounds(100, 80, 250, 20);
        background.add(subtext);

        // Lock Icon
        ImageIcon lockIcon = new ImageIcon(getClass().getResource("/icons/login_lock.png")); // your lock icon
        JLabel lockLabel = new JLabel(lockIcon);
        lockLabel.setBounds(150, 110, 100, 100);
        background.add(lockLabel);

        // Username input
        JTextField username = new JTextField();
        username.setBounds(50, 230, 300, 40);
        username.setFont(new Font("Arial", Font.PLAIN, 14));
        username.setBorder(BorderFactory.createTitledBorder("Username"));
        background.add(username);

        // Password input
        JPasswordField password = new JPasswordField();
        password.setBounds(50, 290, 300, 40);
        password.setFont(new Font("Arial", Font.PLAIN, 14));
        password.setBorder(BorderFactory.createTitledBorder("Password"));
        background.add(password);

        // Forgot password
        JLabel forgot = new JLabel("Forgot your password?");
        forgot.setFont(new Font("Arial", Font.PLAIN, 12));
        forgot.setForeground(Color.GRAY);
        forgot.setBounds(200, 340, 150, 20);
        background.add(forgot);

        // Sign In Button
        JButton signIn = new JButton("Sign in");
        signIn.setBounds(50, 380, 300, 45);
        signIn.setFont(new Font("Arial", Font.BOLD, 16));
        signIn.setBackground(new Color(92, 107, 192));
        signIn.setForeground(Color.WHITE);
        background.add(signIn);

        // Sign up link
        JLabel signup = new JLabel("Don't have an account? Sign Up");
        signup.setFont(new Font("Arial", Font.PLAIN, 13));
        signup.setBounds(100, 440, 250, 30);
        background.add(signup);

        add(background);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
