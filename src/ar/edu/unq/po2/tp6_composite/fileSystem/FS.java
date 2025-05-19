package ar.edu.unq.po2.tp6_composite.fileSystem;

import java.time.LocalDateTime;

public abstract class FS {
	
	String name;
	
	public String getName() {
		return this.name;
	}
	
	public abstract LocalDateTime getRelevantDate();

	public abstract int totalSize();
	
	public abstract void printStructure();
	
	public abstract FS lastModified();

	public abstract FS oldestElement();
	
}
