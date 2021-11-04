public class MyEat {
    public static void main(String[] args) {
        int cash = 500;
        if (cash>500) {
            System.out.println("У вас "+ cash + " рублей - купите пиццу");
        } else if (cash>300) {
            System.out.println("У вас "+ cash +" рублей - купите гамбургер");
        } else if (cash>100) {
            System.out.println("У вас " + cash + " рублей - купите шаурму");
        } else if (cash>10) {
            System.out.println("У вас "+ cash+ " рублей - купите доширак");
        } else System.out.println("У вас не хватает денег!");
    }
}
