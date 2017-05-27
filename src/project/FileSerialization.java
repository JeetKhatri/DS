package project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileSerialization {

	public static void main(String[] args) {

		try {
			MyBean mb = new MyBean("first value", "second value");

			// write object
/*			FileOutputStream fos = new FileOutputStream("mybean.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(mb);
			oos.close();
*/
			// read object
/*			FileInputStream fis = new FileInputStream("mybean.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			MyBean result = (MyBean) ois.readObject();
			ois.close();
*/
	//		System.out.println("One:" + result.getOne() + ", Two:" + result.getTwo());

			FileSerialization fs = new FileSerialization();
			fs.storeObject(mb);
			fs.displayObjects();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void storeObject(MyBean mb){
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("MyEmpFile.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(mb);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
    public void displayObjects(){
         
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("MyEmpFile.txt");
            ois = new ObjectInputStream(fis);
            MyBean result = (MyBean) ois.readObject();
            ois.close();
            System.out.println("One:" + result.getOne() + ", Two:" + result.getTwo());
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}