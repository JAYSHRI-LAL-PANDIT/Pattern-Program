public class Downward_Triangle_Star_Pattern {
    public static void main(String[] args) {
        int row=6;
        for(int i=row; i>0; i-- ){
            for(int j=i-1; j>0; j--){
                
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
