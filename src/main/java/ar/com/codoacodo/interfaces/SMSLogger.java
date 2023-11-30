package ar.com.codoacodo.interfaces;

public class SMSLogger implements ILogger {

	private String number ="+54111231....";
	
	/*public SMSLogger(String number) {
		this.number = number;
	}
	*/
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	@Override
	public void log() {
		
		System.out.println("Enviando un SMS al: " + this.number);

	}

}
