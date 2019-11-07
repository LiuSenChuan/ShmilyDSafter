package shmily.Entity;


import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;


/**
 * @program: ShmilyDS
 * @description:
 * @author: ShmilyLSC
 * @create: 2019-11-06 11:30
 **/


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shmily_shuff")
public class Shuff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OrderBy
    @Column(columnDefinition = "varchar(64) NOT NULL COMMENT '轮播图片name'  ")
    private String shuff_name;
    @Column(columnDefinition = "varchar(64) NOT NULL COMMENT '轮播图片'  ")
    private String shuff_URL;
    @Column(columnDefinition = "integer unsigned  COMMENT '权重'")
    private Integer shuff_weigh;
    @Column(columnDefinition = "datetime COMMENT '用户创建时间' ")
    private Date create_time;
    @Column(columnDefinition = "timestamp  COMMENT '最后一次修改时间'", nullable = false, updatable = false, insertable = false)
    private Timestamp update_time;
}
