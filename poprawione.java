package s;

public class xxxx123 {

	public static void main(String[] args) {
		
		
		char a = 'o';
		char b = 'x';
		
		char[] tab1 = {a,a,b,b,b,b,b,b,b,b,b,b};
		char[] tab2 = {b,a,b,b,b,b,a,b,b,b,a,b};
		char[] tab3 = {b,a,a,a,a,a,a,a,a,a,a,b};
		char[] tab4 = {b,a,b,a,b,b,b,b,a,b,a,b};
		char[] tab5 = {b,a,a,a,a,a,a,b,a,b,a,b};
		char[] tab6 = {b,b,a,b,b,b,a,b,a,a,b,b};
		char[] tab7 = {b,a,a,a,a,a,a,a,b,a,a,b};
		char[] tab8 = {b,b,b,b,b,b,b,b,b,b,a,a};
		char [][] tab = {tab1, tab2, tab3, tab4, tab5, tab6, tab7, tab8};
		
		double Xsasiadujace = 0;
		double Xpozostale = 0;
		int i = 0;
		int y = 0;
		for(i=0; i<tab.length; i++){
			for(y=0; y<tab[i].length; y++)
				System.out.print(tab[i][y]);
				
			System.out.println();
			///sprawdzam sasiadujace pola z gory, dolu i bokow do x
				if(tab[i][y] == b && tab[i-1][y] != a && tab[i+1][y] != a && tab[i][y-1] != a && tab[i][y+1] != a )
					Xsasiadujace= Xsasiadujace + 1;
				else Xpozostale = Xpozostale +1;
				if (Xsasiadujace/Xpozostale> 0.2);
						System.out.println("labirynt ma za duzo X-sów s¹siaduj¹cych tylko z X-sami");
					
		}
			
	}
}
