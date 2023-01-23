/*  10. Create a JFrame for Java Junior College. Use menus to allow the user to
        access information about different campuses, major fields of study offered,
        and activities. Include at least two options in each menu. Save the file as
        JavaJuniorCollege.java */

        import javax.swing.*;
        import java.awt.*;

        public class JavaJuniorCollege extends JFrame
        {
            private JMenuBar mainBar = new JMenuBar();

            private JMenu menu1 = new JMenu("UON");
            private JMenu menu2 = new JMenu("MKU");

            private JMenu uonField = new JMenu("Field Of Study");
            private JMenuItem medicine = new JMenuItem("Medicine");
            private JMenuItem engineering = new JMenuItem("Engineering");
            private JMenu uonActivities = new JMenu("Activities");
            private JMenuItem foodScience = new JMenuItem("AFSTS");
            private JMenuItem biology = new JMenuItem("BWS");

            private JMenu mkuFiled = new JMenu("Field Of Study");
            private JMenuItem law = new JMenuItem("Law");
            private JMenuItem economic = new JMenuItem("Economics");
            private JMenu mkuActivities = new JMenu("Activities");
            private JMenuItem business = new JMenuItem("Business Exucutives");
            private JMenuItem peace = new JMenuItem("Peace Club");

            public JavaJuniorCollege()
            {
                setTitle("JavaJuniourCollege");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(new FlowLayout());
                setJMenuBar(mainBar);
                mainBar.add(menu1);
                mainBar.add(menu2);
                menu1.add(uonField);
                uonField.add(medicine);
                uonField.add(engineering);
                menu1.add(uonActivities);
                uonActivities.add(foodScience);
                uonActivities.add(biology);
                menu2.add(mkuFiled);
                mkuFiled.add(law);
                mkuFiled.add(economic);
                menu2.add(mkuActivities);
                mkuActivities.add(business);
                mkuActivities.add(peace);
            }

            public static void main(String[] args)
            {
                JavaJuniorCollege aFrame = new JavaJuniorCollege();
                aFrame.setBounds(300,300,400,400);
                aFrame.setVisible(true);
            }
        }