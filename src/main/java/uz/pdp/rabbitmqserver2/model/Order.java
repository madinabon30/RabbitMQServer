package uz.pdp.rabbitmqserver2.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {

    private int id;
    private String date;
    private double price;
    private int status;


}
