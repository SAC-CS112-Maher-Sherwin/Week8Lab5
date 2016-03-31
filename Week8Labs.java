
package week8labs;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Week8Labs {
    
    public static void main(String[] args) {
        String start = "yes";
        
        while (start.equalsIgnoreCase("yes")){
            
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
       
            String userName = JOptionPane.showInputDialog("Hello, what is your name?");
            String userYear = JOptionPane.showInputDialog("In what year were you born?");
        
            int birthYear = Integer.parseInt(userYear);
            int userAge = currentYear - birthYear;
        
                if (userAge >= 21){
                
                    String drink = String.format("Hello, %s, you are %d years old today! "
                        + "\nYou can buy a drink!", userName, userAge);
                    JOptionPane.showMessageDialog(null, drink);
                    }
            
                else {
                    int legalYear = ((21-userAge)+ currentYear);
                
                    String noDrink = String.format("Hello, %s, you are %d years old today! "
                        + "\nYou can drink in %d.", userName, userAge, legalYear);
                
                    JOptionPane.showMessageDialog(null, noDrink);
                }
            
            start = JOptionPane.showInputDialog("Want to start over? (Yes or No)");
            
        }
       
    }
    
}
