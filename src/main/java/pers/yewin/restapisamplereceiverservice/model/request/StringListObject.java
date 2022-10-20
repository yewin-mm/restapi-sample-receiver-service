package pers.yewin.restapisamplereceiverservice.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: Ye Win
 * @created: 27/09/2022
 * @project: restapi-sample-receiver-service
 * @package: pers.yewin.restapisamplereceiverservice.model.request
 */

@Data // for getter, setter and toString method by using lombok
@NoArgsConstructor // create default no argument constructor by using lombok
@AllArgsConstructor // create all argument constructor by using lombok
public class StringListObject {
    List<String> strListObject;
}
