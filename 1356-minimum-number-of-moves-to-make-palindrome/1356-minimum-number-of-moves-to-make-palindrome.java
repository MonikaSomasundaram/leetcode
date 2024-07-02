class Solution {
    public int minMovesToMakePalindrome(String s) {
		HashMap<Character,Integer> hm=new HashMap<>();
		char arr[]=s.toCharArray();
		for(char i:arr){
		    hm.put(i,hm.getOrDefault(i,0)+1);
		}
		int oddcount=0;
		for(int i:hm.values()){
		    if(i%2!=0){
		        oddcount++;
		    }
		    if(oddcount>1){
		        //System.out.println("-1");
		        return -1;
		    }
		}
		int l=0;
		int r=arr.length-1;
		int swap=0;
		while(l<=r){
		    if(arr[l]==arr[r]){
		        l++;
		        r--;
		    }
		    else{
		        int r1=r;
		        while(r1>l){
		            if(arr[r1]==arr[l]){
		                break;
		            }
		            r1--;
		        }
		        if(r1==l)//if no char equal to leaft is not found
		        {
		            char temp=arr[l];
		            arr[l]=arr[l+1];
		            arr[l+1]=temp;
		            swap++;
		        }
		        else{
                   while (r1 < r) {
                        char temp = arr[r1];
                        arr[r1] = arr[r1 + 1];
                        arr[r1 + 1] = temp;
                        swap++;
                        r1++;
                    }
		            // char temp=arr[r1];
		            // arr[r1]=arr[r];
		            // arr[r]=temp;
		            // swap+=(r-r1);
		            l++;
		            r--;
		        }
		    }
		}
		//System.out.println(swap);
		return swap;
	
    }
}