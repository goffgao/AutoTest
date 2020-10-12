package cn.wt.model;

import lombok.Data;

@Data
public class RecentlyDevelopCase {
    private int id;
    private String developPerson;
    private String touchPage;
    private String expected;

}
