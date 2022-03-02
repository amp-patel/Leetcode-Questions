class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
     
         int start = 0;
        int end = letters.length-1;

        while(start<end)
        {
           int mid = (start+end)/2;

            if(target < letters[mid])
            {
                end = mid;
            }
            else
            {
                start = mid + 1;
            }
        }
        if(target < letters[start])
        {
            return letters[start];
        }
        else
        {
            return letters[0];
        }
             
    }
    
}
