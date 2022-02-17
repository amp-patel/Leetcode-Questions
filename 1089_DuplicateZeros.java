class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                for(int j = arr.length-1; j>i;j--)
                {
                    arr[j]=arr[j-1];
//                    System.out.println(arr[j]);

                }
                if(i+1<arr.length) {
                    arr[i + 1] = 0;
                }
//                arr[i+1]=0;
                i++;
            }
//            System.out.println(arr[i]);

        }

        for(int i=0; i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
