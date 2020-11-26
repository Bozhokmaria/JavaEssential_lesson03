package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your key word (pro/exp/else)");
        String key = scanner.next();


        if (key.equalsIgnoreCase("pro")){
            System.out.println("Pro version");
            DocumentWorker pro = new ProDocumentWorker();
            pro.openDocument();
            pro.editDocument();
            pro.saveDocument();
        } else if (key.equalsIgnoreCase("exp")){
            System.out.println("Exp version");
            DocumentWorker exp = new ExpertDocumentWorker();
            exp.openDocument();
            exp.editDocument();
            exp.saveDocument();
        } else {
            System.out.println("Standard version");
            DocumentWorker doc = new DocumentWorker();
            doc.openDocument();
            doc.editDocument();
            doc.saveDocument();
        }


    }
}
