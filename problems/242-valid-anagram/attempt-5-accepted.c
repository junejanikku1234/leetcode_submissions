bool isAnagram(char* s, char* t) {
    int lenS = strlen(s);
    int lenT = strlen(t);

    if (lenS != lenT) {
        return false;
    }

    int charFreq[26] = {0};

    for (int i = 0; i < lenS; i++) {
        charFreq[s[i] - 'a']++;
        charFreq[t[i] - 'a']--;
    }

    for (int k = 0; k < 26; k++) {
        if (charFreq[k] != 0) {
            return false;
        }
    }

    return true;
}
