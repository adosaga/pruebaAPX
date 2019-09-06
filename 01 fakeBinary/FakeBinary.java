public class FakeBinary {
    public static String fakeBin(String numberString) {
        	  String resultado= "";
	    for(int i=0;i<numberString.length();i++)
			if (Integer.parseInt(numberString.substring(i,i+1))<5) resultado+="0";
			else resultado+="1";
        
        return resultado;
    }
}