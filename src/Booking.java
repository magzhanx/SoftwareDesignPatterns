public class Booking {
    private final Room room;
    private final String customerName;
    private final boolean breakfastIncluded;




    private Booking(Builder builder) {
        this.room = builder.room;
        this.customerName = builder.customerName;
        this.breakfastIncluded = builder.breakfastIncluded;

    }

    public static class Builder {

        private Room room;
        private String customerName;
        private boolean breakfastIncluded;


        public Builder setRoom(Room room) {
            this.room = room;
            return this;
        }

        public Builder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder includeBreakfast(boolean breakfastIncluded) {
            this.breakfastIncluded = breakfastIncluded;
            return this;
        }


        public Booking build() {
            return new Booking(this);
        }
    }

    @Override
    public String toString() {
        return "Booking{" +
                "room=" + room +
                ", customerName='" + customerName + '\'' +
                ", breakfastIncluded=" + breakfastIncluded +
                '}';
    }
}
