package main;

public class StringManipulator {

    // input: ExAmPLE => output: ELPmAxE
    public String reverse(String input) {
        String result = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }

    // input: example => output: false
    // input: ELpmpLE => output: true
    public boolean isPalindrome(String input) {
        String result = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        if(result.equals(input)) return true;
        return false;
    }

    // input: ExAmPLE, part: Ex => output: true
    // input: ExAmPLE, part: ex => output: false
    public boolean isContained(String input, String part) {
        if(input.contains(part)) return true;
        return false;
    }

    // input: ExAm1PLE2 => output: ExAmPLE
    public String numberRemoved(String input) {
        String result = "";
        for(int i = 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                result += input.charAt(i);
            }
        }
        return result;
    }

    // input: ExAmPLE => output: EXAMPLE
    public String upperString(String input) {
        // Your code here
        return input.toUpperCase();
    }

    // input: ExAmPLE => output: example
    public String lowerString(String input) {
        // Your code here
        return input.toLowerCase();
    }

    // input: example string => output: Example String
    public String capitalString(String input) {
        // Your code here
        String result = "";
        result += Character.toUpperCase(input.charAt(0));
        for(int i = 1; i < input.length(); i++) {
            result += input.charAt(i);
        }
        return result;
    }

    // input: Example => output: 3
    public int countVowels(String input) {
        int count = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'u' || input.charAt(i) == 'e' || input.charAt(i) == 'o' || input.charAt(i) == 'a' || input.charAt(i) == 'i') {
                count++;
            } 
        }
        return count;
    }

    // input: Hello, how are you? => output: 4
    public int countWords(String sentence) {
        int count = 0;
        for(int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) ==' ' && i!= sentence.length() - 1) {
                count++;
            }
        }
        return count+1;
    }

    // Input: input = "Java programming", substring = "programming" => Output: 5
    // Input: input = "Java programming", substring = "Programming" => Output: -1
    public int findSubstringIndex(String input, String substring) {
        for(int i = 0; i < input.length(); i++) {
            if(input.substring(i).equals(substring)) {
                return i;
            }
        }
        return -1;
    }

    // Input: "Hello World How Are You" => Output: "You Are How World Hello"
    public String reverseWords(String sentence) {
        var k = sentence.split(" ");
        String result ="";
        for(int i = k.length - 1; i >= 0; i--) {
            if(i == 0) {
                result += k[i];
                continue;
            }
            result += k[i] +" ";
        }
        return result;
    }

    
}
