// good. I think this is the most elegant solution I've seen
public class RollLoadedDie {
    public static void main(String[] args) {
        double roll = Math.round(Math.random()*7+1);
        if (roll > 6){
            roll = 6;
        }
        System.out.println(roll);


    }
}
