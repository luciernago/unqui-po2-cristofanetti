package ar.edu.unq.po2.tp6_composite.shapeShifter;

import java.util.List;

public abstract class ShapeShifter implements IShapeShifter {
	
	public ShapeShifter compose(IShapeShifter s) {
		Composed newElement = new Composed();
		newElement.addSS(this);
		newElement.addSS(s);
		return newElement;
	}
	public abstract int deepest();
	public abstract ShapeShifter flat();
	public abstract List<Integer> values();
}
