package com.leetcode

/**
 * @see [[https://leetcode.com/problems/kids-with-the-greatest-number-of-candies Kids With the Greatest Number of Candies]]
 */

object CanPlaceFlowers extends App {


  println(canPlaceFlowers(Array(1, 0, 0, 0, 1), 1).equals(true))
  println(canPlaceFlowers(Array(1, 0, 0, 0, 1), 2).equals(false))

  def canPlaceFlowers(flowerbed: Array[Int], n: Int): Boolean = {
    var count: Int = 0
    val range = Range(2, flowerbed.length)

    if (flowerbed.length == 1 && flowerbed(0) == 0) {
      count = count + 1
    }
    else if (flowerbed.length == 2 && flowerbed(0) == 0 && flowerbed(1) == 0) {
      count = count + 1
    }
    else if (flowerbed.length == 3 && flowerbed(0) == 0 && flowerbed(1) == 0 && flowerbed(2) == 0) {
      count = count + 2
    } else {
      for (i <- range) {
        if (flowerbed(0) == 0 && flowerbed(1) == 0) {
          flowerbed(0) = 1
          count = count + 1
        }
        else if (flowerbed(i - 2) == 0 && flowerbed(i - 1) == 0 && flowerbed(i) == 0) {
          flowerbed(i - 1) = 1
          count = count + 1
        }
        else if (flowerbed(flowerbed.length - 1) == 0 && flowerbed(flowerbed.length - 2) == 0) {
          flowerbed(flowerbed.length - 1) = 1
          count = count + 1
        }
      }
    }
    count >= n
  }
}
