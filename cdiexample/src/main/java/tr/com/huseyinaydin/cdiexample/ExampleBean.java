package tr.com.huseyinaydin.cdiexample;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped //sunucuya her istek atıldığında yani her seferinde istenildiğinde yeniden oluştur demek oluyor.
public class ExampleBean {
	private String myValue;

	public ExampleBean() {
		myValue = "Merhabalar ben Java CDI";
	}

	public ExampleBean(String myValue) {
		this.myValue = myValue;
	}

	public String getMyValue() {
		return myValue;
	}

	public void setMyValue(String myValue) {
		this.myValue = myValue;
	}	
}