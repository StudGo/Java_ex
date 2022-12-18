package lab5.task3;

public class example3 {
    static class ArgumCl {
        int first;
        int second;
        ArgumCl() {
            this.first = 1;
            this.second = 1;
        }
        ArgumCl(int first) {
            this.first = first;
            this.second = 1;
        }
        ArgumCl(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        ArgumCl test1 = new ArgumCl();
        System.out.println("Конструктор без параметров:");
        System.out.println("Первый аргумент: " + test1.first + "\nВторой аргумент: " + test1.second);
        System.out.println("Конструктор с одним параметром:");
        ArgumCl test2 = new ArgumCl(20);
        System.out.println("Первый аргумент: " + test2.first + "\nВторой аргумент: " + test2.second);
        System.out.println("Конструктор с двумя параметрами:");
        ArgumCl test3 = new ArgumCl(20, 60);
        System.out.println("Первый аргумент: " + test3.first + "\nВторой аргумент: " + test3.second);
    }
}
