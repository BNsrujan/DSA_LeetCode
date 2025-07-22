class Solution {
    public int sum(int sum,int addednumber){
        if(sum == 0) return addednumber;
        int rem = sum % 10 ;
        addednumber = addednumber + rem;
        sum = sum /10;
        return sum(sum,addednumber); 
    }

    public int addDigits(int num) {
        if(num <= 9) return num;
        int addednumber = 0;
        num = sum(num,addednumber);
        return addDigits(num);
    }
}