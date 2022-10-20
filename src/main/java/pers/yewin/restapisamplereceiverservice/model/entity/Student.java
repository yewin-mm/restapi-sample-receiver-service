package pers.yewin.restapisamplereceiverservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Ye Win
 * @created: 27/09/2022
 * @project: restapi-sample-receiver-service
 * @package: pers.yewin.restapisamplereceiverservice.model.entity.Student
 */

// this class will be entity class which communicate with database
// here, my project is demo and I don't use Entity annotation from JPA to connect database.
@Data // create getter, setter and toString method by using lombok
@NoArgsConstructor // create default no argument constructor by using lombok
@AllArgsConstructor // create all argument constructor by using lombok
public class Student {

    private Long id;
    private String name;
    private String address;
    private String phone;
    private String className;

}
