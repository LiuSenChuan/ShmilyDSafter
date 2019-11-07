package shmily.Entity;



import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * @program: ShmilyDS
 * @description:
 * @author: ShmilyLSC
 * @create: 2019-11-06 10:10
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shmilu_user")
public class User {
    /*
     * @Author shmily
     * @Description //TODO
     * @Date  2019/11/6
     * @Param 
     * @return 
     **/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OrderBy
    @Column(columnDefinition = "bigint(19) unsigned  COMMENT '用户id'")
    private Integer userId;
    @Column(columnDefinition = "varchar(64) NOT NULL COMMENT '用户名称'  ")
    private  String userName;
    @Column(columnDefinition = "varchar(11) NOT NULL COMMENT '用户电话'  ")
    private  String userTel;
    @Column(columnDefinition = "varchar(100) NOT NULL COMMENT '用户头像'  ")
    private String userHander;
    @Column(columnDefinition = "datetime COMMENT '用户创建时间' ")
    private Date create_time;
    @Column(columnDefinition = "timestamp  COMMENT '最后一次修改时间'", nullable = false, updatable = false, insertable = false)
    private Timestamp update_time;

}
