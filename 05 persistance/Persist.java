class Persist {
	public static int persistence(long n) {
		String ca;
	  long cal;
	  String d;
	  int resultado=0;
	  boolean bandera=false;
	  
	  ca=""+n;
	  if (ca.length()==1) resultado=0;
	  else{
	  for(int i=0;i<99999999;i++)
	  {
		  
		cal=1;
		for(int j=0;j<ca.length();j++)
		{
			d=""+ca.charAt(j);
			cal*=Integer.parseInt(d);
		}
		ca=""+cal;
		if(ca.length()==1){resultado=i;bandera=true; break;}
		else
			ca=""+cal;
	  	  
			
		  
		  //i=99999999;
	  }
	  resultado++;
	  }
  return resultado;
}
}