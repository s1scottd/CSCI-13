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
 
package abstract_classes;

public class AbstractClassMultipleMethodsTest {
  public static void main(String[] args) {
    Shape circle = new Circle(5.0);
    System.out.println("Circle Area: " + circle.calculateArea()); // Output: Circle Area: 78.5398...
    System.out.println("Circle Perimeter: " + circle.calculatePerimeter()); // Output: Circle Perimeter: 31.4159...

    Shape rectangle = new Rectangle(4.0, 7.0);
    System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Output: Rectangle Area: 28.0
    System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter()); // Output: Rectangle Perimeter: 22.0
  }
}