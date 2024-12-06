package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.StringManipulator;

public class StringManipulatorTest {
   StringManipulator stringManipulator = new StringManipulator();

   @Test
   public void testReverse() {
      assertEquals("duy", stringManipulator.reverse("yud"));
   }

   @Test
   public void testIsPalindrome() {
      assertEquals(true, stringManipulator.isPalindrome("12321"));
   }

   @Test
   public void testIsContained() {
      assertEquals(true, stringManipulator.isContained("12321", "12"));
   }

   @Test
   public void testNumberRemoved() {
      assertEquals("example", stringManipulator.numberRemoved("e1xam213ple"));
   }

   @Test
   public void testUpperString() {
      assertEquals("EXAMPLE", stringManipulator.upperString("eXaMpLe"));
   }

   @Test
   public void testLowerString() {
      assertEquals("example", stringManipulator.lowerString("eXaMpLe"));
   }

   @Test
   public void testCapitalString() {
      assertEquals("Example", stringManipulator.capitalString("example"));
   }

   @Test
   public void testCountVowels() {
      assertEquals(3, stringManipulator.countVowels("example"));
   }

   @Test
   public void testCountWords() {
      assertEquals(4, stringManipulator.countWords("Hello, how are you?"));
   }

   @Test
   public void testFindSubstringIndex() {
      assertEquals(-1, stringManipulator.findSubstringIndex("Java programming", "Programming"));
   }
   // Input: input = "Java programming", substring = "programming" => Output: 5
   // Input: input = "Java programming", substring = "Programming" => Output: -1

   @Test(timeout = 1000)
   public void testReverseWords() {
      assertEquals("You Are How World Hello", stringManipulator.reverseWords("Hello World How Are You"));
   }

   @Test(timeout = 10)
   public void testReverseWithTimeout() {
      assertEquals("You Are How World Hello", stringManipulator.reverseWords("Hello World How Are You"));
   }

   @Test(timeout = 1000)
   public void testIsPalindromeWithTimeout() {
      assertEquals(true, stringManipulator.isPalindrome("12321"));
   }

   @Test(timeout = 1000)
   public void testIsContainedWithTimeout() {
      assertEquals(true, stringManipulator.isContained("12321", "12"));
   }

   @Test(timeout = 1000)
   public void testNumberRemovedWithTimeout() {
      assertEquals("example", stringManipulator.numberRemoved("e1xam213ple"));
   }

}
