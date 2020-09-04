package PractiveExam;

import java.io.Serializable;

public class FulltimeStaff extends Staff implements Serializable {
    private int tienThuong;
    private int tienPhat;
    private int luongCung;
    private int luongThucLinh;

    public FulltimeStaff(int idStaff, String name, int age, int phoneNumber, String email,
                         int tienThuong,int tienPhat,int luongCung) {
        super(idStaff, name, age, phoneNumber, email);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;

    }

    public int getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(int tienThuong) {
        this.tienThuong = tienThuong;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public int getLuongThucLinh() {
        return luongThucLinh;
    }

    public void setLuongThucLinh(int tienThuong, int tienPhat) {
       this.luongThucLinh = this.luongCung + (this.tienThuong - this.tienPhat);
    }

    public String toString() {
        return "[Nhân viên full time ]: "+ super.toString()+" Mức lương: "+ this.getLuongThucLinh();

    }
}
