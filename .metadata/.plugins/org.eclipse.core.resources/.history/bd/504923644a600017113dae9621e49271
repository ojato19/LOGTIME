package co.com.view.main;

import co.com.view.ViewPropertyLoader;

public class MainFrameLoaderInstance {
	private static MainFrameLoaderInstance instance;
	private ViewPropertyLoader properties = ViewPropertyLoader.getPropertyLoaderInstance();

	private MainFrameLoaderInstance() {
	}

	public static MainFrameLoaderInstance getMainFrameLoaderInstance() {
		if (instance == null) {
			instance = new MainFrameLoaderInstance();
		}
		return instance;
	}

	public MainBaseLoader getMainFrameLoader()
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> aClass = Class.forName(properties.getTemplateClass());
		return (MainBaseLoader) aClass.newInstance();

	}

}
