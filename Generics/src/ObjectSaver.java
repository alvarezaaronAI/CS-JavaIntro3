
/*Aaron Alvarez
March 14 2017
Object Saver which reads and writes a file*/
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
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

	public ArrayList<T> readAllObjects() throws ClassNotFoundException, IOException {
		FileInputStream fis = new FileInputStream(this.file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<T> storedInput = new ArrayList<T>();
		try {
			while (true) {
				T inputData = (T) ois.readObject();
				storedInput.add((T) inputData);
			}
		} catch (EOFException e) {
			return storedInput;
		}
		
	}

	public void writeOneObject(T anyObject, Boolean check) throws IOException, NotSerializableException {
		FileOutputStream fos = new FileOutputStream(this.file, check);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(anyObject);
			oos.close();
			fos.close();
		
	}

	public void writeAllObjects(ArrayList<T> arrayIn, Boolean check) throws IOException, NotSerializableException{
		FileOutputStream fos = new FileOutputStream(this.file, check);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		try {

			for (T i : arrayIn) {
				oos.writeObject(i);
			}
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}