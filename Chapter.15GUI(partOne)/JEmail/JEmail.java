/*8. a. Search the Java Web site for information on how to use a JTextArea. Write an
    application for the WebBuy Company that allows a user to compose the three
    parts of a complete e-mail message: the “To:”, “Subject:”, and “Message:” text. The
    “To:” and “Subject:” text areas should provide a single line for data entry. The
    “Message:” area should allow multiple lines of input and be able to scroll if
    necessary to accommodate a long message. The user clicks a button to send the
    e-mail message. When the message is complete and the Send button is clicked, the
    application should display “Mail has been sent!” on a new line in the message area.
    Save the file as JEMail.java. */

    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;

    public class JEmail extends JFrame implements ActionListener
    {
        private JPanel panel1 = new JPanel();
        private JPanel panel2 = new JPanel();
        private JPanel panel3 = new JPanel();

        private JTextArea toArea = new JTextArea(1,20);
        private JTextArea subjectArea = new JTextArea(1,20);
        private JTextArea messageArea = new JTextArea(6,20);

        private JScrollPane scroll = new JScrollPane(messageArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                     ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        private JButton send = new JButton("SEND");

        private JLabel to = new JLabel("TO: ");
        private JLabel subject = new JLabel("SUBJECT: ");
        private JLabel message = new JLabel("MESSAGE: ");
        private Container con = getContentPane();

        public JEmail()
        {
            setTitle("JEmail");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setDefaultLookAndFeelDecorated(true);
            setLayout(new GridLayout(4,1));
            con.add(panel1);
            con.add(panel2);
            con.add(panel3);
            
            panel1.add(to);
            panel1.add(toArea);

            panel2.add(subject);
            panel2.add(subjectArea);

            panel3.add(message);
            panel3.add(scroll);
            
            con.add(send);

            send.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            Object source = e.getSource();

            if(source == send)
            {
                messageArea.append("\nMAIL HAS BEEN SENT");
            }
        }

        public static void main(String[] args)
        {
            JEmail aFrame = new JEmail();
            aFrame.setBounds(300,300,300,300);
            aFrame.setVisible(true);
        }
    }






