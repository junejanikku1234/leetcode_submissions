class Solution {
    public boolean lemonadeChange(int[] bills) {
        boolean satisfy = true;
        HashMap<Integer,Integer> change = new HashMap<>();
        change.put(5,0);
        change.put(10,0);
        change.put(20,0);

        for(int num: bills){
            if (num == 5){
                change.put(5,change.get(5)+1);
            } else if (num == 10){
                if(change.get(5) >= 1){
                    change.put(10,change.get(10)+1);
                    change.put(5,change.get(5)-1);
                } else{
                    satisfy = false;
                    break;
                }
            } else{
                if(change.get(10) >= 1 && change.get(5) >= 1){
                    change.put(10,change.get(10)-1);
                    change.put(5,change.get(5)-1);
                    change.put(20,change.get(20)+1);
                } else if(change.get(5) >= 3){
                    change.put(5,change.get(5)-3);
                    change.put(20,change.get(20)+1);
                } else {
                    satisfy = false;
                    break;
                }
            }
        }
        return satisfy;
    }
}