import java.util.*;

class Client {
    String name;
    int riskScore;

    Client(String name, int riskScore) {
        this.name = name;
        this.riskScore = riskScore;
    }

    public String toString() {
        return name + ":" + riskScore;
    }
}

public class Problem2 {
    static void bubbleSort(Client[] arr) {
        int n = arr.length, swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].riskScore > arr[j + 1].riskScore) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println("Swaps: " + swaps);
    }

    static void insertionSortDesc(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].riskScore < key.riskScore) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void topClients(Client[] arr, int k) {
        for (int i = 0; i < k && i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Client[] arr = {
                new Client("C", 80),
                new Client("A", 20),
                new Client("B", 50)
        };

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        insertionSortDesc(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Top risks:");
        topClients(arr, 3);
    }
}