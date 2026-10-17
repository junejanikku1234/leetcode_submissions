/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findAnagrams(char* s, char* p, int* returnSize) {
    int n = strlen(s);
    int k = strlen(p);

    int* result = malloc(sizeof(int) * n);
    *returnSize = 0;

    if (n < k) return result;

    int pCount[26] = {0};
    int window[26] = {0};

    // Build frequency of p
    for (int i = 0; i < k; i++) {
        pCount[p[i] - 'a']++;
    }

    int left = 0, right = 0;

    while (right < n) {
        // add right character
        window[s[right] - 'a']++;
        right++;

        // if window too large, remove left character
        if (right - left > k) {
            window[s[left] - 'a']--;
            left++;
        }

        // check anagram when window size == k
        if (right - left == k) {
            bool match = true;
            for (int i = 0; i < 26; i++) {
                if (window[i] != pCount[i]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                result[(*returnSize)++] = left;
            }
        }
    }

    return result;
}
