public class BinarySearch {

    public static boolean search(int[] array, int toSearch) {
        if(array == null || array.length == 0) throw new IllegalArgumentException();
        int guess = 0;
        int mid = 0;
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            mid = low + high;
            guess = array[mid];
            if (guess == toSearch) return true;
            else if (guess > toSearch) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
}
