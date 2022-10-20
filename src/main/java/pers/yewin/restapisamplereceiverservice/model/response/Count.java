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

@Data // create getter, setter and toString method by using lombok
@NoArgsConstructor // create default no argument constructor by using lombok
@AllArgsConstructor // create all argument constructor by using lombok
public class Count {
    private int totalCount;
}
