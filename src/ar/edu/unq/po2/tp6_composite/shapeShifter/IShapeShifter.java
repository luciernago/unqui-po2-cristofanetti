package ar.edu.unq.po2.tp6_composite.shapeShifter;

import java.util.List;

public interface IShapeShifter {

	public IShapeShifter compose(IShapeShifter s);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer> values();

}
