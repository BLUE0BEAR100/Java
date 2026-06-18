class Main {
    public static void main(String[] args) {
        //user input process can be also be used rather than giving manual inputs
        String first="Cod";
        String sencond="ingal";
        String codingal=first+sencond;
        String codingalTrick="Welcome "+"To "+"Codingal";
        String codingalCapital=codingal.toUpperCase();
        String codingalSmall=codingalCapital.toLowerCase();

        int lengthOfCodingal=codingal.length();
        int lengthOfCodingalTrick=codingalTrick.length();
        int sum=lengthOfCodingal+lengthOfCodingalTrick;

        //guess the answer before running
        //a msg can also be added for the outpuit screen if required
        System.out.println(codingal);
        System.out.println(codingalTrick);
        System.out.println(codingalCapital);
        System.out.println(codingalSmall);
        System.out.println(sum);
    }
}