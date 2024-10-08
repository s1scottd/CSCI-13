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
 
public class HotDogStand {
  private static double price = 5.00;
  private static double cost = 1.25;
  private int id;
  private String location;
  private int countSold = 0;

  public HotDogStand(int id, String location) {
    this.id = id;
    this.location = location;
  }

  public int getId() {
    return this.id;
  }

  public int getCountSold() {
    return this.countSold;
  }

  public void setAddress(String location) {
    this.location = location;
  }

  public void order(int count) {
    this.countSold += count;
  }

  public double netIncome() {
    return this.countSold * (price - cost);
  }

  @Override
  public String toString() {
    return "ID#:" + id +
        "\nAddress: " + location +
        "\nHotdogs sold: " + countSold +
        "\nNet Income: " + netIncome();
  }
}
