public class BugHunter {
    public static void main(String[] args) {
        String test1 ="Debug";
        String test2 ="bugs bunny";
        String test3 = "boogie";
        String test4 ="baby buggie";
        int index1=findBug(test1);
        int index2 = findBug(test2);
        int index3 = findBug(test3);
        int index4 = findBug(test4);
        printBug(test1, index1);
        printBug(test2, index2);
        printBug(test3, index3);
        printBug(test4, index4);

    
    }
    public static  int findBug(String str) {
        return str.indexOf("bug");
    }
    public static void printBug(String test, int index) {
        if(index != -1) {
            System.out.println(test + "-нин(тын)" + index + " - индексинде bug бар");
        }
        else{
            System.out.println(test + "-нин bugтары жок");
        }
    }
}