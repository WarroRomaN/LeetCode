package com.leetcode

/**
 * @see [[https://leetcode.com/problems/replace-words Replace Words]]
 */

object ReplaceWords extends App {

  println(replaceWords(List("cat", "cat", "bat", "rat"), "the cattle was rattled by the battery"))
  println(replaceWords(List("a", "b", "c"), "aadsfasf absbs bbab cadsfafs"))
  println(replaceWords(List("catt", "cat", "bat", "rat"), "the cattle was rattled by the battery"))

  private def replaceWords(dictionary: List[String], sentence: String): String =
    sentence.split(' ').map(word => replaceWords(word, dictionary.sorted)).mkString(" ")

  private def replaceWords(word: String, dictionary: List[String]) = {
    val prefix = dictionary.find(prefix => word.startsWith(prefix))
    if (prefix.isEmpty) word else prefix.get
  }
}