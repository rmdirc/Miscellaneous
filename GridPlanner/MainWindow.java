import java.awt.*;
import javax.swing.*;

public class MainWindow {

    private static JPanel getGrid(int gN_Width,int gN_Height,int panelSize) {
      int nPanels = gN_Width*gN_Height;
      JPanel grid = new JPanel();
      grid.setLayout(new GridLayout(gN_Width,gN_Height));
      grid.setPreferredSize(new Dimension(gN_Width*panelSize,gN_Height*panelSize));
      GridPanel[] gridPanels = new GridPanel[gN_Height*gN_Width];
      for(int i=0; i<nPanels; i++) {
        gridPanels[i] = new GridPanel(panelSize);
        grid.add(gridPanels[i]);
      }
      return grid;
    }

    private static void createWindow(int dimx, int dimy) {
      JFrame frame = new JFrame("Main");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //JLabel textLabel = new JLabel("Main",SwingConstants.CENTER);
      //textLabel.setPreferredSize(new Dimension(dimx, dimy));
      //frame.getContentPane().add(textLabel, BorderLayout.CENTER);
      frame.setLocationRelativeTo(null);
      frame.add(getGrid(10,10,20));
      frame.pack();
      frame.setVisible(true);
   }



   public static void main(String[] args) {
      int winSizeX=300;
      int winSizeY=100;
      if(args.length>1) {
        winSizeX=Integer.parseInt(args[0]);
        winSizeY=Integer.parseInt(args[1]);
      }
      createWindow(winSizeX,winSizeY);
   }
}
