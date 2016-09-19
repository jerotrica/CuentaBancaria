package ar.edu.unlam.pb2;

public class Cuenta {
	
	//Atributos
	
		private Double saldo;
		private String cliente;

	//Constructores
		
		public Cuenta()
		{
			
		}
		
		public Cuenta(Double saldo, String cliente)
		{
			this.saldo = saldo;			
			this.cliente = cliente;
		}
		
	//Get-Set

		public Double getSaldo() {
			return saldo;
		}

		public void setSaldo(Double saldo) {
			this.saldo = saldo;
		}
		
		public String getCliente() {
			return cliente;
		}

		public void setCliente(String cliente) {
			this.cliente = cliente;
		}
		
	//Metodos
		
		public void depositar(Double importe)
		{
			saldo+=importe;
		}
}