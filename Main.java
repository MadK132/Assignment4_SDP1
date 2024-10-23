public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(200);

        cart.setPaymentStrategy(new CryptoPayment());
        cart.checkout(300);



        WeatherStation station = new WeatherStation();
        WeatherDisplay currentDisplay = new CurrentConditionsDisplay();
        WeatherDisplay statsDisplay = new StatisticsDisplay();

        station.addDisplay(currentDisplay);
        station.addDisplay(statsDisplay);

        station.setWeatherData(80, 65, 30.4f);
        station.setWeatherData(82, 70, 29.2f);


        TV tv = new TV();
        Light light = new Light();

        Command tvOn = new TurnTVOn(tv);
        Command dimLights = new DimLights(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, tvOn);
        remote.setCommand(1, dimLights);

        remote.pressButton(0);
        remote.pressButton(1);
        remote.pressUndo();


        Order order = new Order();

        order.processOrder();

        order.setState(new PaidOrder());
        order.processOrder();

        order.setState(new ShippedOrder());
        order.processOrder();



        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        teamLead.approveExpense(500);
        teamLead.approveExpense(3000);
        teamLead.approveExpense(8000);
        teamLead.approveExpense(15000);



        Document doc = new Document();
        VersionControl versionControl = new VersionControl();

        doc.write("Version 1");
        versionControl.saveVersion(doc.save());

        doc.write("Version 2");
        versionControl.saveVersion(doc.save());

        doc.write("Version 3");

        System.out.println("Current Content: " + doc.read());

        doc.restore(versionControl.getVersion(0));
        System.out.println("Restored to Version 1: " + doc.read());

        doc.restore(versionControl.getVersion(1));
        System.out.println("Restored to Version 2: " + doc.read());



        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        Visitor areaCalculator = new AreaCalculator();

        circle.accept(areaCalculator);
        rectangle.accept(areaCalculator);
    }
}

