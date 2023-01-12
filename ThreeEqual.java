public class ThreeEqual {
    public static void main(String[] args) {
        if (args.length<3){
            System.out.println("not enough variables");
        }else{
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            if (a-b == b-c){
                System.out.println("equal");
            }else{
                System.out.println("not equal");
            }
        }
    }
}