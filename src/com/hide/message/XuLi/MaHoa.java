package com.hide.message.XuLi;

public class MaHoa {

    // chuyen doan van ban (String) sang dang nhi phan (String)
    public static String chuyenThanhNhiPhan(String vanBan) {
        byte[] bytes = vanBan.getBytes(); // tao mang byte
        StringBuilder binary = new StringBuilder(); // tao StringBuilder
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            //binary.append(' '); // cach ra moi ki tu duoc chuyen thanh nhi phan
        }
        return binary.toString(); // tra ve chuoi nhi phan
    }


    // chuyen chuoi nhi phan thanh chuoi ky tu space va tab
    public static String chuyenThanhKhoangTrang(String chuoiNhiPhan) {
        // khoi tao cac ky tu
        String Tab = "\t";
        String Space = " ";
        String Zero = "0";
        String One = "1";
        String vanBanMaHoa = "";
        char[] arrayBinary = chuoiNhiPhan.toCharArray(); // chuyen thanh mang ky tu
        for (int i = 0; i < arrayBinary.length; i++) { // quy tac: 0 => space, 1 => tab
            if (String.valueOf(arrayBinary[i]).equals(Zero)) {
                vanBanMaHoa += Space; // 0 => space
            } else {
                vanBanMaHoa += Tab; // 1 => tab
            }
        }
        return vanBanMaHoa; // tra ve chuoi cac khoang trang bang space va tab
    }


    // ma hoa van ban de giau tin
    public static String maHoa(String vanBan) {
        String nhiPhan = chuyenThanhNhiPhan(vanBan);
        String khoangTrang = chuyenThanhKhoangTrang(nhiPhan);
        return khoangTrang;
    }

}
