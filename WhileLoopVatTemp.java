import javax.swing.JOptionPane;   // Importing JOptionPane

/*
 * This program uses the while loop to check a substance's temperature every 15 minutes.
 * If the temperature does not exceed 102.5 degrees C, the user does nothing.
 * If the temperature exceeds 102.5 degrees C, the user will be prompted to check again
 * in 5 minutes. This will repeat until the temperature does not exceed 102.5 degrees C.
 */

public class WhileLoopVatTemp
{
 public static void main(String[] args)
 {
  final double MAX_TEMP = 102.5;   // Maximum temperature
  double temperature;
  int loops = 1;
  String keyboard; // Keyboard input
  
  // Prompt user for the temperature.
  keyboard = JOptionPane.showInputDialog("What is the current temperature?");

  // Convert string input to double variable temperature.
  temperature = Double.parseDouble(keyboard);

  // Begin while loop if the temperature exceeds maximum.
 while (temperature > MAX_TEMP)
  {  // Start while  --  Inform user the temperature exceeds the maximum allowed..
      JOptionPane.showMessageDialog(null, "The temperature exceeds the maximum allowed. " +
                                    "Turn down the temperature of the vat and " +
                                  "check the temperature again in 5 minutes.");
      // Prompt user again for the temperature.
      keyboard = JOptionPane.showInputDialog("What is the current temperature?");
  
      // Convert string input to double variable temperature.
      temperature = Double.parseDouble(keyboard);
  }  // end while
  
   // Inform the user that the temperature does not exced 102.5.
   JOptionPane.showMessageDialog(null, "The temperature does not exceed 102.5. Check " +
                                  "again in 15 minutes.");
    
 
  System.exit(0); 
 }
}
