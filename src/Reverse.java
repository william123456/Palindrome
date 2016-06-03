
public class Reverse {
StringBuffer 
	public static void main(String[] args) {
		Reverse r = new Reverse();
		r.reverse("racecad");
	}
	public void reverse(String str){
		int l = str.length();
		char[] strArray = str.toCharArray();
		char[] retArray = new char[l];
		for(int i = 1; i<=(l+1)/2; i++){
			retArray[i-1] = strArray[l-i];
			retArray[l-i] = strArray[i-1];
		}
		System.out.println(new String(retArray));	
	}
}
