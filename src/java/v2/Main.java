package v2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        //make sure to validate the arguments before using...
        if(args.length==0){
            System.out.println("Please provide the operation as an argument..");
            return;
        }

        //another validation that we could do to these args?
        //add, sub, mul
        String operation=args[0];
        if(!(operation.equals("add")||operation.equals("mul")||operation.equals("sub"))){
            System.out.println("provide add,sub or mul as the operator argument!");
            return;
        }

        System.out.println(args[0]);

        Files.readAllLines(Paths.get("C:\\Users\\tharu\\OneDrive\\Desktop\\software\\calculator\\src\\java\\numbers.txt"));


    }
}
