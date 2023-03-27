import java.util.Scanner;
import java.util.Arrays;
public class izradaZadace {

    public static void main(String[] args) {

        // 1.Task
        System.out.println("Task1");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + ". number: ");
            arr[i] = scanner.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " is ");
            if (arr[i] % 2 == 0) {
                System.out.print("even");
            } else {
                System.out.print("odd");
            }
            System.out.print(" and ");
            if (arr[i] > 10) {
                System.out.println("greater than 10.");
            } else if (arr[i] < 10){
                System.out.println("less than 10.");
            } else {
                System.out.println("equal to 10");
            }
        }

        // 2. Task
        System.out.println("");
        System.out.println("Task2");
        System.out.println("");

        int[] arrTwo = {1, 2, 6, 21, 65, 23, 78, 345, 1298, 7689};
        int m = arrTwo.length;

        String[] position = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth", "Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth"};

        for (int l = 0; l < m; l++) {
            System.out.println(position[l] + " number in array: " + arrTwo[l]);
        }

        // 3.Task
        System.out.println("");
        System.out.println("Task3");
        System.out.println("");

        System.out.println("Reverse array is: ");

        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reversedArray = new int[myIntArray.length];

        for (int j = myIntArray.length - 1; j >= 0; j--) {
            reversedArray[j] = myIntArray[j];
            System.out.println(reversedArray[j]);
    }

            // 4.Task
        System.out.println("");
        System.out.println("Task4");
        System.out.println("");

      String word = "kajak";

        char[] charArray = word.toCharArray();

        boolean isPalindrome = true;
        for (int x = 0, y = charArray.length - 1; x < y; x++, y--) {
            if (charArray[x] != charArray[y]) {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

            // 5. Task
        System.out.println("");
        System.out.println("Task5");
        System.out.println("");

        {
                Scanner number = new Scanner(System.in);
                System.out.print("Please enter lower number in range: ");
                int lower = number.nextInt();
                System.out.println("Please enter larger number in range: ");
                int larger = number.nextInt();

                System.out.print("Even numbers for range: " + lower + " to " + larger + " are: ");

                for (int z = lower + 1; z < larger; z++) {
                    if (z % 2 == 0) {
                        System.out.print(z + ", ");
                    }
                }
            System.out.println("");

            // 6.Task
            System.out.println("");
            System.out.println("Task6");
            System.out.println("");

        int[] firstArray = {2, 8, 3};
        int[] secondArray = {4, 9, 7};
        int[] thirdArray = {0, 1};

        int[] mergedArray = new int[firstArray.length + secondArray.length + thirdArray.length];

        int index = 0;
        for (int p = 0; p < firstArray.length; p++) {
            mergedArray[index] = firstArray[p];
            index++;
        }
        for (int p = 0; p < secondArray.length; p++) {
            mergedArray[index] = secondArray[p];
            index++;
        }
        for (int p = 0; p < thirdArray.length; p++) {
            mergedArray[index] = thirdArray[p];
            index++;
        }

        System.out.println("Merged array: " + Arrays.toString(mergedArray) );


            // 7. Task
            System.out.println("");
            System.out.println("Task7");
            System.out.println("");

        int[] arr1 = {1, 3, 5, 6};
        int[] arr2 = {1, 1, 1, 1, 1, 1, 1};

        int sumArr;
        if (arr1.length > arr2.length) {
            sumArr = arr1.length;
        } else {
            sumArr = arr2.length;
        }

        int[] result = new int[sumArr];

        for (int c = 0; c < sumArr; c++) {
            int a = 0;
            int b = 0;

            if (c < arr1.length) {
                a = arr1[c];
            }

            if (c < arr2.length) {
                b = arr2[c];
            }

            result[c] = a + b;
        }

        System.out.print("Result: [");
        for (int c = 0; c < sumArr; c++) {
            System.out.print(result[c]);
            if (c != sumArr-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
            System.out.println("");

            // 8. Task
            System.out.println("");
            System.out.println("Task8");
            System.out.println("");

      String[] words = {"Hii", "gypsy", "JavA", "MYTH", "skY"};
        String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        for (int d = 0; d < words.length; d++) {
            boolean withVowel = false;
            for (int e = 0; e < vowels.length; e++) {
                if (words[d].contains(vowels[e])) {
                    withVowel = true;
                    break;
                }
            }
            if (!withVowel) {
                System.out.print(words[d] + " ");
            }
        }
            System.out.println("");

            // 9. Task
            System.out.println("");
            System.out.println("Task9");
            System.out.println("");

        int Array1[] = {1,2,3};
        int Array2 [] = {1,2,3};

        int sum = 0;

        for (int g = 0; g<=Array1.length-1; g++) {

            for (int h=0; h<=Array2.length-1;h++) {

                sum = sum + Array1[g] + Array2[h];
            }
        }

        System.out.print("Total is " + sum);


        }
    } }




