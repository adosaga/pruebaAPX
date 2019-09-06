public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {
	  int conta=0;
	  int resultado=0;
	  int mayor=-9999999;
	  for(int i=0;i<array.length-1;i++)
		if(array[i]*array[i+1]>mayor)
			  mayor=array[i]*array[i+1];
    return mayor;
  }
}