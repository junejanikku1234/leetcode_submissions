class Solution:
    def change(self, amount: int, coins: List[int]) -> int:

        @cache
        def numWays_startingWith_toMake(i: int, x: int) -> int:
            if i == len(coins):
                return 1 if x == 0 else 0
            take = 0
            if coins[i] <= x:
                take = numWays_startingWith_toMake(i, x - coins[i])
            skip = numWays_startingWith_toMake(i+1, x)
            return take + skip
        return numWays_startingWith_toMake(0, amount)
        