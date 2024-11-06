public class HotelManagementFacade {
    private RoomViewModel roomViewModel;

    public HotelManagementFacade(RoomViewModel roomViewModel) {
        this.roomViewModel = roomViewModel;
    }

    public void displayAvailableRooms() {
        RoomView roomView = new RoomView(roomViewModel);
        roomView.displayAvailableRooms();
    }

    public Booking createBooking(String customerName, Room room, boolean breakfastIncluded) {
        return new Booking.Builder()
                .setCustomerName(customerName)
                .setRoom(room)
                .includeBreakfast(breakfastIncluded)
                .build();
    }
}
