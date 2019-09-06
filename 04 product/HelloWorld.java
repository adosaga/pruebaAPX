public class HelloWorld {
   public static void main(String[] args) {
      // Prints "Hello, World" in the terminal window.
      
	  int[] array= new int[3];
	  array[0]=1;
	  array[1]=2;
	  array[2]=3;
	  int conta=0;
	  int resultado=0;
	  int mayor=0;
	  for(int i=0;i<array.length-1;i++)
		if(array[i]*array[i+1]>mayor)
			  mayor=array[i]*array[i+1];
		  
	  	  System.out.println(mayor);
   }
}