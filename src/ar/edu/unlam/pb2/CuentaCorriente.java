package ar.edu.unlam.pb2;

public class CuentaCorriente extends Cuenta {
	
	//Atributos
		
		private Double sobregiro;		
	
	//Constructores
		
		public CuentaCorriente()
		{
			super();
		}
		
		public CuentaCorriente(Double sobregiro)
		{
			super();
			this.sobregiro = sobregiro;
		}
		
	//Get - Set
		
		public Double getSobregiro() {
			return sobregiro;
		}

		public void setSobregiro(Double sobregiro) 
		{
			this.sobregiro = sobregiro * (-1);
		}
		
	//Metodos
		
		public void extraer(Double importe)
		{
			if((getSaldo()-importe)>=sobregiro)
			{
				setSaldo(getSaldo()-importe);	
			}
					
		}
}
