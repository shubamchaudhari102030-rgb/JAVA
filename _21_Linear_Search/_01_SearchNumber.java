package _21_Linear_Search;


public class _01_SearchNumber {

    public static void main(String[] args) 

    {
        int[] nums = {63,67,92, 45, -12 , 21, -45, 0, 100, 200};
        int target = 100;
        int result = linearSearch(nums, target);
        System.out.println(result);

    }
        // search for an element in an array
        //return the index of the element if found,
        //  otherwise return -1

        static int linearSearch(int[] arr, int target)
        {
            if(arr.length == 0)
            {
                return -1;


            }

            for(int index = 0; index < arr.length; index++)
                {
                    // chekk if the element at index is equal to target
                    int element = arr[index];
                    if(element == target)
                    {
                        return index;
                    }

                }

            // this line will execute if none of the return statements above have executed
            // hence the target not found
            return -1;
            } 
        }
