import javax.swing.JOptionPane;
public class InputDialog
{
	public static void main(String[] args)
	{
		//JOptionPane.showMessageDialog( null, "Hello there!", "This is a message for you.", JOptionPane.INFORMATION_MESSAGE); //ERROR,INFORMATION,WARNING,QUESTION,PLAIN
		JOptionPane.showInputDialog( null, "Enter a value:");
	}
}