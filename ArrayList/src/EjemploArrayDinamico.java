import java.util.ArrayList;


public class EjemploArrayDinamico {

	
	public static void main(String[] args) {
		String colores[]={"rojo","verde","naranja"};
		//recorrer el Array
		for(int i=0;i<colores.length;i++)
		{
			System.out.println("los colores son "+ colores[i]);
		}
		
		//Creacion ArrayList
		
		ArrayList <String> ColoresLista=new ArrayList <String>();
		
		//rellenar ArrayList
		for(int i=0;i<colores.length;i++)
		{
			ColoresLista.add(colores[i]);
		}
		 
		System.out.println(ColoresLista.size());
		
		for (int i=0;i<ColoresLista.size();i++)
		{
			System.out.println(ColoresLista.get(i));
		}
		
		
		//Añadir u color
		
		ColoresLista.add("violeta");
		for(int i=0;i<ColoresLista.size();i++)
		{
			System.out.println(ColoresLista.get(i));
		}
		//Eliminar elemento
		
		ColoresLista.remove(0);
		
		/*// Creamos Array colores

		int ArrayInt[]=new int[10];//es un objeto por eso ponemos new
		String ArrayStr[]=new String[10];
		int ArrayInt1[];
		int valor=10;
		
		
		//instanciamo el Array
		ArrayInt1=new int[5];
		*/	
			
		
		
		
	}

}

