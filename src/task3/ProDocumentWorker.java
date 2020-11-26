package task3;

public class ProDocumentWorker extends DocumentWorker{

    @Override
    void editDocument() {
        System.out.println("Document edited");
    }

    @Override
    void saveDocument() {
        System.out.println("Document is saved, but saving in new format is allowed in expert version");
    }
}
