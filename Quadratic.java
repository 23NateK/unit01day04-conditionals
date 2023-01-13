public class Quadratic {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        if ((b*b)-4*a*c <= 0){
            System.out.println("No Solution");
        }else{
            if (a == 0 ){
                System.out.println(-c/b);
            }else{
                double answer1 = Math.sqrt((b*b)-4*a*c);
                answer1 = -b + answer1;
                answer1 = answer1/(2*a);
                System.out.println(answer1);
                double answer2 = Math.sqrt((b*b)-4*a*c);
                answer2 = -b - answer2;
                answer2 = answer2/(2*a);
                System.out.println(answer2);
            }
        }
    }
}
