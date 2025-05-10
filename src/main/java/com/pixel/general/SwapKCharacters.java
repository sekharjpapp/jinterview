package com.pixel.general;

public class SwapKCharacters {
    public static void main(String[] args) {
        String str = "abcdef";
        int k = 2;
        String result = swapKCharacters(str, k);
        System.out.println(result);  // Output: "bacdfe"
    }
    public static String swapKCharacters(String str, int k) {
        char[] arr = str.toCharArray();

        // Swap characters in groups of k
        for (int i = 0; i < arr.length - 1; i += 2 * k) {
            // Swap each pair within the group of k
            for (int j = 0; j < k / 2; j++) {
                if (i + j < arr.length && i + k - 1 - j < arr.length) {
                    char temp = arr[i + j];
                    arr[i + j] = arr[i + k - 1 - j];
                    arr[i + k - 1 - j] = temp;
                }
            }
        }

        return new String(arr);
    }
}
