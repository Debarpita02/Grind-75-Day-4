class Solution {
    public boolean isPalindrome(String s) {

        String stripped = "";

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c) || Character.isLetter(c)) {
                stripped += c;
            }
        }
        
        stripped = stripped.toLowerCase();

        int frontPointer = 0;
        int backPointer = stripped.length() - 1;

        while(frontPointer <= backPointer) {
            if(stripped.charAt(frontPointer) != stripped.charAt(backPointer)) {
                return false;
            }
            frontPointer++;
            backPointer--;
        }
        return true;
    }
}