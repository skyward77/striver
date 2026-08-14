package Array.Hard;
import java.util.*;

class triangle{
    public List<List<Integer>> generate(int numrows){   //two list outer list stores all rows inner one stores one row
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<numrows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                  if(j==i||j==0){
                    row.add(1);
                  }
                  else{
                    row.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));//left+right

                    //get(i-1) ka mtlb isse pehli row ka get(j-1) j elemeent +_ usi row ka (j) element
                  }
            }
        
        result.add(row);
        }
        return result;

    }
}

public class pascaltriangle {
    public static void main(String[] args) {
        triangle obj=new triangle();
        int num=5;
        List<List<Integer>> result=obj.generate(num);
        System.out.println(result);
    }
}
