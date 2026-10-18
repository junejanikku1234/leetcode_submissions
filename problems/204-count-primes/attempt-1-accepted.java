class Solution {
    public int countPrimes(int n) {
        int[] primes = new int[n+1];
        Arrays.fill(primes,1);
        for(int i=2; i*i<=n; i++) {
            if(primes[i]==1){
                for(int j=i*i; j<=n; j+=i) {
                    primes[j] =0;
                }
            }
        }
        int primeCount = 0;
        for(int k=2; k<n; k++) {
            primeCount += primes[k];
        }
        return primeCount;
    }
}