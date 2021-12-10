package egovframework.example.sample.service;

public class ItemVO {
	/** 상품명 */
	private String name;
	/** 가격 */
	private int price;
	/** 설명 */
	private String description;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
