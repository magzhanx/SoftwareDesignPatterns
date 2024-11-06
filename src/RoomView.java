public class RoomView {
    private RoomViewModel viewModel;

    public RoomView(RoomViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : viewModel.getAvailableRooms()) {
            System.out.println("Room Number: " + room.getRoomNumber() + " - Type: " + room.getType());
        }
    }
}
