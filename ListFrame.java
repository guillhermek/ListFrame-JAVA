import java.awt. FlowLayout;
import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener; 
import javax.swing.event.ListSelectionEvent;
import javax.swing. ListSelectionModel;

public class ListFrame extends JFrame
     {
private JList colorjList; 
private static final String[] colorNames = { "Black", "Blue", "Cyan",
"Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
 "Orange", "Pink", "Red", "White", "Yellow" };

 private static final Color[] colors = {Color.BLACK, Color.BLUE,
     Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
      Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
       Color.RED, Color.WHITE, Color. YELLOW };

public ListFrame()
{
super("List Test" ); 
setLayout(new FlowLayout()); 

colorjList = new JList( colorNames ); 
colorjList.setVisibleRowCount( 5 );

colorjList.setSelectionMode( ListSelectionModel.SINGLE_SELECTION);
add(new JScrollPane( colorjList ) );

colorjList.addListSelectionListener(
new ListSelectionListener() 
{
     public void valueChanged( ListSelectionEvent event)
{
          getContentPane().setBackground( 
               colors[colorjList.getSelectedIndex()]);
                         } 
                    }     
               ); 
          } 
     } 