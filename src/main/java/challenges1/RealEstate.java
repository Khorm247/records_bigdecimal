package challenges1;

public record RealEstate(String ad, int squareMeters, int roomCount, double price) {
    public RealEstate withPrice(double price){
        return new RealEstate(ad, squareMeters, roomCount, price);
    }
}


