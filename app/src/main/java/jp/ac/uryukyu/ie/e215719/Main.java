package jp.ac.uryukyu.ie.e215719;

public class Main {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("ヌルポ(NullPointerException)が発生");
            System.out.println(e.getMessage());
        }
    }
}