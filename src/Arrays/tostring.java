package Arrays;

public class tostring {
	int id;
	String name;

	/**
	 * @param id
	 * @param name
	 */
	public tostring(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "tostring [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tostring t= new tostring(1, "lohith");
		tostring t1= new tostring(2, "mani");
		System.out.println(t + "          " + t1);
		System.out.println(t.hashCode() + "     " + t1.hashCode());

	}

}
