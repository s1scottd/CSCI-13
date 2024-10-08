/**
 * MIT License
 *
 * Copyright (c) 2024 Scott Davis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
 
import java.util.Arrays;

public class ArraysClass {
  /*
   * This program demonstrates using the Arrays class to work with arrays.
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {
    // Initialize an array with some elements
    int[] numbers1 = { 10, 20, 30, 40, 50 };
    int[] numbers2 = { 10, 20, 30, 40, 50 };
    int[] numbers3 = { 10, 20, 3, 40, 50 };

    // Print the arrays
    System.out.println(Arrays.toString(numbers1));
    System.out.println();
    System.out.println(Arrays.toString(numbers2));
    System.out.println();
    System.out.println(Arrays.toString(numbers3));
    System.out.println();

    // Search for an element in the array
    int indexOfThirty = Arrays.binarySearch(numbers1, 30); // Output: 2
    System.out.println("Index of 30 in numbers1: " + indexOfThirty);
    System.out.println();

    // Sort the array in ascending order
    System.out.println("numbers3 before sorting:");
    System.out.println(Arrays.toString(numbers3));
    Arrays.sort(numbers3);
    System.out.println("numbers3 after sorting:");
    System.out.println(Arrays.toString(numbers3));
    System.out.println();

    // Compare two arrays
    boolean areEqual = Arrays.equals(numbers1, numbers2); // Output: true
    System.out.println("numbers1 and numbers2 are equal: " + areEqual);
    System.out.println();

    // Fill an array with a specific value
    int fillValue = -1;
    System.out.println("Create new array with a length of 5 and fill it with: " + fillValue);
    int[] numbers4 = new int[5];
    Arrays.fill(numbers4, fillValue);
    System.out.println(Arrays.toString(numbers4));

    // Copy an array
    System.out.println("Copy an array:");
    int[] numbers5 = Arrays.copyOf(numbers1, numbers1.length);
    System.out.println("Copy numbers1 into a new array named numbers5:");
    System.out.println(Arrays.toString(numbers5));

    // Copy a range of an array
    System.out.println("Copy a range of an array:");
    int[] numbers6 = Arrays.copyOfRange(numbers1, 1, 4);
    System.out.println("Copy numbers1 from index 1 to 4 into a new array named numbers6:");
    System.out.println(Arrays.toString(numbers6));
  }
}
