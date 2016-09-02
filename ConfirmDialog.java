/*	Andrew Kulpa
	CS251
	Simple practice using dialog with user through JOptionPane.
*/


import javax.swing.JOptionPane;
public class ConfirmDialog
{
	public static void main(String[] args)
	{
		//JOptionPane.showMessageDialog( null, "Hello there!", "This is a message for you.", JOptionPane.INFORMATION_MESSAGE); //ERROR,INFORMATION,WARNING,QUESTION,PLAIN
		//JOptionPane.showInputDialog( null, "Enter a value:");
		//while( JOptionPane.showConfirmDialog(null, "Do you wish to continue?") == JOptionPane.YES_OPTION )
		//{
		//}
		
		
		//Format (Component parentComponent, Object message, String title, int optionType
		//optionType= JOptionType.YES_NO_OPTION, JOptionType.YES_NO_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION
		while( JOptionPane.showConfirmDialog(null, "Do you wish to continue?", "test", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION )
		{
		}
	}
}
