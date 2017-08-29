package com.streetbuzz.microservices.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by duttas16 on 7/19/2017.
 */

@Data
public class TestPojo implements Serializable {
    private String name;
    private Integer points;
    private List<String> socialMediaList;
}
