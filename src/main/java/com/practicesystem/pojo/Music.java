package com.practicesystem.pojo;


import lombok.*;

import java.sql.Time;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Music {
    private int id;
    private String name;
    private String singer;
    private Time duration;

}
