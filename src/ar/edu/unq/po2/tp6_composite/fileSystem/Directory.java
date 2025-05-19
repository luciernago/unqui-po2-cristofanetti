package ar.edu.unq.po2.tp6_composite.fileSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Directory extends FS {
	
	LocalDateTime creation;
	List<FS> subfolders = new ArrayList<FS>();
	
	public Directory() {
		super();
		this.creation = LocalDateTime.now();
	}
	
	@Override
	public LocalDateTime getRelevantDate() {
		return this.creation;
	}

	@Override
	public int totalSize() {
		int total = 0;
		for(FS i:subfolders) {
			total += i.totalSize();
		}
		return total;
	}

	@Override
	public void printStructure() {
		System.out.println(name);
		for (FS i:subfolders) {
			System.out.print("  ");
			i.printStructure();
		}
	}

	@Override
	public FS lastModified() {
		LocalDateTime d = this.creation;
		FS item = this;
		for (FS i:subfolders) {
			LocalDateTime nd = i.lastModified().getRelevantDate();
			if (nd.isAfter(d)) {
				d = nd;
				item = i.lastModified();
			}
		}
		return item;
	}

	@Override
	public FS oldestElement() {
		LocalDateTime d = this.creation;
		FS item = this;
		for (FS i:subfolders) {
			LocalDateTime nd = i.lastModified().getRelevantDate();
			if (nd.isBefore(d)) {
				d = nd;
				item = i;
			}
		}
		return item;
	}

}
