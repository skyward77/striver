package string;
class Solutionv{
    public int maxDepth(String s) {
        int depth=0;
        int maxdepth=0;
        for(char ch:s.toCharArray()){
            
        
        if(ch=='('){
            
        
            depth++;
            maxdepth=Math.max(maxdepth,depth);
            
        }
        else if(ch==')'){
            depth--;
        }
        }
        return maxdepth;
    }
}

public class maxdepth {
    public static void main(String[] args) {
        Solutionv obj=new Solutionv();
        String s="(1+(2*3)+((8)/4))+1";
        int result=obj.maxDepth(s);
        System.out.println(result);
    }
    
}
