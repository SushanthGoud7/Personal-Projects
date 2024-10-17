
public class DomainObject {
	private int id;
	private String name;

	public DomainObject(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void print() {
		System.out.println(id);
		System.out.println(name);
	}

}
