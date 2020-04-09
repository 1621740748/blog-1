package com.dsy.blog.modelEntity;

import lombok.*;

/**
 * Created on 2020/4/9
 * Package com.dsy.blog.modelEntity
 *
 * @author dsy
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TypeTops {
    private Integer typeId;
    private String name;
    private Integer blogNumber;
}
