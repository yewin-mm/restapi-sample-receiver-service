package pers.yewin.restapisamplereceiverservice.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import pers.yewin.restapisamplereceiverservice.model.entity.AccountHistory;
import pers.yewin.restapisamplereceiverservice.model.entity.Student;
import pers.yewin.restapisamplereceiverservice.model.request.StringListObject;
import pers.yewin.restapisamplereceiverservice.model.request.StudentListObject;
import pers.yewin.restapisamplereceiverservice.model.response.*;
import pers.yewin.restapisamplereceiverservice.service.StudentService;

import java.io.File;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author: Ye Win
 * @created: 26/09/2022
 * @project: restapi-sample-receiver-service
 * @package: pers.yewin.restapisamplereceiverservice.service.impl
 */

@Slf4j // for logging by using lombok
@Service // create bean class
public class StudentServiceImpl implements StudentService {

    @Override
    public String responseSingleStringDemo() {
        // here, you can get this response data from database or can get data from others method depend on your application business logic.
        // here, I show as demo and don't do any other logic and return hard code values.

        return "Hello!";
    }

    @Override
    public Count responseSingleObjectDemo() {
        // here, you can get this response data from database or can get data from others method depend on your application business logic.
        // here, I show as demo and don't do any other logic and return hard code values.

        /**
         * you can create Count co = new Count();
         * and can set data by using co.setTotalCount(10);
         * and return that co object.
         *
         * But here, I added data by using constructor.
         * eg. Count co = new Count(10); and `return` that co object.
         * here, I didn't catch with that co variable and did return directly.
         **/
        return new Count(10);
    }


    @Override
    public Student responseObjectDemo() {

        // here, you can get this response data from database or can get data from others method depend on your application business logic.
        // here, I show as demo and don't do any other logic and return hard code values.

        /**
         * you can create Student stu = new Student();
         * and can set data by using stu.setName("Ye Win"); stu.setPhone, etc...
         * and return that stu object.
         *
         * But here, I added data by using constructor.
         * eg. Student stu = new Student(1L, "Ye Win", "Yangon", "+959123456789", "Room A"); and return that stu object.
         * here, I didn't catch with that stu variable and did return directly.
         **/
        return new Student(1L, "Ye Win", "Yangon", "+959123456789", "Room A");
    }


    // this method is like return Item List or Student Name list or etc.
    @Override
    public List<String> responseStringListDemo() {

        // here, you can get this response data from database or can get data from others method depend on your application business logic.
        // here, I show as demo and don't do any other logic and return hard code values.

        /**
         * you can create List<String> strList = new ArrayList<String>();
         * and can set data by using strList.add("Ye Win"); strList.add("Mg Mg"), etc..
         * and return that stuList object.
         *
         * But here, I added data by using Arrays.asList,
         * eg. List<String> strList = Arrays.asList("Ye Win", "Mr. Ye Win"); and return that strList.
         * here, I didn't catch with that strList variable and return directly.
         **/
        return Arrays.asList("Ye Win", "Mr. Ye Win");
    }


    // this method is like findAll
    @Override
    public List<Student> responseObjectListDemo() {

        // here, you can get this response data from database or can get data from others method depend on your application business logic.
        // here, I show as demo and don't do any other logic and return hard code values.

        /**
         * Here, we can do three ways to add into list object.
         * 1.
         * create List<Student> stuList = new ArrayList<Student>();
         * and create one or many student object,
         * eg. Student stu1 = new Student(); and Student stu2 = new Student();
         * and add data into that objects by using setter method
         * eg. stu1.setName("AA"), set other fields and stu2.setName("BB"), set other fields.
         * and add that objects into stuList.eg. stuList.add(stu1); stuList.add(stu2);
         *
         * 2.
         * create List<Student> stuList = new ArrayList<Student>();
         * and you can create Student object by using constructor directly rather than using above setter method.
         * eg. Student stu1 = new Student(1L, "Ye Win", "Yangon", "+959123456789", "Room A");
         * eg. Student stu2 = new Student(1L, "Mg Mg", "Yangon", "+959123456789", "Room A");
         * and add that objects into stuList.eg. stuList.add(stu1); stuList.add(stu2);
         *
         * 3.
         * Create objects by using constructor or setter method
         * eg. Student stu1 = new Student(1L, "Ye Win", "Yangon", "+959123456789", "Room A"); Student stu2 = new Student(2L, "Mg Mg", "Yangon", "+959123456789", "Room A")
         * Or Student stu1 = new Student(); stu1.setName, etc..; Student stu2 = new Student(); stu2.setName, etc..
         * Create List by using Arrays.AsList and add above objects,
         * eg. List<Student> stuList = Arrays.asList(stu1, stu2);
         *
         * Return that stuList Object.
         *
         * But here, I added data into list by using Arrays.asList and constructor.
         * eg. List<Student> stuList =
         *                 Arrays.asList(new Student(1L, "Ye Win", "Yangon", "+959123456789", "Room A"),
         *                             new Student(2L, "Mg Mg", "Yangon", "+959123456789", "Room B"));
         * and return that stuList.
         * here, I didn't catch with that stuList variable and return directly.
         **/

        return Arrays.asList(new Student(1L, "Ye Win", "Yangon", "+959123456789", "Room A"),
                            new Student(2L, "Mg Mg", "Mandalay", "+959123456789", "Room B"),
                            new Student(3L, "Aung Aung", "NayPyiTaw", "+959123456789", "Room C"));

    }


