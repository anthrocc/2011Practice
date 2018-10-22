package lists;

public class Main {

    public static void main(String[] args) {
        char[] array = {'b', 'c', 'd', 'a', 'e', 'h', 'g', 'f'};
        for(int i = 0; i < array.length; i++) {
            if(i != array.length-1)
                System.out.print(array[i] + " ");
            else
                System.out.println(array[i]);
        }
        insertionSort(array);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }



    }

    public static void insertionSort(char[] data) {
        int n = data.length;
        for(int k = 1; k < n; k++) {
            char cur = data[k];
            int j = k;
            while (j > 0 && data[j-1] > cur) {
                data[j] = data[j-1];
                j--;
            }
            data[j] = cur;
        }
    }

}
