package displays;

import java.awt.* ;
import javax.swing.* ;

public class PJ_SWING{

    public static void main(String[] args) {
        //Frame stuff
        //add a label to a panel, add a panel to the frame
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

        JButton examAdd = new JButton("Add an exam") ;
        examAdd.addActionListener(e -> new examAdd()) ;
        JPanel examButtonPanel = new JPanel() ;
        examButtonPanel.add(examAdd) ;

        JButton aeAdd = new JButton("Add an assessed exercise") ;
        aeAdd.addActionListener(e -> new aeAdd()) ;
        JPanel aeButtonPanel = new JPanel() ;
        aeButtonPanel.add(aeAdd) ;

        JPanel buttonRow = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0)) ;
        buttonRow.add(examButtonPanel) ;
        buttonRow.add(aeButtonPanel) ;

        frame.add(titlePanel, BorderLayout.PAGE_START) ;
        frame.add(buttonRow, BorderLayout.CENTER) ;
        frame.setVisible(true) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
