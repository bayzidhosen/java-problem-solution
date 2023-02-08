public class Myrandom {
    public static void main(String[] args) {
        int min=50;
        int max=100;
        int rand=(int) Math.floor(Math.random()*(max-min)+min);
        System.out.println(rand);
    }
}
