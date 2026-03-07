package model;

import java.math.BigDecimal;

public class Flight extends TourService {
    private String  origin;
    private String destination;
    private String flightNumber;
    private boolean baggageIncluded;

    @Override
    public BigDecimal calculateTotalPrice(int participants) {
        
        var totalPrice = getPrice().multiply(BigDecimal.valueOf(participants));
        return baggageIncluded ? totalPrice.multiply(new BigDecimal("1.3")) : totalPrice;
    }
}
