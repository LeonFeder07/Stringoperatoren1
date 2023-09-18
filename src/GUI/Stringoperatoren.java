package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JTextField substringtextfeld2;
    private JTextField indexOftextfeld;
    private JTextField lastindexOftextfeld;

    public Stringoperatoren() {
        charAtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = stringtextfeld1.getText();

                if (text.equals("") || charAttextfeld.getText().equals("")) {

                    ausgabetextfeld.setText("Bitte richtigen Felder füllen");
                } else {
                    double zahl = Double.valueOf(charAttextfeld.getText());
                    int zahlint = (int) zahl;


                ausgabetextfeld.setText(String.valueOf(text.charAt(zahlint)));
                charAttextfeld.setText("");
            }
            }
        });
        substringButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=stringtextfeld1.getText();
                if (text.equals("")|| substringtextfeld1.getText().equals("")|| substringtextfeld2.getText().equals("")) {
                    ausgabetextfeld.setText("Bitte richtigen Felder füllen");
                } else {

                    double start = Double.valueOf(substringtextfeld1.getText());
                    int startint= (int) start;
                    text.charAt(startint);
                    double end = Double.valueOf(substringtextfeld2.getText());
                    int endint= (int) end;
                    ausgabetextfeld.setText(String.valueOf(text.substring(startint, endint)));
                    substringtextfeld1.setText("");
                    substringtextfeld2.setText("");
                }
            }
        });
        lengthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=stringtextfeld1.getText();

                ausgabetextfeld.setText(String.valueOf(text.length()));
            }
        });
        upperCaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=stringtextfeld1.getText();

                ausgabetextfeld.setText(String.valueOf(text.toUpperCase()));
            }
        });
        lowerCaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=stringtextfeld1.getText();

                ausgabetextfeld.setText(String.valueOf(text.toLowerCase()));
            }
        });
        indexOfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=stringtextfeld1.getText();
                String buchstabe =indexOftextfeld.getText();

                if (text.equals("")|| indexOftextfeld.getText().equals("")) {
                    ausgabetextfeld.setText("Bitte richtigen Felder füllen");
                } else {
                    ausgabetextfeld.setText(String.valueOf(text.indexOf(buchstabe)));
                    indexOftextfeld.setText("");
                }
            }
        });
        lastindexOfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=stringtextfeld1.getText();
                String buchstabe =lastindexOftextfeld.getText();

                if (text.equals("")|| lastindexOftextfeld.getText().equals("")) {
                    ausgabetextfeld.setText("Bitte richtigen Felder füllen");
                } else {
                    ausgabetextfeld.setText(String.valueOf(text.lastIndexOf(buchstabe)));
                    lastindexOftextfeld.setText("");
                }
            }
        });
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=stringtextfeld1.getText();
                String text2=stringtextfeld2.getText();
                if (text.equals("")||text2.equals("")) {
                    ausgabetextfeld.setText("Bitte richtigen Felder füllen");
                } else {
                    if (text.equals(text2)) {
                        ausgabetextfeld.setText("Die beiden Texte sind identisch");
                    }
                    if (!text.equals(text2)) {
                        ausgabetextfeld.setText("Die beiden Texte sind NICHT identisch");
                    }
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=stringtextfeld1.getText();
                String text2=stringtextfeld2.getText();
                if (text.equals("")) {
                    ausgabetextfeld.setText("Bitte richtigen wert eingeben");
                } else {
                    if (text == text2) {
                        ausgabetextfeld.setText("Die beiden Texte sind identisch");
                    }
                    if (text != text2) {
                        ausgabetextfeld.setText("Die beiden Texte sind NICHT identisch");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stringoperatoren");
        frame.setContentPane(new Stringoperatoren().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //hallo
    }


}
