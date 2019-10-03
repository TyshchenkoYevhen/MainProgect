package HomeWork5;

//import java.util.ArrayList;
//
//public class Task6 {
//    public static void main (String [] args) {
//        ArrayList<String> Str = new ArrayList<>();
//
//        Str.add("Jim Bob");
//        Str.add("Bobby Jones");
//        Str.add("Rob Stiles");
//        int largestString = Str.size();
//        int index = 0;
//
//        // Use for loop to print out elements from ArrayList
//        for(int i = 0; i < Str.size(); i++)
//        {  // Test which String is the largest
//            if(Str[i].size() > largestString)
//            {
//                largestString = Str[i].size();
//                index = i;
//            }
//
//        }
//        // Output largest String and index it was found at
//        System.out.println("Index " + index + " "+ Str[index] + " " + "is the largest and is size " + largestString);
//
//    }
//
//    }

import java.util.ArrayList;

class Task6 {
    public static void main(String args[]) {
        ArrayList<String> Str = new ArrayList<String>();
        Str.add("Yevhen");
        Str.add("Dmitriy");
        Str.add("Konstantin");
        Str.add("Pavel");
        Str.add("Valentin");
        Str.add("Alexandr");
        Str.add("Vladimir");
        Str.add("Leonid");
        Str.add("Antoniiiii");
        Str.add("Eduardikkо");
        int largestString = Str.get(0).length();
        int largestString2 = Str.get(0).length();
        int index = 0;

        for (int i = 0; i < Str.size(); i++) {
            if ((Str.get(i).length() > largestString)) {
                largestString = Str.get(i).length();
      //          index = i;
            }
        }
   //         System.out.println("Index " + index + " " + Str.get(index) + " " + "is the largest and is size " + largestString);

        for (int j = 0; j < Str.size(); j++) {
            if (largestString == Str.get(j).length()) {
               // index = j;
                System.out.println("Index " + j + " " + Str.get(j) + " " + "is the largest and is size " + largestString);
                }
            }
        }
    }







