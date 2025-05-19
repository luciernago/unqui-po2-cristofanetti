package ar.edu.unq.po2.tp6_composite.shapeShifter;

import java.util.ArrayList;
import java.util.List;

public class Composed extends ShapeShifter {
	
	List<IShapeShifter> components = new ArrayList<IShapeShifter>();
	
	public Composed() {
		super();
	}

	@Override
	public int deepest() {
		int deepness = 0;
		for (IShapeShifter s:components) {
			int newDeepness = s.deepest();
			if (newDeepness>deepness) {
				deepness = newDeepness;
			}
		}
		return deepness+1;
	}

	@Override
	public ShapeShifter flat() {
		Composed newElement = new Composed();
		List<Integer> newList = this.values();
		for(Integer i:newList) {
			newElement.addSS(new Simple(i));
		}
		return newElement;
	}

	@Override
	public List<Integer> values() {
		List<Integer> list = new ArrayList<Integer>();
		for (IShapeShifter s:components) {
			list.addAll(s.values());
		}
		return list;
	}
	
	void addSS(IShapeShifter s) {
		components.add(s);		
	}

}
