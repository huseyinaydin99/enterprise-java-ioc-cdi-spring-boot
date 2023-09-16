package tr.com.huseyinaydin.cdiexample.named;

import javax.inject.Named;

@Named
public class MyBeanOne {
	private String myValue;

	public MyBeanOne() {
		myValue = " My bean one. Selamlar";
	}

	public MyBeanOne(String myValue) {
		this.myValue = myValue;
	}

	public String getMyValue() {
		return myValue;
	}

	public void setMyValue(String myValue) {
		this.myValue = myValue;
	}	
}
