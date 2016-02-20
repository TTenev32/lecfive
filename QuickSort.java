package bg.thissome.newshit.lecfive;

public class QuickSort {
	public int[] harray;
	public int lengthOfIt;
	
	public void sorter(int[] inputArr){
		if (inputArr == null || inputArr.length == 0){
			return;
		}
		this.harray = inputArr;
		lengthOfIt = inputArr.length;
		quickSort(0, lengthOfIt - 1);
	}
	
	public void quickSort(int low, int high){
		int l = low;
		int h = high;
		//It's a miracle I'm understanding this stuff...
		int pivotNum = harray[low + (high - low)/2];
		
		while (l < h){
			while (harray[l] < pivotNum){
				l++;
			}
			while (harray[h] > pivotNum){
				h--;
			}
			if (l <= h){
				exchangeNumbers(l,h);
				l++;
				h--;
			}
		}
		if (low < h){
			quickSort(low, h);
		}
		
		if (l < high){
			quickSort(l, high);
		}
	}
	
	public void exchangeNumbers(int l, int h){
		int t = harray[l];
		harray[l] = harray[h];
		harray[h] = t;
	}
	
	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		int[] thisOne = {2341,214341,6554,1237887,23412,4431,554234,43};
		for (int i = 0; i < thisOne.length; i++){
			System.out.print(thisOne[i]);
			System.out.print(" ");
		}
		sort.sorter(thisOne);
		System.out.println();
		for (int i: thisOne){
			System.out.print(i);
			System.out.print(" ");
		}
	}

}
