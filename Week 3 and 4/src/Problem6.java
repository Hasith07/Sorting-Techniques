public class Problem6 {

    static void linearSearch(int[] arr, int target) {
        for (int x : arr) {
            if (x == target) {
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");
    }

    static void binarySearchFloorCeil(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        Integer floor = null, ceil = null;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                floor = ceil = arr[mid];
                break;
            }

            if (arr[mid] < target) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 100};

        linearSearch(arr, 30);
        binarySearchFloorCeil(arr, 30);
    }
}