package tr.com.huseyinaydin.cdiexample.named;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("myPreciousOne")
@RequestScoped
public class MyBeanTwo {
	private String myValue;

	public MyBeanTwo() {
		myValue = "Merhabalar ben Java CDI";
	}

	public MyBeanTwo(String myValue) {
		this.myValue = myValue;
	}

	public String getMyValue() {
		return myValue;
	}

	public void setMyValue(String myValue) {
		this.myValue = myValue;
	}	
}
