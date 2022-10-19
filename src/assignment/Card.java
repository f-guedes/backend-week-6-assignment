package assignment;

public class Card {
	
	/*
	 * Card fields
	 */
	private String name;
	private int value;
	
	/*
	 * Constructor
	 */
	public Card(int value, String name) {
		this.name = name;
		this.value = value;
	}
		
	
	/*
	 * Public methods - method "describe"
	 */
	public void describe() {
		System.out.println(this.getValue() + " of " + this.getName());
	}
	
	/*
	 * Getters & Setters
	 */
	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}
	

	
	
}
