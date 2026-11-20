import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {42, 17, 35, 8, 36};
        int n = a.length;
        for(int p = 1; p < n; p++) {
            boolean swapped = false;
            for(int i = 0; i < n - p; i++) {
                if(a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("Pass " + p + " - " + Arrays.toString(a));
            if(!swapped) {
                break;
            }
        }
    }
}