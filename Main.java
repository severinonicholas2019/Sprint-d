public class Main {

    public static double total;
    public static void main(String[] args) {

        total = (100+50+20+360+80+160+500+240+40+40);
        System.out.println("------------------------------------We will test 30 hour weeks--------------------------");
        fin1(8, 3, 30);
        fin1(9, 3, 30);
        fin1(10, 3, 30);
        fin1(11, 3, 30);
        fin1(8, 4, 30);
        fin1(8, 5, 30);
        fin1(8, 6, 30);
        System.out.println("------------------------------------Now we test 35 hour weeks---------------------------");
        fin2(8, 3, 35);
        fin2(9, 3, 35);
        fin2(10, 3, 35);
        fin2(11, 3, 35);
        fin2(8, 4, 35);
        fin2(8, 5, 35);
        fin2(8, 6, 35);
        System.out.println("------------------------------------Now we test 40 hour weeks---------------------------");
        fin3(8, 3, 40);
        fin3(9, 3, 40);
        fin3(10, 3, 40);
        fin3(11, 3, 40);
        fin3(8, 4, 40);
        fin3(8, 5, 40);
        fin3(8, 6, 40);
    }

        public static void fin1(int e, int h, int we){
        double cap = (total/(e*h*we))*100;
        System.out.printf("With "+e+" devs working a "+h+" week sprint, for "+ we+" hrs/wk, we would be at "+"%.0f",cap);
        System.out.print("% of capacity \n");

        }
        public static void fin2(int e, int h, int we){
        double cap = (total/(e*h*we))*100;
        System.out.printf("With "+e+" devs working a "+h+" week sprint, for "+ we+" hrs/wk, we would be at "+"%.0f",cap);
        System.out.print("% of capacity \n");

        }
        public static void fin3(int e, int h, int we){
        double cap = (total/(e*h*we))*100;
        System.out.printf("With "+e+" devs working a "+h+" week sprint, for "+ we+" hrs/wk, we would be at "+"%.0f",cap);
        System.out.print("% of capacity \n");

        }

}
