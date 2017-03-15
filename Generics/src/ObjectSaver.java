
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

	public T readOneObject(int specificObj) {
		T read = null;
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			for (int i = 0; i < specificObj; i++) {
				read = (T) ois.readObject();
			}
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return read;

	}

	public ArrayList<T> readAllObjects() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fileInput = new FileInputStream(this.file);
		ObjectInputStream input = new ObjectInputStream(fileInput);
		ArrayList<T> storedInput = new ArrayList<T>();
		try {
			while (true) {
				Object inputData = input.readObject();
				System.out.println(inputData);
				storedInput.add((T) inputData);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return storedInput;
	}

	public void writeOneObject(T anyObject, Boolean check) throws IOException {
		FileOutputStream fileOut = new FileOutputStream(this.file, check);
		ObjectOutputStream outPut = new ObjectOutputStream(fileOut);
		try {
			outPut.writeObject(anyObject);
			outPut.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeAllObjects(ArrayList<T> arrayIn, Boolean check) throws IOException {
		FileOutputStream fileOut = new FileOutputStream(this.file, check);
		ObjectOutputStream outPut = new ObjectOutputStream(fileOut);
		try {

			for (T i : arrayIn) {
				outPut.writeObject(arrayIn);
			}
			outPut.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}