class Minmax {
	public static int[] foundMinMax(int[] tableauEntier) {
		int min = tableauEntier[0];
		int max = tableauEntier[0];
		for (int i = 0; i < tableauEntier.length; i++) {
			if (tableauEntier[i] < min || min == -1) {
				min = tableauEntier[i];
			}
			if (tableauEntier[i] > max || max == -1) {
				max = tableauEntier[i];
			}
		}
		return new int[]{min, max};
	}
}