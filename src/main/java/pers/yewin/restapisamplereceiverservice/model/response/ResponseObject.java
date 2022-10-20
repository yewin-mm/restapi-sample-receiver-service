package pers.yewin.restapisamplereceiverservice.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Ye Win
 * @created: 27/09/2022
 * @project: restapi-sample-receiver-service
 * @package: pers.yewin.restapisamplereceiverservice.model.response
 */

// this class will customize response class
@Data // for getter, setter and toString method by using lombok
@NoArgsConstructor // create default no argument constructor by using lombok
@AllArgsConstructor // create all argument constructor by using lombok
public class ResponseObject {
    private String timestamp;
    private StatusObject status;
}
