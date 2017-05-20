package Factory;

import DataProvider.ConfigDataProvider;
import DataProvider.ExcelDataProvider;

public class DataProviderFactory {

	public static ConfigDataProvider getConfig(){
		ConfigDataProvider c= new ConfigDataProvider();
		return c;
	}
	
	public static ExcelDataProvider getExcel(){
		ExcelDataProvider e= new ExcelDataProvider();
		return e;
	}
}
