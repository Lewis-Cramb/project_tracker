package displays;

import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;

public class PJ_SWING{

    public static void main(String[] args) {
        //Frame stuff
        //add a label to a panel, add a panel to the frame
        JFrame frame = new JFrame() ;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize() ; //using Toolkit to get screen size
        frame.setSize((int)screenSize.getWidth(), (int)screenSize.getHeight()) ;
        
        JPanel titlePanel = new JPanel() ;
        JLabel userName = new JLabel("3012373C") ;
        userName.setFont(new Font("Sans Serif",Font.PLAIN,40)) ;
        userName.setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.BLACK)) ;
        titlePanel.add(userName,BorderLayout.PAGE_START) ;

        JButton examAdd = new JButton("Add an exam") ;
        examAdd.addActionListener(e -> new examAdd()) ;

        
        frame.add(titlePanel, BorderLayout.PAGE_START) ;
        frame.add(examAdd) ;
        frame.setVisible(true) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
