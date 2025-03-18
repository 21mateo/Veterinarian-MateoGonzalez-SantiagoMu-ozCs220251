package app.domain.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Person {
	private long id;
	private String name;
	private long document;
	private int age;
	
	public Person(long id, String name, long document, int age) {
		super();
		this.id = id;
		this.name = name;
		this.document = document;
		this.age = age;
	}
	
	public Person() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDocument() {
		return document;
	}

	public void setDocument(long document) {
		this.document = document;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
