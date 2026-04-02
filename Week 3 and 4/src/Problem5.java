public class Problem5 {

    static int linearSearch(String[] arr, String target) {
        int comps = 0;
        for (int i = 0; i < arr.length; i++) {
            comps++;
            if (arr[i].equals(target)) {
                System.out.println("Comparisons: " + comps);
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(String[] arr, String target) {
        int low = 0, high = arr.length - 1, comps = 0;

        while (low <= high) {
            comps++;
            int mid = (low + high) / 2;

            if (arr[mid].equals(target)) {
                System.out.println("Comparisons: " + comps);
                return mid;
            }
            if (arr[mid].compareTo(target) < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"accA", "accB", "accB", "accC"};

        System.out.println("Linear index: " + linearSearch(arr, "accB"));
        System.out.println("Binary index: " + binarySearch(arr, "accB"));
    }
}