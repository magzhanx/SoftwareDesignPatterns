public class Main {
    public static void main(String[] args) {
        // Singleton pattern for database connection
        DatabaseConnectionManager dbManager = DatabaseConnectionManager.getInstance();
        dbManager.connect();

        // Create Room and ViewModel
        RoomViewModel roomViewModel = new RoomViewModel();
        Room room1 = new Room(101, "Deluxe");
        Room room2 = new Room(102, "Standard");
        Room room3 = new Room(103, "Standard");
        roomViewModel.addRoom(room1);
        roomViewModel.addRoom(room2);
        roomViewModel.addRoom(room3);

        // Facade pattern for hotel management
        PayPalService payPalService = new PayPalService();
        HotelManagementFacade hotelFacade = new HotelManagementFacade(roomViewModel);
        hotelFacade.displayAvailableRooms();
        Booking booking = hotelFacade.createBooking("Magzhan", room1, false);
        PayPalAdapter payPalAdapter = new PayPalAdapter(payPalService);

        System.out.println("Created Booking: " + booking);
        payPalAdapter.processPayment(100);

        // Observer pattern for order notifications
        Order order = new Order();
        Client client1 = new Client("Bob");
        Client client2 = new Client("John");
        order.addObserver(client1);
        order.addObserver(client2);
        order.notifyObservers("Order Confirmed");

        // Strategy pattern for pricing
        PricingStrategy distancePricing = new ByDistancePricing();
        PricingStrategy timePricing = new ByTimePricing();
        double price = timePricing.calculatePrice(25.0);
        System.out.println("Trip Price by Distance: $" + price);


        hotelFacade.displayAvailableRooms();
    }
}
