
	import javax.swing.JOptionPane;
	public class Villanos1 {
		static int a, b;
		static int c, i;
		static int j, k;
		static int k1;
		static String texto, textoEncriptado="";
		static char letra[]={'A', 'B', 'C', 'D', 'E', 'F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

		public static void main(String[] args) {
		// Introducir el texto a encriptar.
	 texto=JOptionPane.showInputDialog(texto);
	 	// Pasa el texto a mayusculas.
	 texto=texto.toUpperCase();
	 	// Ejecuta el metodo de encriptar.
	 Encriptador(texto);
	 	// Muestra el texto encriptado.
	 System.out.print(textoEncriptado);	
		}
		public static String Encriptador(String t){
			// Calcula la constante a sumar. Basada en los espacios del texto.
			k1=Posicionador(t.length(), t);
			// Realiza la encriptación propiamente dicha.
			for (i=0; i<t.length();i++){
					if (t.charAt(i)==' '){textoEncriptado=textoEncriptado+" ";}
					else{for (j=0; j<letra.length;j++){
					if (t.charAt(i)==letra[j]){
						// Calcula la posición de la letra suplente.
						k=CalculoConstante(j, k1);
						textoEncriptado=textoEncriptado+letra[k];
					}}
				}}
			return  textoEncriptado;
		}
		public static int Posicionador(int p, String t){
			// Calcula la constante en base a los espacios del texto.
			k=0;
			for (i=0;i<p;i++){
				if (t.charAt(i)==' '){
					k=k+1;
				}
			}
			
		return k;}
		public static int CalculoConstante(int pos, int con){
			// Aplica la condición de encriptado y vuelve la posición nueva.
			k=((2*pos) % 27)+con;
			if (k>=(letra.length-1)){k=k-(letra.length-1);}
			return k;
		}

	}

