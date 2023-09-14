package GUI;

import javax.swing.*;

public class Stringoperatoren {
    private JPanel Panel;
    private JButton equalsButton;
    private JButton indexOfButton;
    private JButton lowerCaseButton;
    private JButton upperCaseButton;
    private JButton button5;
    private JButton lengthButton;
    private JButton substringButton;
    private JButton charAtButton;
    private JTextField charAttextfeld;
    private JTextField stringtextfeld1;
    private JButton lastindexOfButton;
    private JLabel operationen;
    private JLabel string1;
    private JLabel eingabe;
    private JLabel string2;
    private JTextField stringtextfeld2;
    private JLabel ausgabe;
    private JTextField ausgabetextfeld;
    private JTextField substringtextfeld1;
    private JTextField lengthtextfeld;
    private JTextField substringtextfeld2;
    private JTextField indexOftextfeld;
    private JTextField lastindexOftextfeld;
    private JTextField equalstextfeld;
    private JTextField gleichgleichtextfeld;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stringoperatoren");
        frame.setContentPane(new Stringoperatoren().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
