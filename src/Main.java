public class Main {
    public static void main(String[] args) {
        // Singleton pattern for database connection
        DatabaseConnectionManager dbManager = DatabaseConnectionManager.getInstance();
        dbManager.connect();

        // Create Room and ViewModel
        RoomViewModel roomViewModel = new RoomViewModel();
        Room room1 = new Room(101, "Deluxe");
        Room room2 = new Room(102, "Standard");
        roomViewModel.addRoom(room1);
        roomViewModel.addRoom(room2);

        // Facade pattern for hotel management
        HotelManagementFacade hotelFacade = new HotelManagementFacade(roomViewModel);
        hotelFacade.displayAvailableRooms();
        Booking booking = hotelFacade.createBooking("John Doe", room1, true);
        System.out.println("Created Booking: " + booking);

        // Observer pattern for order notifications
        Order order = new Order();
        Client client = new Client("Alice");
        order.addObserver(client);
        order.notifyObservers("Order Confirmed");

        // Strategy pattern for pricing
        PricingStrategy distancePricing = new ByDistancePricing();
        double price = distancePricing.calculatePrice(20.0);
        System.out.println("Trip Price by Distance: $" + price);


    }
}
