package com.hide.message.XuLi;

import com.hide.message.DocGhiFile.GhiFile;

import java.io.IOException;
import java.nio.file.Path;

public class GiauTin {

    // tinh nang giau tin
    public static void giauTin(String tinGiau, Path duongDan) throws IOException {
        String tinGiauKhoangTrang = MaHoa.maHoa(tinGiau); // ma hoa tin giau
        GhiFile.ghiFile(duongDan, tinGiauKhoangTrang); // giau tin vao file cover-text

        System.out.println("Log: Giau tin thanh cong!!");
    }
}
