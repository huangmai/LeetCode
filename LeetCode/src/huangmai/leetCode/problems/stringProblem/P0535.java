package huangmai.leetCode.problems.stringProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P0535 {
	private List<String> u;
	private Map<String, String> m;
	public P0535(){
		u = new ArrayList<>();
		m = new HashMap<>();
	}

	private static int getIndex(String s){
		int i = 0;
		for(char c : s.toCharArray()){
			i *= 62;
			if(c >= '0' && c <= '9'){
				i += c - '0';
			}else if(c >= 'a' && c <= 'z'){
				i += c - 'a';
			}else{
				i += c - 'A';
			}
		}
		return i;
	}

	private static String fromIndex(int i){
		StringBuilder sb = new StringBuilder(6);
		for(int k = 0, t; k < 6; k ++){
			t = i % 62;
			if(t < 10){
				sb.append((char)(t + '0'));
			}else if(t < 36){
				sb.append((char)(t - 10 + 'a'));
			}else{
				sb.append((char)(t - 36 + 'A'));
			}
		}
		return sb.toString();
	}

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		if(m.containsKey(longUrl)){
			return m.get(longUrl);
		}
		String shortUrl = fromIndex(u.size());
		m.put(longUrl, shortUrl);
		u.add(longUrl);
		return shortUrl;
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		return u.get(getIndex(shortUrl));
	}
}
