package day36_Inheritance.planet;

public class Planet {

    public String name;
    public double mass, radius, surfaceGravity, surfaceArea, volume;
    public int population;

    public void setInfo(String name, double mass, double radius, double surfaceGravity, double surfaceArea, double volume, int population) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.surfaceArea = surfaceArea;
        this.volume = volume;
        this.population = population;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}

/*


Planet Task:
	1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			methods:
				setInfo()
				toString()

	2. create the following subclasses of Planet
			1. Earth
			2. Moon
			3. Mercury
			4. Venus

			Note: you can search them on google
 */