    @Override
    public List<StudentNameAndClass> responseCustomObjectListDemo() {

        // here, you can get this response data from database or can get data from others method depend on your application business logic.
        // here, I show as demo and don't do any other logic and return hard code values.

        // here, I added data by using Arrays.asList and constructor object like above method.
        return Arrays.asList(new StudentNameAndClass("Ye Win", "Room A"),
                new StudentNameAndClass("Maung Maung", "Room B"),
                new StudentNameAndClass("Aung Aung", "Room C"));
    }


    // response custom status
    @Override
    public ResponseObject responseNestedObjectDemo() {

        // here, you can get this response data from database or can get data from others method depend on your application business logic.
        // here, I show as demo and don't do any other logic and return hard code values.

        String timestamp = Instant.now().toString(); // current time
        StatusObject status = new StatusObject("SUCCESS", "No Error");

        ResponseObject response = new ResponseObject(timestamp, status); // set data by using constructor
        return response; // you can directly return above new ResponseObject
    }


    // response custom response object with status
    @Override
    public ResponseObjectList responseNestedObjectAndNestedObjectListDemo() {

        // here, you can get this response data from database or can get data from others method depend on your application business logic.
        // here, I show as demo and don't do any other logic and return hard code values.

        String timestamp = Instant.now().toString(); // current time
        StatusObject status = new StatusObject("SUCCESS", "No Error");

        List<Student> stuList = Arrays.asList(new Student(1L, "Ye Win", "Yangon", "+959123456789", "Room A"),
                new Student(2L, "Mg Mg", "Mandalay", "+959123456789", "Room B"),
                new Student(3L, "Aung Aung", "NayPyiTaw", "+959123456789", "Room C"));

        ResponseObjectList response = new ResponseObjectList(timestamp, status, stuList);
        return response; // you can directly return above new ResponseObjectList
    }


    // this method is like create api, (eg. signup, create user, create form, etc...)
    @Override
    public void requestBodyObjectDemo(Student student) {

        // here, you can save into db this requested data or do your logic depend on your application business logic.
        // here, I show as demo and don't do insert into db or any other logic

    }


    // this method is like create many users (eg. bulk upload data, etc...)
    @Override
    public void requestBodyObjectListDemo(StudentListObject studentListObject) {

        // here, you can save into db this requested data or do your logic depend on your application business logic.
        // here, I show as demo and don't do insert into db or any other logic

    }


    // this method is like build single item upload (eg. upload many roles in one api, etc...)
    @Override
    public void requestBodyStringListDemo(StringListObject strListObject) {

        // here, you can save into db this requested data or do your logic depend on your application business logic.
        // here, I show as demo and don't do insert into db or any other logic

    }


    // this method is like find by id, here I don't return data as this is demo.
    @Override
    public void requestPathVariableIntegerDemo(Integer id) {

        // here, you can find from db this requested data and can response desire data or do your logic depend on your application business logic.
        // here, I show as demo and don't do insert into db or any other logic

    }


    // this method is like find by profile and name, here I don't return data as this is demo.
    @Override
    public void requestMultiPathVariablesDemo(String profile, String name) {

        // here, you can find from db this requested data and can response desire data or do your logic depend on your application business logic.
        // here, I show as demo and don't do insert into db or any other logic

    }


    @Override
    public void requestParamStringDemo(String name) {

        // here, you can find from db this requested data and can response desire data or do your logic depend on your application business logic.
        // here, I show as demo and don't do insert into db or any other logic


    }

    // that is like update name field only on database which name are matched with id (update name by id)
    @Override
    public void requestMultiParamsDemo(Long id, String name) {

        // here, you can find from db this requested data and can response desire data or do your logic depend on your application business logic.
        // here, I show as demo and don't do insert into db or any other logic

    }

