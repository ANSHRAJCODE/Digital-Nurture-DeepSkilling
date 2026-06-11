package Week_1_Engineering_Concepts.DesignPatternsMaster;

public class Test {
    public static void main(String[] args) {
        System.out.println("=== RUNNING METTL PATTERNS TEST ENGINE ===\n");

        // Ex 2: Factory Method
        DocumentFactory docFactory = new PdfFactory();
        docFactory.createDocument().open();

        // Ex 3: Builder
        Computer pc = new Computer.Builder().setCPU("M3 Max").setRAM("64GB").build();
        pc.show();

        // Ex 4: Adapter
        PaymentProcessor payment = new PayPalAdapter();
        payment.processPayment(1500.00);

        // Ex 5: Decorator
        Notifier alert = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        alert.send("Server Alert!");

        // Ex 6: Proxy
        Image proxyImg = new ProxyImage("photo.png");
        proxyImg.display(); // First call triggers lazy load log statement

        // Ex 7: Observer
        StockMarket market = new StockMarket();
        market.register(new MobileApp());
        market.setPrice(420.69);

        // Ex 8: Strategy
        PaymentContext context = new PaymentContext();
        context.setStrategy(new CreditCardPayment());
        context.executePayment(50.0);

        // Ex 9: Command
        RemoteControl remote = new RemoteControl();
        remote.setCommand(new LightOnCommand(new Light()));
        remote.pressButton();

        // Ex 10: MVC
        Student model = new Student();
        StudentController controller = new StudentController(model, new StudentView());
        controller.setStudentName("Ansh");
        controller.updateView();

        // Ex 11: Dependency Injection
        CustomerService service = new CustomerService(new CustomerRepositoryImpl());
        System.out.println("DI Retrieved: " + service.getCustomerName(1));
    }
}