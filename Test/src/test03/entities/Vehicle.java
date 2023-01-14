package test03.entities;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vehicle extends Object {
//    @NonNull
    private int a;
    @NonNull
    private int b;
//    @NonNull
    private String model;


}