    @Override
    public void requestPathVariableAndParamsDemo(String accountName, String actionType) {

        // here, you can validate this requested data or do your logic depend on your application business logic.
        // here, I show as demo and don't do insert into db or any other logic

    }


    @Override
    public void requestFromHeaderDemo(Map<String, String> allHeadersMap) {

        // here, you can validate this requested data or do your logic depend on your application business logic.
        // here, I show as demo and don't do insert into db or any other logic

    }


    @Override
    public void requestFromHeaderAndRequestParamDemo(Map<String, String> allHeadersMap, String name) {

        // here, you can validate this requested data and can find from db this requested data and can response desire data or do your logic depend on your application business logic.
        // here, I show as demo and don't do insert into db or any other logic

    }


    @Override
    public void requestFromHeaderAndRequestBodyDemo(Map<String, String> allHeadersMap, Student student) {

        // here, you can validate this requested data and can save into db this requested data or do your logic depend on your application business logic.
        // here, I show as demo and don't do insert into db or any other logic

    }

    @Override
    public void requestFileUploadDemo(File file, String name) {

        // here, you can read that request file and convert bytes and save into db or upload into file server or sending as email attachment or do your logic depend on your application business logic.
        // here, I show as demo and don't do any other logic

    }


    @Override
    public void requestFromHeaderAndBulkFileUploadDemo(List<MultipartFile> files) {

        // here, you can read that request file and convert bytes and save into db or upload into file server or sending as email attachment or do your logic depend on your application business logic.
        // here, I show as demo and don't do any other logic

    }


    // this method is like find by id
    @Override
    public Student requestPathVariableAndResponseObjectDemo(String action) {

        // here, you can find from database as per this requested data (id) or do your logic depend on your application business logic.
        // here, you can get this response data from database or can get data from others method depend on your application business logic.
        // here, I show as demo and don't do any other logic and return hard code values.

        return new Student(1L, "Ye Win", "Yangon", "+959123456789", "Room A");
    }


    // this method is like find by name and phoneNo
    @Override
    public List<Student> requestParamStringAndResponseObjectListDemo(String name, String phoneNo) {

        // here, you can find from database as per this requested data (name, phoneNo) or do your logic depend on your application business logic.
        // here, you can get this response data from database or can get data from others method depend on your application business logic.
        // here, I show as demo and don't do any other logic and return hard code values.

        return Arrays.asList(new Student(1L, "Ye Win", "Yangon", "+959123456789", "Room A"),
                new Student(2L, "Mg Mg", "Mandalay", "+959123456789", "Room B"),
                new Student(3L, "Aung Aung", "NayPyiTaw", "+959123456789", "Room C"));
    }


    // this method is like validate token and if valid, save data
    @Override
    public ResponseObject requestFromHeaderAndRequestBodyAndResponseNestedObjectDemo(Map<String, String> allHeadersMap, Student student) {

        // here, you can save into database as per this requested data (student) or do your logic depend on your application business logic.
        // here, you can get this response data from database or can get data from others method depend on your application business logic.
        // here, I show as demo and don't do any other logic and return hard code values.

        // get header value, example field and field name is depend on your application logic.
        String accessToken = allHeadersMap.get("authorization");
        log.info("accessToken: {}", accessToken);

        // you can do other things that header value depend on you logic.
        // eg. check accessToken is valid or not.
        // eg. if valid accessToken, do your logic like insert requested data into db
        // eg. if invalid accessToken, return error with status fail.
        // you can get other header values as depend on your application business logic.

        String timestamp = Instant.now().toString(); // current time
        StatusObject status = new StatusObject("SUCCESS", "No Error");

        ResponseObject response = new ResponseObject(timestamp, status); // set data by using constructor
        return response; // you can directly return above new ResponseObject

    }


    // this method is like validate token and if valid, find by name and phoneNo
    @Override
    public ResponseObjectList requestFromHeaderAndRequestParamStringAndResponseNestedObjectListDemo(Map<String, String> allHeadersMap, String name, String phoneNo) {

        // here, you can find from database as per this requested data (name, phoneNo) or do your logic depend on your application business logic.
        // here, you can get this response data from database or can get data from others method depend on your application business logic.
        // here, I show as demo and don't do any other logic and return hard code values.

        // get header value, example field and field name is depend on your application logic.
        String accessToken = allHeadersMap.get("authorization");
        log.info("accessToken: {}", accessToken);

        // you can do other things that header value depend on you logic.
        // eg. check accessToken is valid or not.
        // eg. if valid accessToken, do your logic like insert requested data into db
        // eg. if invalid accessToken, return error with status fail.
        // you can get other header values as depend on your application business logic.

        String timestamp = Instant.now().toString(); // current time
        StatusObject status = new StatusObject("SUCCESS", "No Error");

        List<Student> stuList = Arrays.asList(new Student(1L, "Ye Win", "Yangon", "+959123456789", "Room A"),
                new Student(2L, "Mg Mg", "Mandalay", "+959123456789", "Room B"),
                new Student(3L, "Aung Aung", "NayPyiTaw", "+959123456789", "Room C"));

        ResponseObjectList response = new ResponseObjectList(timestamp, status, stuList);
        return response; // you can directly return above new ResponseObjectList

    }


