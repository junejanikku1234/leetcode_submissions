bool canConstruct(char* ransomNote, char* magazine) {
    int freqCount[26] = {0};

    for (int i = 0; magazine[i] != '\0'; i++) {
        freqCount[magazine[i] - 'a']++;
    }

    for (int j = 0; ransomNote[j] != '\0'; j++) {
        if (freqCount[ransomNote[j] - 'a'] == 0) {
            return false;
        }
        freqCount[ransomNote[j] - 'a']--;
    }

    return true;
}