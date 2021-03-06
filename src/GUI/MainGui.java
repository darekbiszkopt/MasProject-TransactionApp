package GUI;

import Controllers.AccountController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGui extends JFrame {

    private JPanel menuPanel;
    private JLabel appLabel;
    private JLabel mainLabel;
    private JTextField textClientId;
    private JLabel loginLabel;
    private JTextField textField1;
    private JButton buttonLogin;
    private JButton buttonSignIn;
    private JButton buttonCheckPossibility;

    public MainGui(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.menuPanel);
        this.pack();
        this.setVisible(true);
        this.setSize(600,400);

        buttonCheckPossibility.addActionListener(e -> {
            new CreateAccoutGui();
            dispose();
        });

        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var client = new AccountController().getLogin(textClientId.getText());
                System.out.println(client);
                new SignContract(client);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new MainGui("AppBankMobile");
    }

}
