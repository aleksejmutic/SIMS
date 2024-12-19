package frame.workspace;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JEditorPane;
import javax.swing.JPanel;

import frame.popupmenu.MenuPopUp;


public class TabPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public TabPanel(String imageSrc) {
		//postavljanje osnovnih parametara
		this.setSize(new Dimension(4000,4000));
		JEditorPane editorPane = new JEditorPane("text/html", "<html><img src=file:" + imageSrc
	            + " width=1000height=900></img>");
		editorPane.setComponentPopupMenu(new MenuPopUp());
		this.setFocusable(false);
		this.add(editorPane);
	}
}
