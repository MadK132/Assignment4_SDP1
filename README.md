# Assignment4_SDP1


1. Strategy Pattern: Payment Processing System
PaymentStrategy (Interface): Defines the processPayment(double amount) method to be implemented by different payment methods.
Concrete Strategies (CreditCardPayment, PayPalPayment, CryptoPayment): Implement the payment processing logic for each payment method.
ShoppingCart (Context): Manages the items and delegates the payment processing to a PaymentStrategy. Can switch strategies at runtime.
Main: Demonstrates the flexibility of changing payment methods dynamically.


2. Observer Pattern: Weather Monitoring System
WeatherStation (Subject): Holds weather data and notifies all registered observers whenever the data changes.
WeatherDisplay (Interface): Defines the update(temperature, humidity, pressure) method for observers to implement.
Concrete Displays (CurrentConditionsDisplay, StatisticsDisplay, ForecastDisplay): Different display types that update their information when the weather data changes.
WeatherData: Manages the WeatherStation and links it to the displays.
Main: Demonstrates the automatic updates of various displays when weather data is modified.


3. Command Pattern: Remote Control for Smart Home Devices
Command (Interface): Declares execute() and undo() methods that encapsulate device operations.
Concrete Commands (TurnTVOn, SetVolume, DimLights): Implement specific actions for different devices, such as turning on the TV or dimming the lights.
Receivers (TV, Stereo, Light): The actual smart devices that perform the actions when commands are executed.
RemoteControl: Stores commands and manages execution and undo operations.
Main: Demonstrates controlling different devices and the undo functionality.


4. State Pattern: Order Processing System
State (Interface): Declares actions like payOrder(), shipOrder(), deliverOrder(), and cancelOrder() that each state will handle differently.
Concrete States (NewState, PaidState, ShippedState, DeliveredState, CancelledState): Represent the various states of an order and implement state-specific behavior.
Order: Holds the current state of an order and delegates actions to the state. Can transition between states as necessary.
Main: Demonstrates how the order changes states through various actions like payment and shipping.


5. Chain of Responsibility: Expense Approval System
Approver (Base Class): Defines the handleRequest(ExpenseRequest request) method and holds a reference to the next approver in the chain.
Concrete Approvers (TeamLead, Manager, Director, CEO): Each approver can approve expenses up to a certain limit and passes the request to the next approver if necessary.
ExpenseRequest: Represents an expense request with an amount and purpose.
ApprovalChain: Sets up the chain of approvers and processes requests.
Main: Demonstrates handling various expense requests through the chain of approvers.


6. Mediator Pattern: Chat Room Application
ChatMediator (Interface): Declares methods for sending messages and adding users to the chat room.
ChatRoom (Concrete Mediator): Implements the mediator logic, handling message transmission between users.
User (Abstract Class): Defines methods for sending and receiving messages through the mediator.
Concrete Users (RegularUser, PremiumUser): Represent different types of users that interact through the mediator.
Main: Demonstrates users communicating through the chat room mediator.


7. Memento Pattern: Document Version Control System
Document (Originator): Represents the document being edited and can create and restore DocumentVersion objects (mementos) to manage its state.
DocumentVersion (Memento): Stores the state of the Document at a given point in time.
VersionControl (Caretaker): Manages the saved versions of the document, allowing the user to save, list, and restore specific versions.
Main: Demonstrates editing the document and managing its versions through save and restore actions.


8. Visitor Pattern: Shape Area Calculator
Shape (Interface): Declares the accept(Visitor visitor) method that allows a visitor to calculate its area.
Concrete Shapes (Circle, Rectangle, Triangle): Implement the accept() method to allow the Visitor to calculate the area for each specific shape.
Visitor (Interface): Declares visit methods for each shape type (e.g., visit(Circle circle), visit(Rectangle rectangle)).
AreaCalculator (Concrete Visitor): Implements the logic to calculate the area for each specific shape.
Drawing: Holds a collection of shapes and allows area calculation through the visitor.
Main: Demonstrates calculating the area of various shapes using the visitor.


9. Template Method Pattern: Report Generation System
ReportGenerator (Abstract Class): Defines the template method generateReport() that outlines the report generation process. Subclasses must implement steps like formatting the header, body, and footer.
Concrete Report Generators (PDFReportGenerator, HTMLReportGenerator): Implement the report formatting methods for different output formats (PDF, HTML, etc.).
Main: Demonstrates generating different types of reports while keeping the overall structure consistent.


10. Iterator Pattern: Playlist Management System
Playlist: Stores a collection of songs and provides methods to create different iterators.
Iterators (SequentialIterator, ShuffleIterator, GenreFilterIterator): Provide different traversal methods, such as sequential order, random order, or filtering by genre.
Song: Represents a song with properties like title and genre.
Main: Demonstrates traversing a playlist using different iterators, such as sequential and shuffled order.
