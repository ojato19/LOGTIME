import javax.swing.JFrame;

import co.com.view.main.MainBaseLoader;
import co.com.view.main.MainFrameLoaderInstance;

public class Main {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// Carga una instancia singleton de la base de la vista.
				MainBaseLoader frameLoader;
				try {
					frameLoader = MainFrameLoaderInstance.getMainFrameLoaderInstance().getMainFrameLoader();
					// Create and set up the window.
					JFrame frame = frameLoader.getMainFrame();
					// Desplegar la ventana con las caracteristicas ya parametrizadas.
					frame.pack();
					frame.setVisible(true);

				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

}