public class Boolean3 {
    public static void main(String[] args) {

        boolean A = !(!(!(false ^ false) || (true && true))); // La risposta è true false^false=false(true&&true=true)
        System.out.println(A);                                                //false||true= true

        int x =3;
        int y= 2;
        boolean B = !((x * y) <= 6) && (x - y != 1); //La risposta è false= true&&false= False
        System.out.println(B);
    }
}
