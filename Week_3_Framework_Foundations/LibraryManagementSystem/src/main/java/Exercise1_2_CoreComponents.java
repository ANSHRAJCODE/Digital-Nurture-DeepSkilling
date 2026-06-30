class BookRepository {
    public void saveData() {
        System.out.println("[Database] BookRepository: Successfully saved book record to the persistent layer.");
    }
}

class BookService {
    private BookRepository bookRepository;

    // Setter Method used by Spring Container for Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void executeLibraryService() {
        System.out.println("[Business Logic] BookService: Processing core data-checking operations...");
        bookRepository.saveData();
    }
}
