package rs.math.oop.g06.p08.prosledjivanjeOmotacTipa;

public class MutabilniFloat {
	float v;
	public MutabilniFloat(float value) {
		v=value;
	}

	public float getValue() {
		return v;
	}

	public void setValue(float value) {
		v = value;
	}

	public void saberiSeSa(Float drugi) {
		this.v += drugi;
	}
}
