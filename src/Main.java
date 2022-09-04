import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Persona p= new Persona();
		Scanner entrada=new Scanner (System.in);
		System.out.println("Ingrese los datos de la persona");
		
		System.out.println("Ingrese su peso");
		p.setPeso(entrada.nextDouble());
		
		System.out.println("Cual es su Estatura?");
		p.setStatura(entrada.nextDouble());
			
		Operacion o = new Operacion();
		p = o.generarImc(p);
		System.out.println("El IMC es:" +p.getImc());
		
	}

}
