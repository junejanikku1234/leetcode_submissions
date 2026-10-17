bool isAnagram(char* s, char* t) {
    if (strlen(s) != strlen(t)){
        return false;
    }
    int charFreq[26] = {0};
        for (int i=0; i < strlen(s); i++) {
            charFreq[s[i] - 'a']++;
            charFreq[t[i] - 'a']--;
        }
        for (int k=0; k < 26; k++){
            if (charFreq[k] != 0){
                return false;
            }
        }
        return true; 
}