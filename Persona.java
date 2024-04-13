package tp1;

public class Persona {
	
	//ATRIBUTOS
		String nombre;
		int documento;
		char sexo;
		String carrera;
		String domicilio;
		
	//CONSTRUCTOR
			public Persona(String nombre, int documento, char sexo, String carrera, String domicilio){
				this.nombre = nombre;
				this.documento = documento;
				this.sexo = sexo;
				this.carrera = carrera;
				this.domicilio = domicilio;
			}
		
	//GET Y SET	
		public String getNombre() {
			return nombre;
		}
	
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	
		public int getDocumento() {
			return documento;
		}
	
		public void setDocumento(int documento) {
			this.documento = documento;
		}
	
		public char getSexo() {
			return sexo;
		}
	
		public void setSexo(char sexo) {
			this.sexo = sexo;
		}
	
		public String getCarrera() {
			return carrera;
		}
	
		public void setCarrera(String carrera) {
			this.carrera = carrera;
		}
	
		public String getDomicilio() {
			return domicilio;
		}
	
		public void setDomicilio(String domicilio) {
			this.domicilio = domicilio;
		}
	
	//METODOS
		public void hablar(){
			System.out.println("La persona está HABLANDO");
		}
		public void caminar(){
			System.out.println("La persona está CAMINANDO");
		}
		public void comer(){
			System.out.println("La persona está COMIENDO");
		}

	

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Leonel Amir", 40441651, 'M', "Desarrollo de Software", "B° Cuyaya");
		
		persona1.caminar();
		persona1.hablar();
		persona1.comer();
	}

}
