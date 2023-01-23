/*b. Modify the JEMail application to include a Clear button that the user can click at
    any time to clear the “To:”, “Subject:”, and “Message:” fields. Save the file as
    JEMail2.java */

    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;

    public class JEmail2 extends JFrame implements ActionListener
    {
        private JPanel panel1 = new JPanel();
        private JPanel panel2 = new JPanel();
        private JPanel panel3 = new JPanel();
        private JPanel panel4 = new JPanel();

        private JTextArea toArea = new JTextArea(1,20);
        private JTextArea subjectArea = new JTextArea(1,20);
        private JTextArea messageArea = new JTextArea(6,20);

        private JScrollPane scroll = new JScrollPane(messageArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                     ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        private JButton send = new JButton("SEND");
        private JButton clear = new JButton("CLEAR");

        private JLabel to = new JLabel("TO: ");
        private JLabel subject = new JLabel("SUBJECT: ");
        private JLabel message = new JLabel("MESSAGE: ");
        private Container con = getContentPane();

        public JEmail2()
        {
            setTitle("JEmail2");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setDefaultLookAndFeelDecorated(true);
            setLayout(new GridLayout(4,1));
            con.add(panel1);
            con.add(panel2);
            con.add(panel3);
            con.add(panel4);
            
            panel1.add(to);
            panel1.add(toArea);

            panel2.add(subject);
            panel2.add(subjectArea);

            panel3.add(message);
            panel3.add(scroll);
            messageArea.setLineWrap(true);

            panel4.add(send);
            panel4.add(clear);

            send.addActionListener(this);
            clear.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            Object source = e.getSource();

            if(source == send)
            {
                messageArea.append("\nMAIL HAS BEEN SENT");
            }
            else
            if(source == clear)
            {
                toArea.setText("");
                subjectArea.setText("");
                messageArea.setText("");
            }
        }

        public static void main(String[] args)
        {
            JEmail2 aFrame = new JEmail2();
            aFrame.setBounds(300,300,300,300);
            aFrame.setVisible(true);
        }
    }






