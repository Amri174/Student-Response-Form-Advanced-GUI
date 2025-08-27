import java.awt.*;
import java.awt.event.*;
import java.time.Year;

import javax.swing.*;

class EException extends Exception {
    public EException(String s) {
        super(s);
    }
}

class RF implements ActionListener {

    /* 
    l1- Register No.
    l2- Name
    l3- Gender
    l4- Degree
    l5- Branch
    l6- Year of Study
    l7- Date of Birth
    l8- Address
    l9- E-Mail Id(8)
    l10- Hobby
    l11- Extra Curricular Activities
    l12- You Entered
    l13- Title Display 

    RadioButton
    rb1- Male
    rb2- Female

    CheckBox
    ch1- Stamp Collection
    ch2- Reading Novels
    ch3- Playing Tennis

    ComboBox
    cb1- for Degree
    cb2- for Branch
    cb3- for year of study
    cb4- Date(bday)
    cb5- month(bday)
    cb6- year(bday)
    cb7- Extra curricular activities

    TextField
    tf1- Regno.
    tf2- Name

    Text Area
    ta2- display contents under you enterd
    ta1- Address
    ta3- Email ID
    ta4 - under extra curricular activities

    JTextPane 
    tp1- For Extra curricula Activity

    JScrollPane
    sp1- Display Extra curricula Activity
    sp2- Output Summary or Display Area

    ActionPerformed
    rb1/rb2- isSelected() to select gender
    ch1/ch2/ch3- isSelected() to select Hobby

    ScrollPane :
    sp1- contains the Extra Curricular Activities
    sp2- contains the Output Summary text area
    */

    JFrame f;
    JPanel p;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
    ButtonGroup bg;
    JRadioButton rb1, rb2;
    JCheckBox ch1, ch2, ch3;
    JComboBox<String> cb1, cb2, cb3, cb4, cb5, cb6, cb7;
    JTextField tf1, tf2;
    JTextArea ta1, ta2, ta3, ta4;
    JTextPane tp1;
    JScrollPane sp1, sp2;
    JButton b1;

