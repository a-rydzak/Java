public class StringManipulation{

	public String trimAndConcat(String a, String b){
		String one = a.trim();
		String two = b.trim();
		String three = one.concat(", ").concat(two);
		return three;
	}

	public Integer getIndexOrNull(String str, char chr){
		Integer aa = str.indexOf(chr);
		if(aa == -1){
			aa = null;
		}
		return aa;
	}

	public Integer getIndexOrNull(String strOne, String strTwo){
		Integer result = strOne.indexOf(strTwo);
		return result;
	}

	public String concatSubstring(String strOne, int start, int end, String strTwo){
		String subString = strOne.substring(start,end).concat(strTwo);
		return subString;
	}
}