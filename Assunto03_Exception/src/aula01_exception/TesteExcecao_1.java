package aula01_exception;

public class TesteExcecao_1 {

	public static void main(String[] args) {
		
		System.out.println("INICIO DO MÉTODO MAIN.");
		
		try {
			primeiroMetodo();
		} catch (MyException e) {
			System.err.println("EXCEÇÃO CAPTURADA!");
		}
		
		System.out.println("FIM DO MÉTODO MAIN.");
	}
	
	
	public static void primeiroMetodo() throws MyException{
		
		System.out.println("INICIO DO MÉTODO 'primeiroMetodo'");
		segundoMetodo();
		System.out.println("FIM DO MÉTODO 'primeiroMetodo'");
	}
	
	
	public static void segundoMetodo() throws MyException{
		
		System.out.println("INICIO DO MÉTODO 'segundoMetodo'");
		for(int i=0; i<=5; i++) {
			System.out.println("NÚMERO: "  + i);
			//System.out.println(10/0);
		}
		System.out.println("FIM DO MÉTODO 'segundoMetodo'");
		throw new MyException("EXCEÇÃO ENCAMINHADA!");
	}

}
