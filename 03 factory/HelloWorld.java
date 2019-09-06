public class HelloWorld {
   public static void main(String[] args) {
      // Prints "Hello, World" in the terminal window.
      
	  String s="aaaxbbbbyyhwawiwjjjwwm";
	  int conta=0;
	  String resultado="";
	  for(int i=0;i<s.length();i++){
		  
		  if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'm')) conta++;
		  if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'M')) conta++;
		  
	  }
	  conta=s.length()-conta;
	  resultado+=conta;
	  resultado+="/";
	  resultado+=s.length();
	  	  System.out.println(resultado);
   }
}