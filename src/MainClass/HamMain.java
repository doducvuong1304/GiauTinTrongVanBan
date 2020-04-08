package MainClass;
import java.util.Scanner;

import DocGhiFile.*;
	
public class HamMain {
	public static Scanner scanner = new Scanner(System.in);
	public HamMain() {
	}
	
	
	
	// chon chuc nang (giau tin/ khoi phuc tin)
	public static String LuaChon() {
		System.out.println("=== TOOL TEXT - STEGANOGRAPHY ===");
		System.out.println("Chon 0 de giau tin - Chon 1 de khoi phuc:");
		String luaChon = scanner.nextLine();
		return luaChon;
	}
	
	// ham main cua chuong trinh
	public static void main(String[] args) {
		// lua chon giau tin hoac khoi phuc
		String luaChon= LuaChon();
		int soChon = Integer.parseInt(luaChon);
		if (soChon== 0) {
			System.out.println("thuc hien giau tin");
		}
		else if (soChon== 1){
			System.out.println("thuc hien khoi phuc");
		}
		else {
			System.out.println("nhap sai roi! 0 hoac 1 thoi!");
		}
		
		// doc file
		System.out.println("Nhap duong dan + File: ");
		String duongDanDocFile= scanner.next(); // duong dan file: "D:/hello.txt"
		System.out.println("Noi dung file la: ");
		String noiDungDocFile= DocFile.DocFile(duongDanDocFile);
		System.out.println(noiDungDocFile);
		
		// ghi file
		System.out.println("Nhap duong dan + File: ");
		String duongDanGhiFile= scanner.nextLine();
		System.out.println("Nhap noi dung ghi vao file: ");
		String noiDungGhiFile= scanner.nextLine();
		System.out.println(noiDungGhiFile);
		GhiFile.GhiFile(duongDanGhiFile, noiDungGhiFile);
		System.out.println("Ghi noi dung vao file thanh cong!");
	}

}
