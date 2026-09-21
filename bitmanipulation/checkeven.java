package bitmanipulation;

class checkeveN {
public boolean checkEven(int n) {
    return (n & 1) == 0;
}
}

public class checkeven {
    public static void main(String[] args) {
        int n = 4;
        checkeveN obj = new checkeveN();
        boolean result = obj.checkEven(n);
        System.out.println(result);
    }
}
    

