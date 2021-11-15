public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        String first = in.nextLine();
        System.out.print("Input the second number: ");
        int second = in.nextInt();
        System.out.print("Input the third: ");
        float third = in.nextFloat();
        System.out.print("Input the fourth number: ");
        int fourth = in.nextInt();
        int answer = Math.min( Math.min(a,b), Math.min(c,d) );
        System.out.println(answer);
}