    public RF() {
        f = new JFrame("Response Form");
        p = new JPanel();
        f.setContentPane(p);

        l13 = new JLabel("Student Response Form", JLabel.CENTER);
        l13.setFont(new Font("Verdana", Font.PLAIN, 35));
        l13.setBounds(80, 0, 600, 100);
        f.add(l13);

        l1 = new JLabel("Register No. ");
        l1.setBounds(40, 100, 150, 30);
        f.add(l1);
        tf1 = new JTextField();
        tf1.setBounds(160, 100, 200, 30);
        f.add(tf1);

        l2 = new JLabel("Name  ");
        l2.setBounds(40, 140, 150, 30);
        f.add(l2);
        tf2 = new JTextField();
        tf2.setBounds(160, 140, 150, 30);
        f.add(tf2);

        l3 = new JLabel("Gender ");
        l3.setBounds(40, 180, 150, 30);
        f.add(l3);

        bg = new ButtonGroup();
        rb1 = new JRadioButton("Female ");
        rb1.setBounds(160, 180, 80, 30);
        rb2 = new JRadioButton("Male ");
        rb2.setBounds(240, 180, 60, 30);
        bg.add(rb1);
        bg.add(rb2);
        f.add(rb1);
        f.add(rb2);
        f.setLocationRelativeTo(null);

        l4 = new JLabel("Degree ");
        l4.setBounds(40, 220, 150, 30);
        f.add(l4);

        String deg[] = { "B.Tech", "M.Tech", "Phd  " };
        cb1 = new JComboBox<>(deg);
        cb1.setBounds(160, 220, 200, 30);
        cb1.addActionListener(this);
        f.add(cb1);

        l5 = new JLabel("Branch ");
        l5.setBounds(40, 260, 200, 30);
        f.add(l5);

        String br[] = { "ICT", "IT", "CSE" };
        cb2 = new JComboBox<>(br);
        cb2.setBounds(160, 260, 200, 30);
        cb2.addActionListener(this);
        f.add(cb2);

        l6 = new JLabel("Year of Study ");
        l6.setBounds(40, 300, 150, 30);
        f.add(l6);

        String yos[] = { "I", "II", "III", "IV" };
        cb3 = new JComboBox<>(yos);
        cb3.setBounds(160, 300, 40, 30);
        cb3.addActionListener(this);
        f.add(cb3);

        l7 = new JLabel("Date of Birth ");
        l7.setBounds(40, 340, 150, 30);
        f.add(l7);

        String[] date = new String[31];
        for (int i = 0; i < 31; i++) {
            int n = i + 1;
            String sd = String.valueOf(n);
            date[i] = sd;
        }

        String month[] = { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE",
                "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" };
        String year[] = { "2001", "2002", "2003", "2004", "2005", "2006", "2007" };
        cb4 = new JComboBox<>(date);
        cb5 = new JComboBox<>(month);
        cb6 = new JComboBox<>(year);
        cb4.setBounds(160, 340, 40, 30);
        cb5.setBounds(205, 340, 80, 30);
        cb6.setBounds(290, 340, 70, 30);
        f.add(cb4);
        f.add(cb5);
        f.add(cb6);

        l8 = new JLabel("Address ");
        l8.setBounds(40, 380, 150, 30);
        f.add(l8);

        ta1 = new JTextArea();
        ta1.setBounds(160, 380, 200, 115);
        f.add(ta1);

        l9 = new JLabel("E-Mail Id ");
        l9.setBounds(40, 520, 150, 30);
        f.add(l9);

        ta3 = new JTextArea();
        ta3.setBounds(160, 520, 200, 30);
        f.add(ta3);

        l10 = new JLabel("Hobby ");
        l10.setBounds(390, 100, 50, 30);
        f.add(l10);

        ch1 = new JCheckBox("Stamp Collection");
        ch1.setBounds(440, 100, 125, 30);
        f.add(ch1);

        ch2 = new JCheckBox("Reading Novels");
        ch2.setBounds(560, 100, 115, 30);
        f.add(ch2);

        ch3 = new JCheckBox("Playing Tennis");
        ch3.setBounds(670, 100, 118, 30);
        f.add(ch3);

        l11 = new JLabel("Extra Curricular Activities ");
        l11.setBounds(390, 140, 150, 30);
        f.add(l11);

        ta4 = new JTextArea();
        sp1 = new JScrollPane(ta4, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp1.setBounds(420, 180, 150, 100);
        p.add(sp1);

        l12 = new JLabel("You Entered");
        l12.setBounds(390, 280, 80, 30);
        f.add(l12);

        ta4 = new JTextArea();
        sp2 = new JScrollPane(ta4, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp2.setBounds(420, 310, 300, 200);
        p.add(sp2);

        b1 = new JButton("OK");
        b1.setBounds(750, 550, 80, 40);
        b1.addActionListener(this);
        f.add(b1);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(900, 650);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s6 = " ";
        String s7 = " ";
        String s8 = " ";
        String s9 = " ";
        if (rb1.isSelected()) {
            s6 = "She";
        } else if (rb2.isSelected()) {
            s6 = "He";
        } else {
            s6 = " ";
        }
        if (ch1.isSelected()) {
            s7 = ch1.getText();
        } else {
            s7 = " ";
        }
        if (ch2.isSelected()) {
            s8 = ch2.getText();
        } else {
            s8 = " ";
        }
        if (ch3.isSelected()) {
            s9 = ch3.getText();
        } else {
            s9 = " ";
        }
        if (e.getSource() == b1) {
            ta2.setText("Shri/Sow " + tf2.getText() + "'s register number is " + tf1.getText() + "\n" + s6 + " is Studying in "
                    + cb3.getSelectedItem() + " year " + cb1.getSelectedItem() + " " + cb2.getSelectedItem() + ".\n" + s6
                    + " was born on" + cb4.getSelectedItem() + "-" + cb5.getSelectedItem() + "-" + cb6.getSelectedItem()
                    + ".\n" + s6 + " is residing at " + ta1.getText() + "\n" + s6 + " E-Mail Address is " + ta3.getText() + "\n"
                    + s6 + " is interested in " + s7 + s8 + s9 + ".\n" + s6 + " plays " + ta4.getText() + " well.");
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println("Look And Feel not set");
        }
        new RF();
    }
}
