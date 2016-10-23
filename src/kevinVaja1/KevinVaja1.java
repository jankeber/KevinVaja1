package kevinVaja1;
import java.io.*;

public class KevinVaja1
{
	public static void main(String[] args) throws IOException
	{
		/*1) napiši program, ki s standardnega vhoda sprejme poljubno besedo, ki jo vstavi na konec stavka, 
		vendar samo v primeru, da se beseda začne na črko a

		zanka naj se zavrti 4 krat

		opomba vezana na izpis: rešitev naj izpiše po končanem programu. 
		Besede naj bodo izpisane v eni vrstici, med besedami
		naj bo en presledek

		Primer: v primeru, da vnesemo besede; rdeč, balon, avto, avion je rezultat sodeč

		avto avion
		 */
		
		int stevec = 0;
		char prvaCrka;
		String stavek = "";
		
		BufferedReader vhod = new BufferedReader(new InputStreamReader(System.in));
		
		while(stevec < 4)
		{
			System.out.println("Vpisi besedo: ");
			String beseda = vhod.readLine();
			
			prvaCrka = beseda.charAt(0);
			
			if(prvaCrka == 'a')
			{
				stavek = stavek + beseda + " ";
			}
			
			stevec++;
		}
		System.out.println(stavek);
		
		
		
		
	}
}
