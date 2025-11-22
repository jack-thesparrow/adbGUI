package app.adbgui.ui;

import javax.swing.*;

public class MainWindow {

  public static void launchGUI() {
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("ADB GUI");
      frame.setSize(600, 400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.add(new JLabel("Welcome to ADB GUI!", SwingConstants.CENTER));

      frame.setVisible(true);
    });
  }
}
