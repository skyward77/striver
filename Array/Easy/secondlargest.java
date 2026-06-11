package Array.Easy;

 
    


class solution {
    public int getsecondlargest(int[] nums) {
        int largest = nums[0];
        int second = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                second = largest;
                largest = nums[i];
            } 
            else if (nums[i] > second && nums[i] != largest) {
                second = nums[i];
            }
        }

        return second;
    }
}

public class secondlargest {
    public static void main(String[] args) {

        solution obj = new solution();

        int[] num = {2, 3, 4, 5, 6, 7, 8};

        int result = obj.getsecondlargest(num);

        System.out.println(result);
    }
}
