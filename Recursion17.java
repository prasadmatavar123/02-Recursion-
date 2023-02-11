public class Recursion17 {
    public static int placeTiles(int n, int m){
        if(n == m){
            return 2;
        }

        if(n < m){
            return 1;
        }
        // Vertically
        int vertPlacements = placeTiles(n-m, m);

        //horizontally
        int horPlacemenets = placeTiles(n-1, m);

        return vertPlacements + horPlacemenets;
    }
    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));
    }
    
}

// Place tiles of size 1xm in a floor of size nxm
//n = 4, m = 2