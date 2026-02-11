package displays;

import assessment.Exam ;
import java.awt.* ;
import java.time.LocalDate ;
import javax.swing.* ;

public class examBox {

    private static final JPanel boxPanel = new JPanel(new GridLayout(2,3,50,100)) ;

    public examBox(JFrame frame){
        Exam examDetails = examAdd.add() ;
        JPanel exmBox = new JPanel(new GridBagLayout()) ;
        GridBagConstraints gbc = new GridBagConstraints() ;
        
        JLabel date = new JLabel(examDetails.getDate().toString()) ;
        gbc.gridx = 0 ;
        gbc.gridy = 0 ;
        exmBox.add(date, gbc) ;

        JLabel nameCourse = new JLabel("Exam: "+examDetails.getCourse()) ;
        gbc.gridx = 0 ;
        gbc.gridy = 1 ;
        gbc.gridheight = 1 ;
        exmBox.add(nameCourse, gbc) ;

        JLabel link = new JLabel(examDetails.getLink()) ;
        gbc.gridy = 2 ;
        exmBox.add(link, gbc) ;

        date.setBorder(BorderFactory.createLineBorder(Color.black)) ;
        JPanel circlePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g) ;
                Graphics2D g2d = (Graphics2D) g ;
                int examDay = examDetails.getDate().getDayOfYear() ;
                int curDay = LocalDate.now().getDayOfYear() ;
                int remainingDays = examDay - curDay ;

                g2d.setColor(Color.WHITE) ;
                g2d.fillOval(5, 5, 50, 50) ;
                if (remainingDays < 8){
                    g2d.setColor(Color.RED) ;
                } else if (remainingDays > 7 && remainingDays < 15){
                    g2d.setColor(Color.ORANGE) ;
                } else {
                    g2d.setColor(Color.GREEN) ;
                }
                g2d.setStroke(new BasicStroke(2)) ;
                g2d.drawOval(5, 5, 50, 50) ;
                
                g2d.setColor(Color.BLACK) ;
                g2d.setFont(new Font("Arial", Font.BOLD, 10)) ;
                
                String text ;
                if (remainingDays ==1){
                    text = remainingDays + " day" ;
                } else {
                    text = remainingDays + " days" ;
                }
                FontMetrics fm = g2d.getFontMetrics() ;

                int x = (getWidth() - fm.stringWidth(text)) / 2 ;
                int y = ((getHeight() - fm.getHeight()) / 2) + fm.getAscent() ;
                g2d.drawString(text, x, y) ;
            }
        } ;
        circlePanel.setPreferredSize(new Dimension(60, 60)) ;
        gbc.gridx = 1 ;
        gbc.gridy = 0 ;
        gbc.gridheight = 3 ;
        gbc.anchor = GridBagConstraints.CENTER ;
        exmBox.add(circlePanel, gbc) ;

        boxPanel.add(exmBox) ;
        frame.add(boxPanel, BorderLayout.CENTER) ;
        frame.setVisible(true);
    }
}
