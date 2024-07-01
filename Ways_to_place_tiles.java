public class Ways_to_place_tiles {

    public  static int placeTile(int n ,int m ) {
        if(n == m ) {
            return 2;
        }
        if (n<m) {
            return 1;
        }
        int vertPlacement = placeTile(n-m , m);
        int horPlacement = placeTile(n-1,m );
        return vertPlacement+horPlacement;
    }
    public static void main(String[] args) {
int n = 4 ;
int m = 2;

        System.out.println(placeTile(n , m ));
    }
}
