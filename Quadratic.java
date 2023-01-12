public class Quadratic {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        if (a == 1 ){
            System.out.println(-c/b);
        }else if (b == 1){
            double result1 = Math.sqrt(-c/b);
            double result2 = -1*(Math.sqrt(-c/b));
            System.out.println(result1 + ", " + result2);
        }else{
            
        }

    }
}
