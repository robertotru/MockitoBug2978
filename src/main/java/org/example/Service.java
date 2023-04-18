package org.example;

public class Service implements Dependency {

	private Dependency dependency;

	private final Dependency1 dependency1;

	private final Dependency2 dependency2;

	public Service(Dependency1 dependency1, Dependency2 dependency2) {
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	void postConstruct() {
		dependency = null; // it could be something else, like a call to a context or to new
	}

}
