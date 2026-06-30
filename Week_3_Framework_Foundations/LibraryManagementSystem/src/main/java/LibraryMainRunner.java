import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryMainRunner {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("      BOOTSTRAPPING WEEK 3 SPRING CONTAINER       ");
        System.out.println("==================================================");

        // 1. Initialize Spring IoC Context Container (Exercise 1)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");

        System.out.println("\n--- Fetching Service Bean from Container Context ---");
        // 2. Retrieve configured Bean with Dependency Injection (Exercise 2)
        BookService libraryService = (BookService) context.getBean("bookService");

        // 3. Execute Service (This automatically triggers AOP Logging Interceptors from Exercise 3)
        libraryService.executeLibraryService();

        System.out.println("==================================================");
        System.out.println("   SPRING BOOTSTRAP PIPELINE RUN COMPLETED SUCCESS ");
        System.out.println("==================================================");
        
        // Clean container teardown
        context.close();
    }
}