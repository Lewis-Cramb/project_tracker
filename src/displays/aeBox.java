package displays;

import assessment.AssessedExercise ;
import assessment.Assessment ;
import assessment.Exam;

import java.awt.* ;
import java.time.LocalDate ;
import javax.swing.* ;
import java.util.ArrayList ;

public class aeBox {

    private void setComplete(AssessedExercise ae){
        if (ae.isCompleted()){
            ae.setComplete(false) ;
        } else {
            ae.setComplete(true) ;
        }
    }

    public aeBox(JFrame frame, JPanel boxPanel, ArrayList<Assessment> assessList){
        AssessedExercise aeDetails = aeAdd.add() ;
        assessList.add(aeDetails) ;
        boxCreate(aeDetails, frame, boxPanel) ;
    }

    public aeBox(JFrame frame, JPanel boxPanel, AssessedExercise assessment){
        boxCreate(assessment, frame, boxPanel) ;
    }


    private void boxCreate(AssessedExercise aeDetails, JFrame frame, JPanel boxPanel){
        JPanel aeBox = new JPanel(new GridBagLayout()) ;
        GridBagConstraints gbc = new GridBagConstraints() ;
        
        JLabel date = new JLabel(aeDetails.getDate().toString()) ;
        gbc.gridx = 0 ;
        gbc.gridy = 0 ;
        aeBox.add(date, gbc) ;

        JLabel nameCourse = new JLabel(aeDetails.getName() + ": "+aeDetails.getCourse()) ;
        gbc.gridx = 0 ;
        gbc.gridy = 1 ;
        gbc.gridheight = 1 ;
        aeBox.add(nameCourse, gbc) ;

        JLabel link = new JLabel(aeDetails.getLink()) ;
        gbc.gridy = 2 ;
        aeBox.add(link, gbc) ;

        aeBox.setBorder(BorderFactory.createRaisedBevelBorder()) ;
        
        JCheckBox completed = new JCheckBox() ;
        completed.addActionListener(e -> setComplete(aeDetails));
        gbc.gridx = 1 ;
        gbc.gridy = 0 ;
        gbc.gridheight = 1 ;
        gbc.anchor = GridBagConstraints.CENTER ;
        aeBox.add(completed, gbc) ;

        JPanel circlePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g) ;
                Graphics2D g2d = (Graphics2D) g ;

                int examDay = aeDetails.getDate().getDayOfYear() ;
                int curDay = LocalDate.now().getDayOfYear() ;
                int remainingDays = examDay - curDay ;

                g2d.setColor(Color.WHITE) ;
                g2d.fillOval(5, 10, 50, 50) ;
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
        gbc.gridy = 1 ;
        gbc.gridheight = 3 ;
        gbc.anchor = GridBagConstraints.CENTER ;
        aeBox.add(circlePanel, gbc) ;

        boxPanel.add(aeBox) ;
        frame.add(boxPanel, BorderLayout.CENTER) ;
        frame.setVisible(true);
    }
}

