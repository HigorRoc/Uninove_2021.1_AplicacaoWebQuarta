package aula01_exception;

public class MyException extends RuntimeException{
	
	private static final long serialVersionUID = 1L; //Java.io
	
	public MyException(String message) {
		
		super(message);
	}
}
