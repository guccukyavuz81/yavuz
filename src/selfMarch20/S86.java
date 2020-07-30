package selfMarch20;

public class S86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Short s1=200;
		Integer s2=400;
		//String s3=(String)(s1+s2);   Cannot cast from int to String
		Long s4=(long)s1+s2;
		System.out.println("sum is "+s4);
		
//		Integer x=new Integer("1");
//		System.out.println(x);
		
		int nums1[]= {1,2,3};
		int nums2[]= {1,2,3,4,5};
		nums2=nums1;
		for(int x:nums2) {
			System.out.println(x);
		}
		String []strs= {"A","B"};
		int idx=0;
		for (String s:strs) {
			strs[idx].concat("element "+idx);
			idx++;
		}
		for(idx=0;idx<strs.length;idx++) {
			System.out.println(strs[idx]);
		}
	}

}
