public class Printer {
    
    public static String printerError(String s) {
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
    return resultado;
    }
}