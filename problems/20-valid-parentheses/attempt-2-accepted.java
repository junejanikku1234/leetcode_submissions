class Solution {
    public static boolean isValid(String s) {
            char[] arr = s.toCharArray();
            Stack<Character> charStk = new Stack<>();
            for(int i=0; i<arr.length; i++) {
                char c = arr[i];
                if(c == '(' || c=='{' || c=='[') {
                    charStk.push(c);
                }
                else{
                    if(charStk.isEmpty()) return false;
                    char top = charStk.peek();
                    if((c==')' && top=='(') || (c=='}' && top=='{') ||
                        (c==']' && top=='[')) charStk.pop(); else return false; 
                }
            }
            return charStk.isEmpty();
        }
}