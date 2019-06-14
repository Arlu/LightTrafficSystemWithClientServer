package Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;




public class serverGUI extends JFrame {

    private JComboBox selectCrossSection;
    private JButton Phase1Button;
    private JButton Phase2Button;
    private JButton Phase3Button;
    private JButton Phase1_ToAllButton;
    private JButton Phase2_ToAllButton;;
    private JButton Phase3_ToAllButton;
    private JButton getControlButton;
    private JLabel CrossSectionLabel;
    JFrame frame ;
    Boolean isAlive;

    public serverGUI(){

        selectCrossSection = new JComboBox();
        Phase1Button = new JButton("עבור לפאזה 1");
        Phase2Button = new JButton("עבור לפאזה 2");
        Phase3Button = new JButton("עבור לפאזה 3");
        Phase1_ToAllButton = new JButton("כולם לפאזה 1");
        Phase2_ToAllButton = new JButton("כולם לפאזה 2");
        Phase3_ToAllButton = new JButton("כולם לפאזה 3");
        getControlButton = new JButton("קח שליטה");
        CrossSectionLabel = new JLabel("צומת:");
        isAlive = true;
        frame =  new JFrame("Traffic-Light ControllerTrafficLight ");
        init();
        frame.setVisible(true);

    }


    public void init(){
        frame.setLayout(null);
        frame.setSize(400,400);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                thisWindowClosing(e);
            }
        });
        selectCrossSection.setBounds(100,30,200,30);
        CrossSectionLabel.setBounds(300,30,20,30);
        CrossSectionLabel.setSize(30,30);
        Phase1Button.setBounds(250,70,120,30);
        Phase2Button.setBounds(250,120,120,30);
        Phase3Button.setBounds(250,170,120,30);
        Phase1_ToAllButton.setBounds(70,70,120,30);
        Phase2_ToAllButton.setBounds(70,120,120,30);
        Phase3_ToAllButton.setBounds(70,170,120,30);
        getControlButton.setBounds(170,210, 120, 30);


        frame.add(CrossSectionLabel);
        frame.add(selectCrossSection);
        frame.add(Phase1Button);
        frame.add(Phase2Button);
        frame.add(Phase3Button);
        frame.add(Phase1_ToAllButton);
        frame.add(Phase2_ToAllButton);
        frame.add(Phase3_ToAllButton);
        frame.add(getControlButton);

        selectCrossSection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("comboBox open");
            }
        });

        Phase1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("move  to phase 1 button pressed");
            }
        });

        Phase2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("move to phase 2 button pressed");
            }
        });

        Phase3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("move to phase 3 button pressed");
            }
        });

        Phase1_ToAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("move all to phase 1 button pressed");
            }
        });

        Phase2_ToAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("move all to phase 2 button pressed");
            }
        });

        Phase3_ToAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("move all to phase 3 button pressed");
            }
        });

        getControlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("get control button pressed");
            }
        });




    }


    private void thisWindowClosing(WindowEvent e)
    {
        isAlive = false;
    }


}

