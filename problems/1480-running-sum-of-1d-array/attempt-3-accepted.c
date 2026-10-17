/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* nums, int numsSize, int* returnSize) {
    * returnSize = numsSize;

    int * sArr = (int *) malloc(numsSize * sizeof(int));
    int sum = *(nums);
    *sArr = *(nums);

    for(int i=1; i<numsSize; i++){
        *(sArr+i) = (*(nums+i) + sum);
        sum += *(nums+i);
    }
    return sArr;
}