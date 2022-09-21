import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

import java.awt.event.WindowListener;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayGame extends JFrame implements WindowListener, ActionListener{
   
   
    JLabel lbl1;
    JButton b1, b2, b3, b4, b5;
    JPanel p1;
    int i;
    PlayGame(String FrameTitle){
        super(FrameTitle);
        setLayout(null);
        setVisible(true);
        setSize(900,900);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        lbl1 = new JLabel("Where is Nepal?");
        lbl1.setBackground(Color.BLUE);
        lbl1.setBounds(100, 100, 500, 30);
        
        // p1 = new JPanel();
        // p1.setLayout(new GridLayout(2, 2));
        // p1.setVisible(true);
        // p1.setLocation(100, 50);
        b1 = new JButton("Asia");
        b2 = new JButton("Africa");
        b3 = new JButton("South America");
        b4 = new JButton("North America");
        b5 = new JButton("Next");
        b1.setBounds(100, 150, 150, 30);
        b2.setBounds(100, 200, 150, 30);
        b3.setBounds(300, 150, 150, 30);
        b4.setBounds(300, 200, 150, 30);

        b5.setBounds(500, 500, 200, 30);

        add(lbl1);
        add(b1);
        add(b3);
        add(b2);
        add(b4);
        // add(p1);
        add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    }

    /* (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    
    public void actionPerformed(ActionEvent e){
        JButton eventSource = (JButton)e.getSource();
        if(eventSource.getText() == "Asia"){
            eventSource.setBackground(Color.GREEN);
        }
        else{
            eventSource.setBackground(Color.RED);
        
        }
        if(eventSource == b5){
           
                lbl1.setText("Who is the?"); 
            }

        }
    
    
    public static void main(String[] args) {
        new PlayGame("Play Game");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        this.dispose();
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
}




    
        
     
