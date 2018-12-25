/**
 *
 */
package enums;

/**
 * @author DELL
 *
 */
public class AssigningValues {

	/**
	 * @param args
	 */
	public enum MyEnum{
		VALUE1("value_1",null),
		VALUE2("value_1",null);

		private String name,value;

		private MyEnum(String name, String value) {
			this.name = name;
			this.value = value;
		}



		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
