/*
 * Aaron Alvarez
 * February 8st, 2017
 * Hexagon Driver Pattern: Driver that creates hexagon and sets them in a array
 * in attempt to create the puzzle in order to solve it, using recurion. It should intake a file.
 * (File is already imported since the beggining.
 * */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class HexagonPattern {
	private BufferedReader reader;
	private List<Hexagon> puzzle;
	private List<Integer> identifier;
	

	public void createHexaArrayList(String fileName) throws Exception {
		FileReader File = new FileReader(fileName);
		reader = new BufferedReader(File);
		String text = "";
		String line = reader.readLine();
		while (line != null) {
			text += line;
			line = reader.readLine();
		}
		Hexagon h1 = new Hexagon(text.substring(2, 8));
		Hexagon h2 = new Hexagon(text.substring(10, 16));
		Hexagon h3 = new Hexagon(text.substring(18, 24));
		Hexagon h4 = new Hexagon(text.substring(26, 32));
		Hexagon h5 = new Hexagon(text.substring(34, 40));
		Hexagon h6 = new Hexagon(text.substring(42, 48));
		Hexagon h7 = new Hexagon(text.substring(50, 56));
		// adding hexagons to the arraylist at the top
		Hexagon[] tempHexagonObject = { h1, h2, h3, h4, h5, h6, h7 };
		List<Hexagon> tempArray = new ArrayList<Hexagon>();
		List<Integer> tempIdentifier = new ArrayList<Integer>();
		for (int i = 0; i < 7; i++) {
			tempArray.add(tempHexagonObject[i]);
			tempIdentifier.add(i);
		}
		this.identifier = tempIdentifier;
		System.out.println(tempArray);
		System.out.println(
				"  0  1  2  3  4  5    0  1  2  3  4  5    0  1  2  3  4  5    0  1  2  3  4  5    0  1  2  3  4  5    0  1  2  3  4  5    0  1  2  3  4  5     ");
		System.out.println(
				"          Hexa1               Hexa2            Hexa3                Hexa4               Hexa5               Hexa6               Hexa7          ");
		System.out.println("This method rotates to check every possible scenerio checking every hexagon.");
		tempArray =swapingIndexes(1, tempArray);
		System.out.println(tempArray);
		System.out.println(
				"  0  1  2  3  4  5    0  1  2  3  4  5    0  1  2  3  4  5    0  1  2  3  4  5    0  1  2  3  4  5    0  1  2  3  4  5    0  1  2  3  4  5     ");
		System.out.println(
				"          Hexa1               Hexa2            Hexa3                Hexa4               Hexa5               Hexa6               Hexa7          ");
				
		this.puzzle = tempArray;

	}

	public ArrayList<Hexagon> swapingIndexes (int currentIndexIn , List<Hexagon> arrayIn){
		int lengthOfArray = arrayIn.size()-1;
		Hexagon storesLastInd = arrayIn.get(lengthOfArray);
		ArrayList<Hexagon> finalArray = new ArrayList<Hexagon>();
		for(int i = 0; i < currentIndexIn; i++){
			finalArray.add(arrayIn.get(i));
		}
		finalArray.add(storesLastInd);
		for(int i = currentIndexIn; i < lengthOfArray; i++){
			finalArray.add(arrayIn.get(i));
		}
		
		return finalArray;
	}

	public List<Hexagon>  rotateArraylist (List<Hexagon> hexagonTileIn) {
		Hexagon[] tempHexagonObject = { hexagonTileIn.get(6), hexagonTileIn.get(0), hexagonTileIn.get(1),
				hexagonTileIn.get(2), hexagonTileIn.get(3), hexagonTileIn.get(4), hexagonTileIn.get(5) };
		List<Hexagon> rotatedHexagonTile = new ArrayList<Hexagon>();
		for (int i = 0; i < 7; i++) {
			rotatedHexagonTile.add(tempHexagonObject[i]);
		}
		return rotatedHexagonTile;

	}

	public boolean checkFirstTwoTiles(Hexagon firstObj, Hexagon secondObj) {
		if (firstObj.getElement(0).equals(secondObj.getElement(3)))
			return true;
		else
			secondObj.rotateOnce();
		return false;
	}

	public void solve(Hexagon srcIn, Hexagon trgIn, int sideIn) {
		if (puzzle.get(0).getElement(0).equals(puzzle.get(1).getElement(3))) {
		}

	}  

}