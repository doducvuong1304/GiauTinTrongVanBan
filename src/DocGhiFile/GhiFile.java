package DocGhiFile;

import java.io.*;

public class GhiFile {

	public GhiFile() {
	}
	
	// ham ghi file
	public static void GhiFile(String duongDan, String noiDung) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			File file = new File(duongDan);
			// check neu file chua co thi tao file moi
			if (!file.exists()) {
				file.createNewFile();
			}
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			bw.write(noiDung);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
}