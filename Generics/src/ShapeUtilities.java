/*Aaron Alvarez
Feb 15 2017
Shape Utilities Sorting out the ArrayList of Generic Objects Shapes*/

import java.util.ArrayList;

public class ShapeUtilities<T extends Shape> {

	public static <T extends Shape> ArrayList<T> recursiveSort(ArrayList<T> arrayListIn) {
		ArrayList<T> leftList = new ArrayList<>();
		ArrayList<T> rightList = new ArrayList<>();
		double midElemObjVol = 0;
		T midElemObj = null;
		if (arrayListIn.size() <= 1) {
			return arrayListIn;
		}

		else {
			int middleInd = (arrayListIn.size() - 1) - (arrayListIn.size() / 2);
			midElemObjVol = arrayListIn.get(middleInd).getVolume();
			midElemObj = arrayListIn.get(middleInd);
			arrayListIn.remove(middleInd);
			for (T i : arrayListIn) {
				if (i.getVolume() < midElemObjVol) {
					rightList.add(i);
				} else {
					leftList.add(i);
				}
			}
		}
		leftList = recursiveSort(leftList);
		rightList = recursiveSort(rightList);
		ArrayList<T> tempArray = new ArrayList<T>();
		// NOTE: When adding arrayList you add them to the front of the arrayList.
		// adding mid with leftList to tempArray
		tempArray.add(midElemObj);
		tempArray.addAll(leftList);
		// adding tempArray to the front of rightList
		rightList.addAll(tempArray);
		// return a rightlist with left list added and mid added as well.
		return rightList;
	}

	public static <T extends Shape> double min(ArrayList<T> arrayListIn) {
		arrayListIn = recursiveSort(arrayListIn);
		return arrayListIn.get(0).getVolume();
	}
	public static <T extends Shape> double max(ArrayList<T> arrayListIn) {
		arrayListIn = recursiveSort(arrayListIn);
		return arrayListIn.get(arrayListIn.size()-1).getVolume();
	}

}