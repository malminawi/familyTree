package com.das.example;

public class Family {
	private int generation;
	private String father;
	private String mother;
	private String son;
	private String daughter;
	private String grandFather;
	public int getGeneration() {
		return generation;
	}
	public void setGeneration(int generation) {
		this.generation = generation;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getSon() {
		return son;
	}
	public void setSon(String son) {
		this.son = son;
	}
	public String getDaughter() {
		return daughter;
	}
	public void setDaughter(String daughter) {
		this.daughter = daughter;
	}
	public String getGrandFather() {
		return grandFather;
	}
	public void setGrandFather(String grandFather) {
		this.grandFather = grandFather;
	}
	
	void ALlInfo()
	{
		
		
	System.out.println("Enter the name of the grandfather and grand mother");

	String gdfnm="Lonnie";
	String gdmth="Kay";
	System.out.println(gdfnm+"-----------------------"+gdmth);


		System.out.println("/\t\t|\t\t\\\t\t----");
		System.out.println("/\t\t|\t\t\\\t\t----");
	System.out.println("John\t\tMarry\t\tSamaantha\t\tTom");

	//super.display();

	//String as[]=new String[n];


		System.out.println("/\t\t|\t\t\\");
		System.out.println("/\t\t|\t\t\\");
		System.out.println("Martha\t\tWood\t\tWeedy");
	System.out.println("\n");
	}


}
