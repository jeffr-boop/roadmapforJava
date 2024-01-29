//code to check if a string is palindrome

public class palindrome {
  static boolean isPalindrome(String word) {
    char[] wordArray = word.toCharArray();
    //to get if the word entered is palindrome meaning that the word can be spelled the same backwards and forwards;
    //use two pointer approach one pointing to the start of the string and the other pointing to the end of the String
    //to further optimise the code, we can just run the pointer to the middle of the word one pointer dealing with one half
    //and the other pointer the other half. if theres a common middle point just skip it.

    int l = 0, r = wordArray.length - 1;
    int mid = (int)Math.floor(wordArray.length / 2);
    int count = 0;

    /*for (int i = 0; i < mid;i++) {
      if (wordArray[l] != wordArray[r]) {
        return false;
      }
      System.out.println(wordArray[l]);
      l++;
      r--;
    }*/
    while (count < mid) {
      if (wordArray[l] != wordArray[r]) {
        return false;
      }
      System.out.println(wordArray[l]);
      l++;
      r--;
    }

    return true;
  }

  public static void main(String[] args) {
    String name = "daddy";
    System.out.println(isPalindrome(name));
  }
}
