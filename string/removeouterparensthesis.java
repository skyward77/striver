package string;
class Solutione{
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int depth=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(depth>0){
                    ans.append(ch);
                }
                depth++;
            }
            else{
                depth--;
                if(depth>0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}

public class removeouterparensthesis {
    public static void main(String[] args) {
        Solutione obj=new Solutione();
        String s="(()())(())";
        String result=obj.removeOuterParentheses(s);
        System.out.println(result);
    }
}
