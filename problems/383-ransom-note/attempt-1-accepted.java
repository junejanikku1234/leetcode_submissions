class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] magArr = magazine.toCharArray();
        char[] noteArr = ransomNote.toCharArray();
        ArrayList<Character> arrList = new ArrayList<>();
        for(char c: magArr){
            arrList.add(c);
        }
        for(char x: noteArr){
            if(arrList.contains(x)){
                arrList.remove(Character.valueOf(x));
            }
            else{
                return false;
            }
        }
        return true;    
    }
}