
public class Operacion {

	public Persona generarImc(Persona per) {
		 per.setImc((per.getPeso()/per.getStatura())* (per.getStatura()));
		 return per;
		 
	}
}
