package bitmanipulation;

class bit{
    public boolean checkKthBit(int n, int k) {
        return (n & (1 << k)) != 0;
    }
}

public class checkkthbit {
    public static void main(String[] args) {
        bit obj=new bit();
        boolean result=obj.checkKthBit(5,1);
        System.out.println(result);
    }
    
}
