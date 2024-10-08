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
 
public class RandomAccess {
  /*
   * This program demonstrates random access of elements in an array.
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {
    // Initialize an array with some elements
    int[] numbers = { 10, 20, 30, 40, 50 };

    // Access and print elements using their index
    System.out.println("Element at index 0: " + numbers[0]); // Output: 10
    System.out.println("Element at index 2: " + numbers[2]); // Output: 30
    System.out.println("Element at index 4: " + numbers[4]); // Output: 50

    // Modify an element at a specific index
    numbers[2] = 35; // Changing the value at index 2 from 30 to 35

    // Access and print the modified element
    System.out.println("Modified element at index 2: " + numbers[2]); // Output: 35
  }
}