package code;

import java.util.HashMap;

/**
 *@author : gaoweibupt@gmail.com
 *
 * ����ʱ�䣺 2015��10��16������4:16:08
 */
public class OperateString {
	
	/**
	 * �ڰ���  ϰ��1.1
	 * <p> ȷ��һ���ַ����������ַ�ȫ����ͬ<br>
	 * ʹ��HashMap���ݽṹ
	 * @param String s �����ַ���
	 * @return true Ϊȫ��ͬ��falseΪ����ͬ���ַ�
	 * 
	 * �Ľ������String ��ASCII�ַ�����s.length()>256 �Ϳ��Է���false
	 * */
	public static boolean isDifferentChar(String s){
		if (s == null || s.equals("")){
			return true;
		}
//		if (s.length() > 256)return false;
		HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
		for (int i = 0; i < s.length(); i++){
			if (map.containsKey(s.charAt(i))){
				return false;
			}
			else{
				map.put(s.charAt(i), true);
			}
		}
		return true;
	}
	
	
	/**
	 * �ڰ���  ϰ��1.1
	 * <p> ȷ��һ���ַ����������ַ�ȫ����ͬ<br>
	 * �����ö�������ݽṹ
	 * @param String s �����ַ���
	 * @return true Ϊȫ��ͬ��falseΪ����ͬ���ַ�
	 * */
	public static boolean isDifferentChar2(String s){
		if (s == null || s.equals("")){
			return true;
		}
		for (int i = 0; i < s.length() - 1; i++){
			for (int j = i + 1; j < s.length(); j++){
				if (s.charAt(i) == s.charAt(j)){
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * �ڰ���  ϰ��1.3
	 * <p> ���������ַ������жϾ��������ܷ����<br>
	 * @param s1 �����ַ���1�� s2 �����ַ���2
	 * @return true Ϊ���ԣ�falseΪ������
	 * */
	public static boolean isResetEqual(String s1, String s2){
		if (s1.length() != s2.length()){
			return false;
		}
		int[] map = new int[256];
		for (int i = 0; i < s1.length(); i++){
			map[s1.charAt(i)]++;
		}
		for (int i = 0; i < s2.length(); i++){
			map[s2.charAt(i)]--;
		}
		for (int i = 0; i < 256; i++){
			if (map[i] != 0)return false;
		}
		return true;
	}
	
	/**
	 * �ڰ���  ϰ��1.4
	 * <p> ���ַ����еĿո��滻��%20<br>
	 * @param String s Ҫ�滻���ַ���
	 * @return String result �滻����ַ���
	 * */
	
}