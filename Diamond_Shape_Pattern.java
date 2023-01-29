public class Diamond_Shape_Pattern {
    public static void main(String[] args) {
        int i,j,row=6,space=1;
        space=row-1;
        for(i=1; i<=row; i++){
            for(j=1; j<=space; j++){
                System.out.print(" ");
            }
            space--;
            for(j=1; j<=2*i-1; j++){
                System.out.println("*");
            }
            System.out.println();
        }
        space=1;
        for(i=1; i<=row-1 ;i++){
            for(j=1; j<=space; j++){
                System.out.print(" ");
            }
            space++;
            for(j=1; j<=2*(row-i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
