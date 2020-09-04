package PractiveExam;
import java.util.*;

public class FunctionPartTime {
    public void addNVPT(ArrayList<PartTimeStaff> partTimeStaffs){
//        int idStaff, String name, int age, int phoneNumber, String email,int gioLamVc
        int countID = 0;
        for (PartTimeStaff fulltimeStaff : partTimeStaffs) {
            if(countID < fulltimeStaff.getIdStaff()){
                countID = fulltimeStaff.getIdStaff();
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Nhân viên parttime: )");
        int idstaff = ++countID;
        System.out.println("nhập vào tên nhân viên: ");
        String name  = scanner.nextLine();
        System.out.println("nhập vào tuổi nhân viên: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số đt nhân viên: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào email nhân viên: ");
        String email = scanner.nextLine();
        PartTimeStaff partTimeStaff = new PartTimeStaff(idstaff,name,age,phone,email,0);
        partTimeStaffs.add(partTimeStaff);
    }
    public void tinhLuongParttime(ArrayList<PartTimeStaff> partTimeStaffs){
        Scanner scanner = new Scanner(System.in);
        for (PartTimeStaff partTimeStaff : partTimeStaffs) {
            System.out.println("nhân viên "+partTimeStaff.getName()+" là : " );
            System.out.println("nhập vào giờ làm việc");
            int giolamviec = Integer.parseInt(scanner.nextLine());
            partTimeStaff.setGioLamViec(giolamviec);
            partTimeStaff.setLuong(giolamviec);
        }
        for (PartTimeStaff partTimeStaff : partTimeStaffs) {
            System.out.println(partTimeStaff.getName()+ " nhận được lương " + partTimeStaff.getLuong());
        }
    }
    public void showAllParttime(ArrayList<PartTimeStaff> arrayList){
        for (PartTimeStaff a : arrayList) {
            System.out.println(a);
        }
    }

    public void sortSalary(ArrayList<PartTimeStaff> partTimeStaffs){
        Collections.sort(partTimeStaffs, new Comparator<PartTimeStaff>() {
            @Override
            public int compare(PartTimeStaff o1, PartTimeStaff o2) {
                if (o1.getLuong() > o2.getLuong()){
                    return 1;
                }else if (o1.getLuong() == o2.getLuong()){
                    return 0;
                }else {
                    return -1;
                }
            }
        });
    }
}
