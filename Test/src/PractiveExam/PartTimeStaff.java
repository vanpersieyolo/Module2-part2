package PractiveExam;

import java.io.Serializable;

public class PartTimeStaff extends Staff implements Serializable {
    private int gioLamViec;
    private  int luong;

    public PartTimeStaff(int idStaff, String name, int age, int phoneNumber, String email,
                         int gioLamVc) {
        super(idStaff, name, age, phoneNumber, email);
        this.gioLamViec = gioLamVc;
    }

    public int getGioLamViec() {
        return gioLamViec;
    }

    public void setGioLamViec(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }

    public int getLuong() {
       return this.luong = luong;
    }

    public void setLuong(int gioLamViec) {
        this.luong = this.gioLamViec*100000;
    }

    @Override
    public String toString() {
        return "[nhân viên parttime]"+super.toString() +"lương thực lĩnh "+ this.getLuong();
    }
}
