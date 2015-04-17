import java.awt.EventQueue;
/*

}*/


public class Bingo{
	private int numero[]= new int [90];
	private int bingoCantado=0, cont;
	private int bolaNumero=90, bolaActual=0;
	private long tiempo=System.currentTimeMillis(), tiempo2;
	private PruebaVentana1 ventana1 = new PruebaVentana1(6, 76);

	
	
	public void lanzarbolas(){
		int previo=0;
		cont=0;
		while (bingoCantado==0){
			do
				previo=(int)(Math.random()*90);
			while (numero[previo]!=0);
			cont=cont+1;
			bolaActual=previo+1;
			numero[(previo)]=1;
			System.out.println("bola numero "+cont+" = "+bolaActual+" ");
			bolaNumero=bolaNumero-1;
			ventana1.ponTexto(cont, bolaActual );
			tiempo2=System.currentTimeMillis();
			while (tiempo2<=(tiempo+1000)){
				
					tiempo2=System.currentTimeMillis();
			}
			tiempo=System.currentTimeMillis();
			if (bolaNumero==0){bingoCantado=1;}
		}
	}
	public void contadorCero() {
		for (int i=0; i<90; i++){
			numero[i]=0;
		}
		
	}
    public void lanzaVentana(){
	
			try {
				
				ventana1.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    
    public static void main(String[] args) {
    	Bingo partida=new Bingo();	
    	partida.contadorCero();
    	partida.lanzaVentana();
    	partida.lanzarbolas();}
}
