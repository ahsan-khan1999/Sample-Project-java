import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rounting {
    private String routes;



    String pickUpRoute[] = {"Maymar"};
    String dropOfRoutes[] = {"Stadium","Karsaz","Shahra-e-Faisal","WaterPump","Tariq Road"};

    public void displayRoutes(){
        for(int i = 0 ;i < pickUpRoute.length  ; i++){
            System.out.println("t\t\t\t\t\t\t\t\t\t\t\t\tPick Up Route : \t"+pickUpRoute[i]);
        }
        for(int i = 0 ; i < dropOfRoutes.length ; i++){
            System.out.println("Drop Of Route : \t"+dropOfRoutes[i]);
        }

    }




//        dropOfRoutes[0] = "Stadium";
//        dropOfRoutes[1] = "Pib Colony";
//        dropOfRoutes[2]= "Shahra-e-Faisal";
//        dropOfRoutes[3] = "Cant";
//        dropOfRoutes[4] = "Water Pump";

//


//    public String validRoutes(){
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add(0,"Maymar");
//        arrayList.add(1,"Nipa");
//        return arrayList.get(0)+arrayList.get(1);
//    }

//    public void addNewRoutes(){
//
//    }
//    public void showRoutes(){
//        for(int i = 0 ; i < pickUpRoute.length ; i++){
//            System.out.println("pick up routes \t\t"+pickUpRoute[i]);
//        }
//        for(int i = 0 ; i < dropOfRoutes.length ; i++){
//            System.out.println("Drop Of Point \t\t"+dropOfRoutes[i]);
//        }
//
//
//            }

}






































//        java.io.File file = new java.io.File("C:\\Users\\Ahsan Khan\\IdeaProjects\\Buses Routing Plan\\MyJava.txt");
//        String path = file.getAbsolutePath();
//        System.out.println(path);
//        Scanner scanner = new Scanner("MyJava.txt");
//        while (scanner.hasNext()){
//            String a =scanner.next();
//            System.out.println(a);
//        }
//        PrintWriter printWriter = new PrintWriter("C:\\Users\\Ahsan Khan\\IdeaProjects\\Buses Routing Plan\\MyJava.txt");
//
//        FileInputStream in = null;
//        FileOutputStream out = null;
//
//        try{
//            in = new FileInputStream("input.txt");
//            out = new FileOutputStream("output.txt");
//
//            int c;
//            while ((c=in.read())!= -1){
//                out.write(c);
//            }
//
//        }
//        finally {
//            if(in != null){
//                in.close();
//            }
//            if(out != null){
//                out.close();
//            }
//        }
//





//        try {
//            File file = new File("Desktop\\file\\myJava.java");
//            boolean fileExists = file.exists();
//            PrintWriter printWriter = new PrintWriter(file);
//        }
//        catch (FileNotFoundException e){
//            System.out.println("file not found");
//        }
//        finally {
//            File file1 = new File("Desktop\\file\\myJava.txt");
//            boolean fileExists = file1.exists();
//            System.out.println("created");
//    }





