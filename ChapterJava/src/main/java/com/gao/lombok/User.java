package com.gao.lombok;
import lombok.*;
import lombok.experimental.Accessors;
import java.util.Date;
@Data
@Accessors(chain = true)
public class User {
    private String id;
    private String name;
    private Integer age;
    private Date bir;
}
