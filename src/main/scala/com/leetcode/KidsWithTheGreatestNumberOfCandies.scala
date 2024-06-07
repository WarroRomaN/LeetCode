package com.leetcode

/**
 * @see [[https://leetcode.com/problems/kids-with-the-greatest-number-of-candies Kids With the Greatest Number of Candies]]
 */

object KidsWithTheGreatestNumberOfCandies extends App {

  println(kidsWithCandies(Array(2, 3, 5, 1, 3), 5))
  println(kidsWithCandies(Array(4, 2, 1, 1, 2), 1))
  println(kidsWithCandies(Array(12, 1, 12), 10))

  private def kidsWithCandies(candies: Array[Int], extraCandies: Int): List[Boolean] = {
    val max = candies.max - extraCandies
    candies.map(candy => candy >= max).toList
  }
}
