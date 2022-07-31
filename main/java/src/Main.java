import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(presses("LOL"));
    }

    public static long stairsIn20(int[][] stairs)
    {
        return (Arrays.stream(stairs)
                .mapToLong(day-> Arrays.stream(day)
                        .mapToLong(el->el)
                        .sum()).sum())*20;
    }

    public String sayHello(String [] name, String city, String state){
        String fullname = String.join(" ", name);

        StringBuilder result = new StringBuilder("Hello, "+fullname+"! "+"Welcome to "+city+", "+state+"!");
        return result.toString();   //"Hello, John Smith! Welcome to Phoenix, Arizona!"
    }

    public static int evaporator(double content, double evap_per_day, double threshold) {
        double temp = content*(threshold/100);
        int count = 0;
        while (content>=temp){
            content = content-(content*(evap_per_day/100));
            count++;
        }
        return count;
    }

    public static List<Object> filterList(final List<Object> list) {

        return list.stream().filter(n->n instanceof Integer).collect(Collectors.toList());
    }

    public static String cleanString(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        int start = 0;
        int finish = 0;


        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)=='#'){
                if(finish>start){
                stringBuilder.delete(finish-1,finish);
                finish--;}
            }
            else {
                stringBuilder.append(s.charAt(i));
                finish++;
            }
        }

        return stringBuilder.toString();
    }



    public static int presses(String phrase) {

         int count = 0;

         List<String> keypad = keypad();
         for (int i = 0; i < phrase.length() ; i++) {
            for (int j = 0; j < keypad.size(); j++) {
                String str = phrase.charAt(i)+"";
                if(keypad.get(j).contains(str)){
                  count+= keypad.get(j).indexOf(str)+1;
                  break;
                }
            }
         }
         return count;

    }

    private static ArrayList<String> keypad(){

        String numb1 = "1";
        String numb2 = "ABC2";
        String numb3 = "DEF3";
        String numb4 = "GHI4";
        String numb5 = "JKL5";
        String numb6 = "MNO6";
        String numb7 = "PQRS7";
        String numb8 = "TUV8";
        String numb9 = "WXYZ9";
        String numbStar = "*";
        String numb0 = " 0";
        String numbSharp = "#";

        List<String> keypad = new ArrayList<>();

        keypad.add(numb1);
        keypad.add(numb2);
        keypad.add(numb3);
        keypad.add(numb4);
        keypad.add(numb5);
        keypad.add(numb6);
        keypad.add(numb7);
        keypad.add(numb8);
        keypad.add(numb9);
        keypad.add(numbStar);
        keypad.add(numb0);
        keypad.add(numbSharp);

        return (ArrayList<String>) keypad;
    }

    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];

    }



}
