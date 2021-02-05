//package quiz5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Calculate {
    Stack stack2 = new Stack();

    public void calculate(ArrayList<Integer> decimals) throws IOException {
        int element2=0;
        int decimal;
        int i=0;
        i=0;
        for(int element1 : decimals){
            while(element1 != 0){
                element2 = element1 / 8;
                decimal = element1 % 8;
                element1 = element2;
                stack2.push(decimal);
            }
            writer(stack2);
        }
    }

    public void writer(Stack stack2) throws IOException {
        int i;
        FileWriter fileWriter = new FileWriter("octal.txt", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        i=0;
        while(i<stack2.size()){
            printWriter.print(stack2.pop());
        }
        printWriter.print("\n");
        printWriter.close();
    }

}
