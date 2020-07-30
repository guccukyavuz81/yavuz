package selfMarch20;

public class V18s146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] strs=new String[2];
		int idx=0;
		for(String s:strs) {
			strs[idx].concat("element "+idx);
			idx++;
		}
		//strs[0]="a";    //this is when it is partially filled it prints a null
		for(idx=0;idx<strs.length;idx++) {
			System.out.println(strs[idx]);
		}
	}

}
