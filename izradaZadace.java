import java.util.Scanner;
import java.util.Arrays;
public class izradaZadace {

    public static void main(String[] args) {

        // 1.Task

        /* Scanner scanner = new Scanner(System.in);

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
        } */

        // 2. Task

        /*int[] arrTwo = {12, 345, 6789, 4321, 98765, 234, 5678, 345, 98, 76};
        int n = arrTwo.length;

        String[] position = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth", "Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth"};

        for (int i = 0; i < n; i++) {
            System.out.println(position[i] + " number in array: " + arrTwo[i]);
        } */

        // 3.Task

        System.out.println("Reverse array is: ");

        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reversedArray = new int[myIntArray.length];

        for (int i = myIntArray.length - 1; i >= 0; i--) {
            reversedArray[i] = myIntArray[i];
            System.out.println(reversedArray[i]);


            // 4.Task

      /*  String word = "kajak";

        char[] charArray = word.toCharArray();

        boolean isPalindrome = true;
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            if (charArray[i] != charArray[j]) {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        } */

            // 5. Task

       /* {
                Scanner number = new Scanner(System.in);
                System.out.print("Please enter lower number in range: ");
                int lower = number.nextInt();
                System.out.println("Please enter larger number in range: ");
                int larger = number.nextInt();

                System.out.print("Even numbers for range: " + lower + " to " + larger + " are: ");

                for (int i = lower + 1; i < larger; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + ", ");
                    }
                }*/

            // 6.Task

        /* int[] firstArray = {2, 8, 3};
        int[] secondArray = {4, 9, 7};
        int[] thirdArray = {0, 1};

        int[] mergedArray = new int[firstArray.length + secondArray.length + thirdArray.length];

        int index = 0;
        for (int i = 0; i < firstArray.length; i++) {
            mergedArray[index] = firstArray[i];
            index++;
        }
        for (int i = 0; i < secondArray.length; i++) {
            mergedArray[index] = secondArray[i];
            index++;
        }
        for (int i = 0; i < thirdArray.length; i++) {
            mergedArray[index] = thirdArray[i];
            index++;
        }

        System.out.println("Merged array: " + Arrays.toString(mergedArray) );

         */

            // 7. Task

        /*
        int[] arr1 = {1, 3, 5, 6};
        int[] arr2 = {1, 1, 1, 1, 1, 1, 1};

        int sumArr;
        if (arr1.length > arr2.length) {
            sumArr = arr1.length;
        } else {
            sumArr = arr2.length;
        }

        int[] result = new int[sumArr];

        for (int i = 0; i < sumArr; i++) {
            int a = 0;
            int b = 0;

            if (i < arr1.length) {
                a = arr1[i];
            }

            if (i < arr2.length) {
                b = arr2[i];
            }

            result[i] = a + b;
        }

        System.out.print("Result: [");
        for (int i = 0; i < sumArr; i++) {
            System.out.print(result[i]);
            if (i != sumArr-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]"); */

            // 8. Task

       /* String[] words = {"Hii", "gypsy", "JavA", "MYTH", "skY"};
        String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        for (int i = 0; i < words.length; i++) {
            boolean withVowel = false;
            for (int j = 0; j < vowels.length; j++) {
                if (words[i].contains(vowels[j])) {
                    withVowel = true;
                    break;
                }
            }
            if (!withVowel) {
                System.out.print(words[i] + " ");
            }
        }*/

            // 9. Task

        /* int Array1[] = {1,2,3};
        int Array2 [] = {1,2,3};

        int sum = 0;

        for (int i = 0; i<=Array1.length-1; i++) {

            for (int j=0; j<=Array2.length-1;j++) {

                sum = sum + Array1[i] + Array2[j];
            }
        }

        System.out.print("Total is " + sum); */


        }
    }}




