package co.com.view;

import java.util.ResourceBundle;

public class ViewPropertyLoader extends PropertyLoader {
	protected static ViewPropertyLoader instance;

	private String templateClass;
	private String language;
	private String location;

	private ViewPropertyLoader(String source) {
		this.source = source;
		bundle = ResourceBundle.getBundle(source);

	}

	public static ViewPropertyLoader getPropertyLoaderInstance() {
		return (ViewPropertyLoader) getPropertyLoaderInstance("co.com.view.view");

	}

	private static ViewPropertyLoader getPropertyLoaderInstance(String source) {
		if (instance == null) {
			instance = new ViewPropertyLoader(source);
			instance.loadValues();
		}
		return instance;

	}

	protected void loadValues()
	{
		templateClass = instance.getProperty(new StringBuilder("template-class"));
		language = instance.getProperty(new StringBuilder("language"));
		location = instance.getProperty(new StringBuilder("location"));
		
	}
	 protected String getProperty(StringBuilder key) {
		String value = null;
		if (bundle != null) {
			value = (String)bundle.getObject(key.toString());
		}
		return value;
	}

	public String getTemplateClass() {
		return templateClass;
	}

	public String getLanguage() {
		return language;
	}

	public String getLocation() {
		return location;
	}

	

}
