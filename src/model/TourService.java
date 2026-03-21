package model;

import java.math.BigDecimal;

public abstract class TourService {
    private Integer id;
    private String name;

    public BigDecimal getPrice() {
        return price;
    }


    private BigDecimal price;
    private LocalDate from;
    private LocalDate to;
    public TourService(){}
    public TourService(BigDecimal price, LocalDate from,LocalDate to){
        this.price=price;
        this.from=from;
        this.to=to;

    }
    public LocalDate getFrom(){return from; }
    public LocalDate getTo(){return to; }


    public boolean isAvailableOn (LocalDate date ) {
         return from.isAfter(date) || to.isBefore(date);

    }
    public abstract BigDecimal calculateTotalPrice (int participants);
    public abstract String toString();



    public void setId(Integer id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setFrom(LocalDate from){
        this.from=from;
    }
    public void setPrice(BigDecimal price){
        this.price=price;
    }
    public void setTo(LocalDate to){
        this.to=to;
    }
    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }

}
