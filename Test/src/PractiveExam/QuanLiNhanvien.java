package PractiveExam;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiNhanvien {
    public static void main(String[] args) {
        ArrayList<FulltimeStaff> Fstaff = new ArrayList<>() ;
        ArrayList<PartTimeStaff> Pstaff = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Fstaff = IO.readFile("fulltimedata.txt");
        FunctionfulltimeStaff functionfulltimeStaff = new FunctionfulltimeStaff();
        FunctionPartTime functionPartTime = new FunctionPartTime();

        do {
            System.out.println("__Quản lí nhân viên__");
            System.out.println("1. Thêm mới 1 nhân viên");
            System.out.println("2. Tính lương nhân viên full time");
            System.out.println("3. Tính  lương nhân viên part time");
            System.out.println("4. In ra toàn bộ nhân viên fultime có lương thấp hơn trung bình của mọi người");
            System.out.println("5. In ra toàn bộ nhân viên fulltime");
            System.out.println("6. in ra nhân viên parttime");
            System.out.println("7. In ra nhân viên parttime sắp sếp theo lương.");
            System.out.println("0. exit");
            String choice = scanner.nextLine();

            switch (choice){
                case "1":
                    functionfulltimeStaff.showFadd(Fstaff,Pstaff);
                    break;
                case "2":
                    functionfulltimeStaff.tinhLuongFulltime(Fstaff);
                    break;
                case "3":
                    functionPartTime.tinhLuongParttime(Pstaff);
                    break;
                case "4":
                    functionfulltimeStaff.luongThap(Fstaff);
                    break;
                case "5":
                    functionfulltimeStaff.showAll(Fstaff);
                    break;
                case "6":
                    functionPartTime.showAllParttime(Pstaff);
                    break;
                case "7":
                    functionPartTime.sortSalary(Pstaff);

                    break;
                default:
                    System.out.println("nhập lại đi" );
                    break;
                case "0":
                    IO.record(Fstaff,"fulltimedata.txt");
                    return;
            }
        }while (true);
    }
}
