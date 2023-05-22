package UI;

public class Main {  public static void main(String[] args)throws Exception {
    BankUI bankUI = new BankUI();
    bankUI.mainUI();
    JLabel label = new JLabel("Place your finger on any alphabet key to scan finger print");
        JTextField textField = new JTextField();
        textField.setEditable(false);
        textField.addKeyListener(new Keychecker());

        JFrame jframe = new JFrame();

        jframe.add(label);
        jframe.add(textField);

        jframe.setLayout(null);
        label.setBounds(10,50,360,40);

        jframe.setSize(400, 350);

        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    static class Keychecker extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent event) {

            char ch = event.getKeyChar();
            if (Character.isLetter(ch)) {
                JOptionPane.showMessageDialog(null, "Fingerprint scan successful");
                EnterPin enterPin = new EnterPin();
            } else {
                JOptionPane.showMessageDialog(null, "Fingerprint scan not successful");
            }

        }

    }

}


}
