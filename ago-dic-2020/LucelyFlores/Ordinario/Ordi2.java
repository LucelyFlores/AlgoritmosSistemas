import java.util.*;
public class Ordi2 
{	public static void main(String[] args) 
	{	int n;
		String busqueda;
		Scanner sc= new Scanner (System.in);
		System.out.println("N�mero de art�culos en la lista: ");
		n= sc.nextInt();
		System.out.println("Art�culo a buscar");
		busqueda= sc.next();
		String articulos[]= new String [n];
		for(int i=0; i<articulos.length; i++)
		{	System.out.println("Articulo " + (i+1) + ":");
			articulos[i]= sc.next();
		}
		int precios[]= new int [n];
		for(int i=0; i<precios.length; i++)
		{	System.out.println("Precio del Articulo " + (i+1) + ":");
			precios[i]= sc.nextInt();
		}
		int posicionDeElementoBuscado = existeEnArreglo(articulos, busqueda);
		if (posicionDeElementoBuscado == -1) 
		{	System.out.println("-1");
		} 
		else 
		{	System.out.println(posicionDeElementoBuscado+1);
		}
		}
		public static int existeEnArreglo(String[] arreglo, String busqueda) 
		{	for (int x = 0; x < arreglo.length; x++) 
		{	if (arreglo[x].equals(busqueda)) 
			{	return x;
		    }
		}
		return -1;
	}
}