class MinMax {

	public static int[] foundMinMax(int[] tableau) {

        // initialiser min avec la premiere valeur du tableau 
        int min = tableau[0];
        int max = tableau[0];

        // parcourir les valeurs du tableau 

        // i  0  1   2  3  4   5   6
        // [ 12, 4, 54, 2, 8, 23 ]     tableau.length: 6        
        for (int i = 0; i < tableau.length; i = i + 1){
            // si la valeur de la case est inférieure à min
            if (tableau [ i ] < min ){
                // min prend la valeur de la case
                min = tableau[i];
            }
           
            if (tableau [i] > max ) {
                max = tableau [i];
            }
            
        }
        // retourner la valeur la plus petite du tableau : min
        return new int[] {min,max};
    }

}
