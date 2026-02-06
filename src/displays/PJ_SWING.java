package displays;

import javax.swing.* ;
import java.awt.* ;
import javax.swing.border.EmptyBorder;

public class PJ_SWING {
    public static void main(String[] args) {
        //Frame stuff
        JFrame frame = new JFrame() ;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize() ; //using Toolkit to get screen size
        frame.setSize((int)screenSize.getWidth(), (int)screenSize.getHeight()) ;
        frame.setLayout(new FlowLayout()) ;
        

        JLabel userName = new JLabel("3012373C") ;
        userName.setFont(new Font("Sans Serif",Font.PLAIN,40)) ;
        userName.setVerticalAlignment(SwingConstants.TOP) ;
        userName.setBorder(new EmptyBorder(20,40,10,10));
        frame.add(userName) ;

        
        frame.setVisible(true) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
