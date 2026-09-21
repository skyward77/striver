package bitmanipulation;
class Solutioniny {
    public static int setRightmostUnsetBit(int n) {
        return n | (n + 1);
    }
}

public class rightmostunsetbit {
    public static void main(String[] args) {
        int n = 10;
        int result = Solutioniny.setRightmostUnsetBit(n);
        System.out.println(result);
    }
    
}
