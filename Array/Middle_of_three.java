
public class Middle_of_three {

    public static void main(String[] args) {
        int a = 978, b = 518, c = 300;
        /*given 3 no.
             cheack for 2 no.
               => b is middle   ==>     a<b<c and c<b<a
               => a is middle   ==>     b<a<c and c<a<b
         */
        if (a <= b && b <= c || c <= b && b <= a) {
            System.out.println("b is middle");
        } else if (b <= a && a <= c || c <= a || a <= b) {
            System.out.println("a is middle");
        } else {
            System.out.println("c is middle");
        }

    }
}
