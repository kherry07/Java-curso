package retorno_valor;

public class transporte {
		
		int precio = 0;
		
		public transporte(int prix){
			System.out.println("Se creo un objeto transporter");
			this.precio = prix;
		}
		public int precio() {
			
			this.precio--;
			
			return this.precio;
			
		}

	


}
