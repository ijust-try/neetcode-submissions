class Solution {

    public void mergeSort(int[] nums, int left, int right)
    {
        if(left >= right)
        {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);

        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    public void merge(int[] nums, int left, int mid, int right)
    {
        int[] temporary = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= right)
        {
            if(nums[i] <= nums[j])
            {
                temporary[k] = nums[i];
                i++;
            }
            else
            {
                temporary[k] = nums[j];
                j++;
            }

            k++;
        }

        while(i <= mid)
        {
            temporary[k] = nums[i];
            i++;
            k++;
        }

        while(j <= right)
        {
            temporary[k] = nums[j];
            j++;
            k++;
        }

        for(int x = 0; x < temporary.length; x++)
        {
            nums[left + x] = temporary[x];
        }
    }

    public int[] sortArray(int[] nums)
    {
        mergeSort(nums, 0, nums.length - 1);

        return nums;
    }
}