public class HotelReservation {
        private   String hotelName;
        private int  customerRate;

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getCustomerRate() {
        return customerRate;
    }

    public void setCustomerRate(int customerRate) {
        this.customerRate = customerRate;
    }

    HotelReservation(String name) {
            this.hotelName = name;
        }

    public HotelReservation(int customerRate) {
        this.customerRate = customerRate;
    }

    public String getHotelName() {
            return hotelName;
        }
    }





