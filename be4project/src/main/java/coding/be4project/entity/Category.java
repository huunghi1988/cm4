package coding.be4project.entity;

public class Category {
	private int category_id;
	private String category_name;
	
	
	public Category(int category_id, String category_name) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
	}
	public int getId() {
		return category_id;
	}
	public void setId(int category_id) {
		this.category_id = category_id;
	}
	public String getName() {
		return category_name;
	}
	public void setName(String category_name) {
		this.category_name = category_name;
	}
	
	
}