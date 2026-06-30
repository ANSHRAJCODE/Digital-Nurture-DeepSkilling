package Week_1_Engineering_Concepts.Factory_Method;
interface Document {
    void open();
    void close();
}

class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document (.docx)...");
    }
    @Override
    public void close() {
        System.out.println("Closing Word Document.");
    }
}

class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document (.pdf)...");
    }
    @Override
    public void close() {
        System.out.println("Closing PDF Document.");
    }
}

class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Spreadsheet (.xlsx)...");
    }
    @Override
    public void close() {
        System.out.println("Closing Excel Spreadsheet.");
    }
}
abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {
        System.out.println("=== Factory Method Pattern Test ===");

        // Test Word Factory
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.close();

        System.out.println("-----------------------------------");

        // Test PDF Factory
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.close();

        System.out.println("-----------------------------------");

        // Test Excel Factory
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.close();
    }
}