    // this method is like validate token and if valid, find by account name, card type and action type
    @Override
    public ResponseObjectList requestFromHeaderAndPathVarAndParamsAndResponseNestedObjectListDemo(Map<String, String> allHeadersMap, String accountName, String cardType, Integer pageNo, Integer pageSize, String sortBy, String actionType) {
        // here, you can find from database as per this requested data (name, phoneNo) or do your logic depend on your application business logic.
        // here, you can get this response data from database or can get data from others method depend on your application business logic.
        // here, I show as demo and don't do any other logic and return hard code values.

        // get header value, example field and field name is depend on your application logic.
        String accessToken = allHeadersMap.get("authorization");
        log.info("accessToken: {}", accessToken);

        // you can do other things that header value depend on you logic.
        // eg. check accessToken is valid or not.
        // eg. if valid accessToken, do your logic like insert requested data into db
        // eg. if invalid accessToken, return error with status fail.
        // you can get other header values as depend on your application business logic.

        String timestamp = Instant.now().toString(); // current time
        StatusObject status = new StatusObject("SUCCESS", "No Error");

        // below code is demo retrieving data from database with pageable
        /**
         * Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
         * // you can use slice for better performance if you don't need to know total pageSize
         * Page<AccountHistory> pagedResult = repository.findByAccountNameAndServiceType(accountName, actionType, paging);
         * if(pagedResult.hasContent())
         *      return pagedResult.getContent();
         * else return new ArrayList<AccountHistory>();
         *
        */

        // below values may get from database or somewhere like api response by calling others or others method response.
        // but, this is demo project and so, I return hard coded values.
        List<AccountHistory> accountHistoriesList = Arrays.asList(new AccountHistory(1L, "Ye Win", "VISA", "Bill", "+959123456789", "Yangon", "02/09/2022 10:03:23", "1000"),
                new AccountHistory(2L, "Ye Win", "VISA", "Bill", "+959123456789", "Yangon", "10/09/2022 15:30:09", "5000"),
                new AccountHistory(3L, "Ye Win", "VISA", "Bill", "+959123456789", "Yangon", "19/09/2022 13:20:56", "2000"));

        ResponseObjectList response = new ResponseObjectList(timestamp, status, accountHistoriesList);
        return response; // you can directly return above new ResponseObjectList
    }

    @Override
    public ResponseObjectList errorBadRequestResponseDemo(String name, String phone) {

        // here, you can do your logic
        // if your validation wasn't right as you expected, you can return error.

        // do you logic eg. checking input, retrieving from db, comparing data, etc...
        // here, I show as demo and don't do any other logic and will return error only.

        String timestamp = Instant.now().toString(); // current time
        StatusObject status = new StatusObject("FAIL", "Input is something wrong");
        return new ResponseObjectList(timestamp, status, null);
    }

    @Override
    public ResponseObjectList errorNotFoundResponseDemo(Integer id) {

        // here, you can do your logic
        // if your validation wasn't right as you expected, you can return error.

        // do you logic eg. checking input, retrieving from db, comparing data, etc...
        // here, I show as demo and don't do any other logic and will return error only.

        String timestamp = Instant.now().toString(); // current time
        StatusObject status = new StatusObject("FAIL", "Input is something wrong");
        return new ResponseObjectList(timestamp, status, null);
    }

    @Override
    public ResponseObjectList errorInternalServerErrorResponseDemo(Student student) {
        // here, you can do your logic
        // if your validation wasn't right as you expected, you can return error.

        // do you logic eg. checking input, retrieving from db, comparing data, etc...
        // here, I show as demo and don't do any other logic and will return error only.

        // internal server error is mostly return when system error from catch block like null pointer, etc..

        String timestamp = Instant.now().toString(); // current time
        StatusObject status = new StatusObject("FAIL", "Input is something wrong");
        return new ResponseObjectList(timestamp, status, null);
    }


}
