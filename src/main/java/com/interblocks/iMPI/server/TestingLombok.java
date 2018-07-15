package com.interblocks.iMPI.server;

/**
 * Created by dasunperera on 6/10/18.
 */


import lombok.AccessLevel;
import lombok.Setter;
import lombok.Data;
import lombok.ToString;

@Data public class TestingLombok {
    private final String name;
    @Setter(AccessLevel.PACKAGE) private int age;
    private double score;
    private String[] tags;


}
