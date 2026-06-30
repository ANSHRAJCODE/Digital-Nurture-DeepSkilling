import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 1. Automatically registers this repository bean using stereotype annotations
@Repository
class AnnotatedBookRepository {
    public void saveData() {
        System.out.println("[Exercise 4] AnnotatedBookRepository: Successfully saved data via Annotation Scanning!");
    }
}

// 2. Marks this service bean and requests automated constructor dependency injection
@Service
class AnnotatedBookService {
    private final AnnotatedBookRepository repository;

    // The @Autowired annotation tells Spring to automatically pass in the repository bean
    @Autowired
    public AnnotatedBookService(AnnotatedBookRepository repository) {
        this.repository = repository;
    }

    public void executeService() {
        System.out.println("[Exercise 4] AnnotatedBookService: Running business layer tracking...");
        repository.saveData();
    }
}

// 3. Execution Runner Class
public class Exercise4_AnnotationConfig {
    public static void main(String[] args) {
        System.out.println("=== Running Exercise 4: Annotation-Based Spring Configuration ===");
        
        // Initializing the context using your XML profile
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Extracting the service bean discovered by component-scanning
        AnnotatedBookService service = context.getBean(AnnotatedBookService.class);
        service.executeService();
        
        context.close();
    }
}