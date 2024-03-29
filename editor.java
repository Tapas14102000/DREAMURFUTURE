package codexcoders;
import javax.swing.*; 
import java.io.*; 
import java.awt.event.*;
public class editor extends JFrame implements ActionListener
{
	JTextArea t; 
	JFrame f; 
	editor() 
	{ 
		f = new JFrame("MY NOTEPAD"); 
		t = new JTextArea(); 
     JMenuBar mb = new JMenuBar(); 
     JMenu m1 = new JMenu("FILE"); 
     JMenuItem mi1 = new JMenuItem("New"); 
     JMenuItem mi3 = new JMenuItem("Save"); 
     mi1.addActionListener(this); 
     mi3.addActionListener(this);  
     m1.add(mi1); 
     m1.add(mi3);  
     JMenu m2 = new JMenu("EDIT"); 
     JMenuItem mi4 = new JMenuItem("cut"); 
     JMenuItem mi5 = new JMenuItem("copy"); 
     JMenuItem mi6 = new JMenuItem("paste"); 
     mi4.addActionListener(this); 
     mi5.addActionListener(this); 
     mi6.addActionListener(this); 
     m2.add(mi4); 
     m2.add(mi5); 
     m2.add(mi6); 
     JMenu m3=new JMenu("EXIT");
     JMenuItem mc = new JMenuItem("close"); 
     mc.addActionListener(this);
     m3.add(mc);
     mb.add(m1); 
     mb.add(m2); 
     mb.add(m3); 
     f.setJMenuBar(mb); 
     f.add(t); 
     f.setSize(5000, 5000); 
     f.setVisible(true); 
	} 
	public void actionPerformed(ActionEvent e) 
	{ 
		String s = e.getActionCommand(); 
		if (s.equals("cut")) 
		{ 
			t.cut(); 
		} 
		else if (s.equals("copy")) 
		{ 
			t.copy(); 
		} 
		else if (s.equals("paste")) 
		{ 
			t.paste(); 
		} 
		else if (s.equals("Save")) 
		{ 
			JFileChooser j = new JFileChooser("f:"); 
			int r = j.showSaveDialog(null); 
			if (r == JFileChooser.APPROVE_OPTION) 
			{ 
				File fi = new File(j.getSelectedFile().getAbsolutePath()); 
				try { 
						FileWriter wr = new FileWriter(fi, false); 
						BufferedWriter w = new BufferedWriter(wr); 
						w.write(t.getText()); 
						w.flush(); 
						w.close(); 
					} 
				catch (Exception evt) 
				{ 
					JOptionPane.showMessageDialog(f, evt.getMessage()); 
				} 
			} 
			else
				JOptionPane.showMessageDialog(f, "the user cancelled the operation"); 
		} 
		
		else if (s.equals("New")) 
		{ 
			t.setText(""); 
		} 
		else if (s.equals("close"))
		{ 
			 f.setVisible(false);
		} 
} 
public static void main(String[] args) 
	{ 
	  editor e=new editor();
	}
}
