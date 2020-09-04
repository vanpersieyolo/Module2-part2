package PractiveExam;

import java.util.ArrayList;
import java.util.Scanner;

public class FunctionfulltimeStaff {
    public void addFulltime(ArrayList<FulltimeStaff> fulltimeStaffs){
        int countID = 0;
        for (FulltimeStaff fulltimeStaff : fulltimeStaffs) {
            if(countID < fulltimeStaff.getIdStaff()){
                countID = fulltimeStaff.getIdStaff();
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Nhân viên full time: )");
        int idstaff = ++countID;
        System.out.println("nhập vào tên nhân viên: ");
        String name  = scanner.nextLine();
        System.out.println("nhập vào tuổi nhân viên: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số đt nhân viên: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào email nhân viên: ");
        String email = scanner.nextLine();
        System.out.println("nhập vào lương cứng");
        int luongCung = scanner.nextInt();
        FulltimeStaff fulltimeStaff = new FulltimeStaff(idstaff,name,age,phone,email,0,0,luongCung) ;
        fulltimeStaffs.add(fulltimeStaff);
    }
    public void editFullTimeStaff(ArrayList<FulltimeStaff> fulltimeStaffs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào ID nhân viên cần sửa : ");
        int idStaff = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên cần sửa: ");
        String name = scanner.nextLine();
        System.out.println("nhập vào tuổi cần sửa: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số đt nhân viên: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào email nhân viên: ");
        String email = scanner.nextLine();
        for (FulltimeStaff fulltimeStaff : fulltimeStaffs) {
            if (idStaff == fulltimeStaff.getIdStaff()){
                fulltimeStaff.setName(name);
                fulltimeStaff.setAge(age);
                fulltimeStaff.setPhoneNumber(phone);
                fulltimeStaff.setEmail(email);
            }
        }
    }
    public void removeFulltimeStaff(ArrayList<FulltimeStaff> fulltimeStaffs){
        Scanner scanner = new Scanner(System.in);
        int idremove = Integer.parseInt(scanner.nextLine());
        for (FulltimeStaff fulltimeStaff : fulltimeStaffs ) {
            if (idremove == fulltimeStaff.getIdStaff()){
                fulltimeStaffs.remove(fulltimeStaff);
                return;
            }
        }
    }
    public void tinhLuongFulltime(ArrayList<FulltimeStaff> fulltimeStaffs){
        Scanner scanner = new Scanner(System.in);
        for (FulltimeStaff fulltimeStaff : fulltimeStaffs) {
            System.out.println("nhân viên "+fulltimeStaff.getName()+" là : " );
            System.out.println("nhập vào tiền thưởng :  ");
            int tienThuong = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập vào tiền phạt:  ");
            int tienPhat = Integer.parseInt(scanner.nextLine());
            fulltimeStaff.setTienThuong(tienThuong);
            fulltimeStaff.setTienPhat(tienPhat);
            fulltimeStaff.setLuongThucLinh(tienThuong,tienPhat);
        }
        for (FulltimeStaff fulltimeStaff : fulltimeStaffs) {
            System.out.println(fulltimeStaff.getName() + " nhận được lương " + fulltimeStaff.getLuongThucLinh());
        }
    }
    public void luongThap(ArrayList<FulltimeStaff> a ){
        int coutStaf= 0;
        int totalSaraly = 0;
        for (FulltimeStaff f : a ) {
            totalSaraly += f.getLuongThucLinh();
            coutStaf++;
        }
        long luongtrungBinh = totalSaraly/coutStaf;
        System.out.println("Mức lương trung bình = "+luongtrungBinh);
        System.out.println("nhân viên có mức lương dưới mức lương trung bính là : ");
        System.out.println();
        for (FulltimeStaff f : a ) {
            if (f.getLuongThucLinh() < luongtrungBinh){
                System.out.println(f);
            }
        }
    }
    public void showAll(ArrayList<FulltimeStaff> a ){
        for (FulltimeStaff fulltimeStaff : a) {
            System.out.println(fulltimeStaff);
        }
    }
    public void showFadd(ArrayList<FulltimeStaff> a, ArrayList<PartTimeStaff>b){
        FunctionfulltimeStaff functionfulltimeStaff = new FunctionfulltimeStaff();
        FunctionPartTime functionPartTime = new FunctionPartTime();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. nhân viên full time");
            System.out.println("2. nhân viên part time");
            System.out.println("0. trở về");
            String choiceTypeE = scanner.nextLine();
            switch (choiceTypeE){
                case "1":
                    functionfulltimeStaff.addFulltime(a);
                    break;
                case "2":
                    functionPartTime.addNVPT(b);
                    break;
                default:
                    System.out.println("nhập lại");
                    break;
                case "0":
                    return;
            }
        }while (true);
    }

}
