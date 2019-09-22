package neo.com.util;

public class Util {


	/**
	* <pre>
	* 1. �޼ҵ�� : getInt
	* 2. �ۼ��� : 2017. 9. 26.
	* 3. �ۼ��� : linked2ev
	* 4. ���� : String���� int������ ��ȯ�Ѵ�. null �Ǵ� ""�̸� 0���� return
	* </pre>
	* @param obj
	* @return
	 */
	public static int getInt(Object obj){
		if(obj == null || "".equals(obj.toString())) {
			return 0;
		} else {
			return Integer.parseInt(obj.toString());
		}
	}

	/**
	* <pre>
	* 1. �޼ҵ�� : getInt
	* 2. �ۼ��� : 2017. 9. 26.
	* 3. �ۼ��� : linked2ev
	* 4. ���� : String���� int������ ��ȯ�Ѵ�. null �Ǵ� ""�̸� defaultNum(���ǰ�)���� return
	* </pre>
	* @param obj
	* @param defNum
	* @return
	 */
	public static int getInt(Object obj, int defaultNum){
		if(obj == null || "".equals(obj.toString())) {
			return defaultNum;
		} else {
			return Integer.parseInt(obj.toString());
		}
	}

	/**
	* <pre>
	* 1. �޼ҵ�� : isNull
	* 2. �ۼ��� : 2017. 12. 15.
	* 3. �ۼ��� : linked2ev
	* 4. ���� : Ư�� ���� null �Ǵ� ""�̸� false �ƴϸ� true return
	* </pre>
	* @param obj
	* @return
	 */
	public static boolean isNull(Object obj){
		if(obj == null || "".equals(obj.toString())){
			return false;
		}else{
			return true;
		}
	}
	
	/**
	* <pre>
	* 1. �޼ҵ�� : getString
	* 2. �ۼ��� : 2017. 12. 16.
	* 3. �ۼ��� : JAMUGE
	* 4. ���� : null �Ǵ� ""�̸� "" return
	* </pre>
	* @param obj
	* @return
	 */
	public static String getStr(Object obj){
		if(obj == null || "".equals(obj.toString())){
			return "";
		}else{
			return obj.toString();
		}
	}
    
    /**
    * <pre>
    * 1. �޼ҵ�� : getString
    * 2. �ۼ��� : 2017. 9. 26.
    * 3. �ۼ��� : JAMUGE
    * 4. ���� : null �Ǵ� ""�̸� defaultStr(���ǰ�)���� return
    * </pre>
    * @param obj
    * @param defStr
    * @return
     */
	public static String getStr(Object obj, String defaultStr){
		if(obj == null || "".equals(obj.toString())){
			return defaultStr;
		} else {
			if ("".equals(obj.toString())){
				return defaultStr;
			} else {
				return obj.toString();
			}
		}
	}
	
	/***** add Method *****/
}