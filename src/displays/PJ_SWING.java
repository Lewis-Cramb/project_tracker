package displays;

import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
import java.util.ArrayList ;

import storing.inOut ;
import assessment.Assessment ;

public class PJ_SWING extends JFrame{

    public static void main(String[] args) {
        //Storing stuff (implemented throughout)
        ArrayList<Assessment> assessments = new ArrayList<Assessment>() ; //holds all types of assessment
        //Frame stuff

        JFrame frame = new JFrame() ;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize() ; //using Toolkit to get screen size
        frame.setSize((int)screenSize.getWidth(), (int)screenSize.getHeight()) ;
        frame.setLayout(new BorderLayout()) ;
        
        JPanel titlePanel = new JPanel() ;
        titlePanel.setLayout(new BorderLayout()) ;
        JLabel userName = new JLabel("3012373C") ;
        userName.setHorizontalAlignment(SwingConstants.CENTER) ;
        userName.setFont(new Font("Sans Serif",Font.PLAIN,40)) ;
        userName.setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.BLACK)) ;
        JPanel titleInner = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10)) ;
        titleInner.setOpaque(false) ;
        titleInner.add(userName) ;
        titlePanel.add(titleInner, BorderLayout.NORTH) ;

        JPanel boxPanel = new JPanel(new GridLayout(2,3,50,100)) ;


        JButton examAdd = new JButton("Add an exam") ;
        examAdd.addActionListener(e -> new examBox(frame, boxPanel,assessments)) ;
        JPanel examButtonPanel = new JPanel() ;
        examButtonPanel.add(examAdd) ;

        JButton aeAdd = new JButton("Add an assessed exercise") ;
        aeAdd.addActionListener(e -> new aeBox(frame, boxPanel,assessments)) ;
        JPanel aeButtonPanel = new JPanel() ;
        aeButtonPanel.add(aeAdd) ;

        JPanel buttonRow = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0)) ;
        buttonRow.add(examButtonPanel) ;
        buttonRow.add(aeButtonPanel) ;

        JPanel topPanel = new JPanel(new BorderLayout()) ;
        topPanel.add(titlePanel, BorderLayout.PAGE_START) ;
        topPanel.add(buttonRow, BorderLayout.CENTER) ;

        frame.add(topPanel, BorderLayout.PAGE_START) ;
        frame.setVisible(true) ;
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                inOut.output(assessments) ;
                System.exit(0) ;
            }
        });
    }
}
