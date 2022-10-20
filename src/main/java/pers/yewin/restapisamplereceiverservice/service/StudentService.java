package pers.yewin.restapisamplereceiverservice.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import pers.yewin.restapisamplereceiverservice.model.entity.Student;
import pers.yewin.restapisamplereceiverservice.model.request.StringListObject;
import pers.yewin.restapisamplereceiverservice.model.request.StudentListObject;
import pers.yewin.restapisamplereceiverservice.model.response.Count;
import pers.yewin.restapisamplereceiverservice.model.response.ResponseObject;
import pers.yewin.restapisamplereceiverservice.model.response.ResponseObjectList;
import pers.yewin.restapisamplereceiverservice.model.response.StudentNameAndClass;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * @author: Ye Win
 * @created: 26/09/2022
 * @project: restapi-sample-receiver-service
 * @package: pers.yewin.restapisamplereceiverservice.service
 */

public interface StudentService {

    /** for response **/
    String responseSingleStringDemo();
    Count responseSingleObjectDemo();
    Student responseObjectDemo();
    List<String> responseStringListDemo();
    List<Student> responseObjectListDemo();
    List<StudentNameAndClass> responseCustomObjectListDemo();
    ResponseObject responseNestedObjectDemo();
    ResponseObjectList responseNestedObjectAndNestedObjectListDemo();


    /** for request **/
    void requestBodyObjectDemo(Student student);
    void requestBodyObjectListDemo(StudentListObject studentListObject);
    void requestBodyStringListDemo(StringListObject strListObject);
    void requestPathVariableIntegerDemo(Integer id);
    void requestMultiPathVariablesDemo(String profile, String name);
    void requestParamStringDemo(String name);
    void requestMultiParamsDemo(Long id, String name);
    void requestPathVariableAndParamsDemo(String accountName, String actionType);
    void requestFromHeaderDemo(Map<String, String> allHeadersMap);
    void requestFromHeaderAndRequestParamDemo(Map<String, String> allHeadersMap, String name);
    void requestFromHeaderAndRequestBodyDemo(Map<String, String> allHeadersMap, Student student);
    void requestFileUploadDemo(File file, String name);
    void requestFromHeaderAndBulkFileUploadDemo(List<MultipartFile> files);


    /** for both request and response **/
    Student requestPathVariableAndResponseObjectDemo(String action);
    List<Student> requestParamStringAndResponseObjectListDemo(String name, String phoneNo);
    ResponseObject requestFromHeaderAndRequestBodyAndResponseNestedObjectDemo(Map<String, String> allHeadersMap, Student student);
    ResponseObjectList requestFromHeaderAndRequestParamStringAndResponseNestedObjectListDemo(Map<String, String> allHeadersMap, String name, String phoneNo);
    ResponseObjectList requestFromHeaderAndPathVarAndParamsAndResponseNestedObjectListDemo(Map<String, String> allHeadersMap, String accountName, String cardType, Integer pageNo, Integer pageSize, String sortBy, String actionType);


    /** for error response sample **/
    ResponseObjectList errorBadRequestResponseDemo(String name, String phone);
    ResponseObjectList errorNotFoundResponseDemo(Integer id);
    ResponseObjectList errorInternalServerErrorResponseDemo(Student student);


}
