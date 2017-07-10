package co.com.view;

import java.util.ResourceBundle;

public  abstract class PropertyLoader {
	
	protected String source;
	
	ResourceBundle bundle ;
	
	protected abstract String getProperty(StringBuilder key) ;
	protected abstract void loadValues();	
}
