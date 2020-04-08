package DocGhiFile;

import java.io.*;

public class DocFile {

	public DocFile() {
	}
	
	// ham doc file
	public static String DocFile(String duongDan) { // tra ve noi dung file la 1 String
		String noiDungBR= "";
		String noiDungFile= "";
		File file = new File(duongDan);
		// kiem tra file co ton tai khong?
		if (file.exists()== false) { // neu khong tim thay file
			System.out.println("File khong ton tai");
		}
		else { // neu tim thay file => doc file
			BufferedReader br= null;
			try {   
	            br = new BufferedReader(new FileReader(duongDan));
	            while ((noiDungBR = br.readLine()) != null) {
	            	noiDungFile= noiDungBR.toString();
	                //System.out.println(noiDungBR); // hien thi noi dung
	                noiDungBR = br.readLine();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
		}
		return noiDungFile; // tra ve mot String co gia tri la noi dung cua file vua doc
	}
	
}
