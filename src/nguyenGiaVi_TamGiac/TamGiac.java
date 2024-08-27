package nguyenGiaVi_TamGiac;

public class TamGiac {
    private double ma;
    private double mb;
    private double mc;

    public TamGiac() {
        this.ma = 0;
        this.mb = 0;
        this.mc = 0;
    }

    public TamGiac(double ma, double mb, double mc) {
        if (KiemTra(ma, mb, mc)) {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        } else {
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        }
    }

    public double getMa() {
        return ma;
    }

    public double getMb() {
        return mb;
    }

    public double getMc() {
        return mc;
    }

    public void setMa(double ma) {
        if (KiemTra(ma, this.mb, this.mc)) {
            this.ma = ma;
        }
    }

    public void setMb(double mb) {
        if (KiemTra(this.ma, mb, this.mc)) {
            this.mb = mb;
        }
    }

    public void setMc(double mc) {
        if (KiemTra(this.ma, this.mb, mc)) {
            this.mc = mc;
        }
    }

    private boolean KiemTra(double ma, double mb, double mc) {
        return ma > 0 && mb > 0 && mc > 0 && (ma + mb > mc) && (ma + mc > mb) && (mb + mc > ma);
    }

    public double getChuVi() {
        return ma + mb + mc;
    }

    public double getDienTich() {
        double p = getChuVi() / 2;
        return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
    }

    public String loaiTamGiac() {
        if (!KiemTra(ma, mb, mc)) {
            return "Khong phai tam giac";
        } else if (ma == mb && mb == mc) {
            return "Deu";
        } else if (ma == mb || mb == mc || ma == mc) {
            return "Can";
        } else {
            return "Thuong";
        }
    }

    @Override
    public String toString() {
        return String.format("Canh a: %.2f, Canh b: %.2f, Canh c: %.2f, Loai tam giac: %s, Chu vi: %.2f, Dien tich: %.2f",
                ma, mb, mc, loaiTamGiac(), getChuVi(), getDienTich());
    }
}


