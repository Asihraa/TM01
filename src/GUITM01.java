import javax.swing.*;
public class GUITM01 extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton CLOSEButton;
    private JButton SUBMITButton;
    private JPanel panelmain;


    public GUITM01() {
            this.setContentPane(panelmain);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.pack();
            textField1 = new JTextField(10);
            textField2 = new JTextField(10);
            SUBMITButton = new JButton("SUBMIT");
            CLOSEButton = new JButton(("CLOSE"));   

            JPanel contenpane = new JPanel();
            contenpane.add(new JLabel("Harga dibawah 2000 : "));
            contenpane.add(textField1);
            contenpane.add(textField2);
            contenpane.add(SUBMITButton);
            contenpane.add(CLOSEButton);
            setGlassPane(contenpane);

    }

    public static void main(String[] args) {
        GUITM01 mainscreen = new GUITM01();
        mainscreen.setVisible(true);
    }
}

// maaf pak masih belum bisa