/**
 *
 */
package executor;

import enums.AssigningValues.MyEnum;

/**
 * @author DELL
 *
 */
public class GlobalMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyEnum.VALUE1.setValue("86");
		System.out.println(MyEnum.VALUE1.getValue());
	}

}
