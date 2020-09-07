package Demo;

import javax.swing.*;
import java.awt.*;

public class Demo {
    private static Controller controller;
    private static JTextField numNPCsField;
    private static JLabel clock;

    public static void main(String args[]) {
        //initialise GUI
        controller = Controller.getInstance();
        setupInterface();

        //main loop
        while(true){
            clock.setText(timeToString());
        }
    }

    private static String timeToString(){
        return String.format("The current time is %02d:%02d", controller.hour, controller.minute);
    }

    private static void setupInterface(){
        //Create the Frame
        JFrame frame = new JFrame("Demo.Demo GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        //Create the panel at bottom and add components
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Number of NPCs");
        numNPCsField = new JTextField(10); // accepts up to 10 characters
        JButton generate = new JButton("Generate NPCs");
        generate.addActionListener((e)->controller.setNPCs(getNumNPCs()));
        JButton start = new JButton("Start");
        start.addActionListener((e)->controller.start());
        panel.add(label); // Components Added using Flow Layout
        panel.add(numNPCsField);
        panel.add(generate);
        panel.add(start);

        // scrollable Output text area at Center
        JScrollPane scrollPane = new JScrollPane();
        JTextArea outputArea = new JTextArea();
        scrollPane.add(outputArea);
        scrollPane.setViewportView(outputArea);

        // Clock to show sim time
        JPanel clockPanel = new JPanel();
        clock = new JLabel(timeToString());
        clockPanel.add(clock);

        //Add Components to the frame
        frame.getContentPane().add(BorderLayout.NORTH, clockPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, scrollPane);
        frame.setVisible(true);
    }

    // Parse the contents of numNPCsField from String to int
    public static int getNumNPCs(){
        String text = numNPCsField.getText();
        int num = 0;
        try{
            num = Integer.parseInt(text);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
        return num;
    }

}
