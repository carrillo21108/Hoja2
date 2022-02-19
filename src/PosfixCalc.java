
public class PosfixCalc implements IPosfixCalc{
	
	Stack pila;
	
	@Override
	public int Evaluate(String expresion){
		pila = new Stack();
		
		for(char i: expresion.toCharArray()) {
			
			if(Character.isDigit(i)) {
				pila.push(Character.getNumericValue(i));
				
			}else if(i=='+' || i=='-' || i=='*' || i=='/') {
				if(pila.count()>=2) {
					int b = (int) pila.pull();
					int a = (int) pila.pull();
					
					if(i=='/' && b==0) {
						System.out.println("Expresion no valida. Division entre cero.");
						return 0;
					}
					
					pila.push(this.Operate(a, b, i));
					
				}else {
					System.out.println("Expresion no valida. Insuficiente cantidad de operandos.");
					return 0;
				}
			}else if(!Character.isSpaceChar(i)){
				System.out.println("Expresion no valida. Caracter no reconocible en la expresion.");
				return 0;
			}
		}
		
		if(pila.count()>1) {
			System.out.println("Expresion no valida. Excesiva cantidad de operandos.");
			return 0;
		}
		
		return (int) pila.peek();
		
	}
	
	private int Operate(int a, int b, char c) {
		int result=0;
		
		switch(c) {
			case '+':
				result = a+b;
				break;
			case '-':
				result = a-b;
				break;
			case '*':
				result = a*b;
				break;
			case '/':
				result = a/b;
				break;
		}
		
		return result;
	}

}
