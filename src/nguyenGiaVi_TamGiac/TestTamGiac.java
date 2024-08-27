package nguyenGiaVi_TamGiac;

public class TestTamGiac {
    public static void main(String[] args) {
        TamGiac tg1 = new TamGiac(-1, 2, 3); // Khong hop le
        TamGiac tg2 = new TamGiac(1, 2, 3);  // Khong hop le
        TamGiac tg3 = new TamGiac(3, 4, 5);  // Tam giac thuong
        TamGiac tg4 = new TamGiac(2, 2, 3);  // Tam giac can
        TamGiac tg5 = new TamGiac(3, 3, 3);  // Tam giac deu

        TamGiac[] danhSachTamGiac = {tg1, tg2, tg3, tg4, tg5};

        System.out.println("Thong tin cac hinh tam giac:");
        for (int i = 0; i < danhSachTamGiac.length; i++) {
            System.out.printf("Tam giac thu %d: %s%n", i + 1, danhSachTamGiac[i].toString());
        }

        // Sua so do 1 canh cua tam giac bat ky
        tg3.setMa(6);
        System.out.println("\nSau khi sua canh a cua tam giac thu 3:");
        System.out.println(tg3);
    }
}
