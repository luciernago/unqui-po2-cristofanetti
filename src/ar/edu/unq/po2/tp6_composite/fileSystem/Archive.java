package ar.edu.unq.po2.tp6_composite.fileSystem;

import java.time.LocalDateTime;

public final class Archive extends FS {
	
	int size;
	LocalDateTime lastMod;
	
	public Archive() {
		super();
		this.lastMod = LocalDateTime.now();
	}
	
	public Archive(String n, int s, LocalDateTime d) {
		super();
		this.name = n;
		this.size = s;
		this.lastMod = d;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public LocalDateTime getLastMod() {
		return this.lastMod;
	}
	
	public void edit() {
		this.lastMod = LocalDateTime.now();	}
	
	@Override
	public LocalDateTime getRelevantDate() {
		return this.lastMod;
	}

	@Override
	public int totalSize() {
		return this.getSize();
	}

	@Override
	public void printStructure() {
		System.out.println(name);
	}

	@Override
	public FS lastModified() {
		return this;
	}

	@Override
	public FS oldestElement() {
		return this;
	}

}
