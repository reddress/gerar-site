package br.com.pontualimportbrindes.staging;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import static br.com.pontualimportbrindes.util.Convenience.pprint;
import static br.com.pontualimportbrindes.util.Convenience.print;

public class ScrollableGUI extends JFrame implements ActionListener {
    JPanel panel;
    
    public ScrollableGUI() {
        super("Scrollable panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocation(0, 0);
        setPreferredSize(new Dimension(200, 300));
        
        JButton button = new JButton("Add codigo");
        button.addActionListener(this);
        
        add(button, BorderLayout.NORTH);
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(panel);
        add(scrollPane, BorderLayout.CENTER);
        pack();
    }
    
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
        case "Add codigo":
            pprint("adding codigo");
            panel.add(new JLabel("new line"));
            panel.revalidate();
            break;
        }
    }

    public static void main(String[] args) {
        ScrollableGUI sg = new ScrollableGUI();
        sg.setVisible(true);
    }
}
