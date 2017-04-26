package com.rebouhna.partition;

public class Partition {
	/**
	 * Cette methode permet de partionner un tableau
	 * @param arrayToPart : tableau à partitionner
	 * @param pivot : nombre de parts
	 * @return 
	 */
	public static int[][] partition(int[] arrayToPart,int pivot) {
		int indexArray = 0,
			indexPart=0,
			lengthOfParts = 0; 
		if (arrayToPart==null ) {
			return null;
		} else {
			lengthOfParts = arrayToPart.length/pivot + (arrayToPart.length%pivot>0?1:0);

			int [][] parts = new int[lengthOfParts][];
			
			while(arrayToPart.length!=0 && indexArray<arrayToPart.length) {		
				if (arrayToPart.length-indexArray < pivot)
					 pivot = arrayToPart.length-indexArray;
				int [] tab = new int[pivot];
				for (int i = 0 ; i < pivot ; i++) {
						if (indexArray==arrayToPart.length)
	                    break;
						tab[i] = arrayToPart[indexArray];
						indexArray++;				
				}
				parts[indexPart]=tab;
				indexPart++;			
			}
			
			return parts;
		}
		
		
		
		
	}
	
	

}
