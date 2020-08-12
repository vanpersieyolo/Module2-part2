public class ThuatToanTimKiemNoiSuy {
    public static void main(String[] args) {
        int[] list = {2,5,4,3,1};

        int x = 5;

        sapxep(list,x,5);
    }
    public static int sapxep(int[] list,int x, int a){
      int low = list[0];
      int high = list[list.length-1];
      int mid = 0;
        while (list[low] != list[high] && x > list[low] && x < list[high]){
            mid = low + ((high - low)*(x-list[low])/(list[high]-list[low]));
            if (list[mid] < x){
                low = mid +1;
            }
            else if(x < list[mid]){
                high = mid - 1;
            }else
                return mid;
        }
        if (x == list[mid]){
            return 1;
        }
        else
            return -1;
    }
}
