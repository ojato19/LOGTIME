package co.com.view.templates.bluesky;

import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

import co.com.view.main.MainBaseLoader;

public class BlueSkyFrame extends JFrame implements MainBaseLoader {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public JFrame getMainFrame() {
		
		initUI();

		
		return this;
	}
	
	 private void initUI() {

	        JButton quitButton = new JButton("Quit");

	        

	        createLayout(quitButton);

	        setTitle("Quit button");
	        setSize(300, 200);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	    }

	    private void createLayout(JComponent... arg) {

	        Container pane = getContentPane();
	        GroupLayout gl = new GroupLayout(pane);
	        pane.setLayout(gl);

	        gl.setAutoCreateContainerGaps(true);

	        gl.setHorizontalGroup(gl.createSequentialGroup()
	                .addComponent(arg[0])
	        );

	        gl.setVerticalGroup(gl.createSequentialGroup()
	                .addComponent(arg[0])
	        );
	    }

}
