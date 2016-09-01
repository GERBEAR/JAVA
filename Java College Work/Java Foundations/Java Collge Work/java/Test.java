import java.util.Properties;
import java.util.Enumeration;


public class Test{
	public static void main(String[] args){
		Properties props = System.getProperties();

		Enumeration keys = props.propertyNames();

		while(keys.hasMoreElements()){
			String key = keys.nextElement().toString();
			String value = props.getProperty(key);
			System.out.println(key + " = " + value);
		}
	}	
}
