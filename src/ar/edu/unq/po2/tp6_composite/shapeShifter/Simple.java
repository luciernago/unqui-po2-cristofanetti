package ar.edu.unq.po2.tp6_composite.shapeShifter;

import java.util.ArrayList;
import java.util.List;

public class Simple extends ShapeShifter {
	
	Integer integer;
	
	public Simple(Integer i) {
		this.integer = i;
	}

	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public ShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(integer);
		return list;
	}

}
