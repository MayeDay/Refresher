package model;

public abstract class Entity {
	private String name;
	private float healthPoints;
	private float manaPoints;
	
	public Entity(String name) {
		this.name = name;
	}
	
	public Entity(String name, float healthPoints) {
		this.name = name;
		this.healthPoints = healthPoints;
	}
	
	public Entity(String name, float healthPoints, float manaPoints) {
		this.name = name;
		this.healthPoints = healthPoints;
		this.manaPoints = manaPoints;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(float healthPoints) {
		this.healthPoints = healthPoints;
	}

	public float getManaPoints() {
		return manaPoints;
	}

	public void setManaPoints(float manaPoints) {
		this.manaPoints = manaPoints;
	}
	
	

}
