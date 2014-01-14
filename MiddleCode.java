public class MiddleCode {

	private String pre, tmp, t;
	private Integer i, len, rm_index, md_index;

	public String encode(String s) {
		t = ""; tmp = s;
	
		while ((len=tmp.length()) != 0) {
			md_index = len / 2;
			if (len % 2 == 1) {
				rm_index = md_index;
			} else {
				if (tmp.charAt(md_index-1) <= tmp.charAt(md_index)) {
					rm_index = md_index - 1;
				} else {
					rm_index = md_index;
				}
			}
			t.concat (String.valueOf (tmp.charAt(rm_index)) );
			
			pre = tmp; tmp = "";
			for (i=0; i<rm_index; i++) {
				tmp.concat (String.valueOf (pre.charAt(i)) );
			}
			for (i=rm_index+1; i<len; i++) {
				tmp.concat (String.valueOf (pre.charAt(i)) );
			}
		}
		return t;
	}
	
}
