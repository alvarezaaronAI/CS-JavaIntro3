
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectSaver<T> {

	private File file;

	public ObjectSaver(File fileIn) {
		this.file = fileIn;
	}
	public T readOneObject(int specificObj, boolean check) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		if( check = false){
		FileInputStream fileInput = new FileInputStream(this.file);
		ObjectInputStream input = new ObjectInputStream(fileInput);
		ArrayList<T> storedInput = new ArrayList<T>();
		try{
			
		while(true){
			
			Object inputData =  input.readObject();
			System.out.println(inputData);
			storedInput.add((T) inputData);
		}
		}catch(EOFException ex){
			
		}
		}
		else{
			//
		}
		return null;

	}
	public ArrayList<T> readAllObjects() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fileInput = new FileInputStream(this.file);
		ObjectInputStream input = new ObjectInputStream(fileInput);
		ArrayList<T> storedInput = new ArrayList<T>();
		try{
			
		while(true){
			
			Object inputData =  input.readObject();
			System.out.println(inputData);
			storedInput.add((T) inputData);
		}
		}catch(EOFException ex){
			
		}
		System.out.println(storedInput);
		
		return storedInput;
	}

	public void writeAllObjects(ArrayList<T> arrayIn, Boolean check) throws FileNotFoundException, IOException {
		if (check = false) {
			//overwritting everything
			FileOutputStream fileOut = new FileOutputStream(this.file);
			ObjectOutputStream outPut = new ObjectOutputStream(fileOut);
			for (T i : arrayIn) {
				outPut.writeObject(i);
			}
			outPut.close();
			fileOut.close();
			
		}
		else {
			// its true... read the list and add all the oj
		}
		
	}

}