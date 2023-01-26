package spring.nh.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Db_entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;

    @Column(length = 500, nullable = true)
    private String name;

    @Column(length = 500, nullable = true)
    private String phone_number;

//    @Column(length = 500, nullable = false)
//    private String address;
//
//    @Column(length = 500, nullable = false)
//    private Long Sales_amount;
//
//    @Column(length = 500, nullable = false)
//    private Long Selling_price;
//
//    @Column(length = 500, nullable = true)
//    private Long discount_goods;
//
//    @Column(length = 500, nullable = false)
//    private Long Payment_amount;
//
//    @Column(length = 500, nullable = true)
//    private Long ShippingCost;
//
//    @Column(length = 500, nullable = true)
//    private Long ShippingCost_discount;
//
//    @Column(length = 500, nullable = true)
//    private Long Payment_amounts;
//
//    @Column(length = 500, nullable = true)
//    private Long Total_sales;

}
