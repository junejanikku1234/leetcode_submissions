#include <string.h>

int minDeletion(char* s, int k) {
    int freq[26] = {0};
    
    // Count frequencies
    for (int i = 0; s[i] != '\0'; i++) {
        freq[s[i] - 'a']++;
    }

    // Count distinct characters
    int distinct = 0;
    for (int i = 0; i < 26; i++) {
        if (freq[i] > 0) distinct++;
    }

    // If already <= k distinct, no deletion needed
    if (distinct <= k) return 0;

    // Collect frequencies into an array
    int arr[26];
    int n = 0;
    for (int i = 0; i < 26; i++) {
        if (freq[i] > 0) {
            arr[n++] = freq[i];
        }
    }

    // Sort frequencies in descending order (simple bubble sort, n ≤ 16)
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[j] > arr[i]) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }

    // Sum frequencies to delete (everything except top k)
    int deletions = 0;
    for (int i = k; i < n; i++) {
        deletions += arr[i];
    }

    return deletions;
}
