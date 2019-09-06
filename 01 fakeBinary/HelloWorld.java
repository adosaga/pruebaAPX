public class HelloWorld {
   public static void main(String[] args) {
      // Prints "Hello, World" in the terminal window.
      
	  String numberString= "516164";
	  String resultado= "";
	  for(int i=0;i<numberString.length();i++)
			if (Integer.parseInt(numberString.substring(i,i+1))<5) resultado+="0";
			else resultado+="1";
	  System.out.println(resultado);
	  //System.out.println(Integer.parseInt(numberString.charAt(i)).toString);
	  //System.out.println();
   }
}