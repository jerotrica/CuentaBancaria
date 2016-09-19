package ar.edu.unlam.pb2;

public class CajaDeAhorro  extends Cuenta {
	
	//Atributos
		
		private Double interes;
	
	//Contructores
		
		public CajaDeAhorro()
		{
			super();
		}
		
		public CajaDeAhorro(Double interes)
		{
			super();
			this.interes = interes;
		}
		
	//Get - Set
		
		public Double getInteres() {
			return interes;
		}

		public void setInteres(Double interes) 
		{
			if(interes>=0 && interes<=1)
			{
				this.interes = interes;
			}			
		}
		
	//Metodos
		
		public void extraer(Double importe)
		{
			if(super.getSaldo()-importe>0)
			{
				super.setSaldo(getSaldo()-importe);		
			}
		}
		
		public void calcularIneteres()
		{
			setSaldo(interes*super.getSaldo());
		}

		
}