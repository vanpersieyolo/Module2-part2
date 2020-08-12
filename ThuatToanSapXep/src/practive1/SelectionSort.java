package practive1;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selection(double[] list){
        for (int i = 0; i < list.length ; i++) {
            int currentIndex = i;
            double currentMin = list[i];

            for (int j = i+1; j < list.length ; j++) {
                    if (currentMin > list[j]){
                        currentMin = list[j];
                        currentIndex = j;
                    }
            }
            if (currentIndex != i){
                list[currentIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selection(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
