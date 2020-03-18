package yeniOgrendiklerimSelf;


class Maxx{
	public static int max(int a1, int a2) {
		int result;
		if(a1>a2) {
		result=a1;
		}else {
		result=a2;
		}
		return result;
	}
}


public class MethodMax {
	// burda max de koyulur sorun yok
	// max(int a1, int a2)  --> correct   max(int a1, a2)  -->wrong (ayri ayri declare edilmesi gerekiyor)
	
	public static void main(String[] args) {

		System.out.println(Maxx.max(29,25));
	}

}
