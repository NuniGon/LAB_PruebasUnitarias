package Nuria_Laboratorio.JUnit_Lab.Nuria_Laboratorio.JUnit_Lab;

/**
 * Hello world!
 *
 */
public class App {
   
	
 	static int distancia[][];
 	
    private static int DistanciaEntrePalabras(char str1[], char str2[]) {
        distancia = new int[str1.length+1][str2.length+1]; //(m+1)(n+1)

        for(int i=0;i<=str1.length;i++) {
                distancia[i][0]=i;
        }
        for(int j=0;j<=str2.length;j++){
                distancia[0][j]=j;
        }
        
        for(int i=1;i<=str1.length;i++){
            for(int j=1;j<=str2.length;j++){ 
            	
                  distancia[i][j]= minimum(distancia[i-1][j]+1,distancia[i][j-1]+1,distancia[i-1][j-1]+(/*str(str1,str2)*/(str1[i-1]==str2[j-1])?0:1));
            }
        }
        return distancia[str1.length][str2.length];
        
    }
    
    
    public static int mostrarCambios(String str1, String str2) {
        return DistanciaEntrePalabras(str1.toCharArray(),str2.toCharArray());
    }
    
    /*  private static int str(char str1[], char str2[]){
	int i= 0;
	int j = 0;

	distancia = new int[str1.length+1][str2.length+1];
	if((str1[i-1]==str2[j-1])){
		distancia[str1.length][str2.length] = 0;
	}
	else{
		distancia[str1.length][str2.length]=1;
	}
	
	return distancia[str1.length][str2.length];
}
*/

    private static int minimum(int a, int b, int c) {
    	return Math.min(Math.min(a, b), c);
    
    	/*if(b<=a && b<=c){
            return b;
        } 
        if(a<=b && a<=c){
            return a;
        }
        return c;*/
    }
    
	
	public static void main(String [] args) {
        String palabra[] = { "amor", "amor", "oslo", "solo", "rara", "amor" };
        
        for (int i = 0; i < palabra.length; i += 2)
            System.out.println("* " + palabra[i] + ", " + palabra[i+1] + " = " + mostrarCambios(palabra[i], palabra[i+1]));
    }
}

