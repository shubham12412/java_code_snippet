static class Interval {

	int start;
	int end;

	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public String toString() {
		return String.format("(%d,%d)", start,end);
	}
	
	static boolean checkOverlap(Interval i1, Interval i2) {
		return !(i1.start > i2.end || i2.start > i1.end);
	}
	
}
