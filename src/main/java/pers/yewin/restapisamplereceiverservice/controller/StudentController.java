package pers.yewin.restapisamplereceiverservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pers.yewin.restapisamplereceiverservice.model.entity.Student;
import pers.yewin.restapisamplereceiverservice.model.request.StringListObject;
import pers.yewin.restapisamplereceiverservice.model.request.StudentListObject;
import pers.yewin.restapisamplereceiverservice.model.response.Count;
import pers.yewin.restapisamplereceiverservice.model.response.ResponseObject;
import pers.yewin.restapisamplereceiverservice.model.response.ResponseObjectList;
import pers.yewin.restapisamplereceiverservice.model.response.StudentNameAndClass;
import pers.yewin.restapisamplereceiverservice.service.StudentService;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

/**
 * @author: Ye Win
 * @created: 26/09/2022
 * @project: restapi-sample-receiver-service
 * @package: pers.yewin.restapisamplereceiverservice.controller
 */

@RestController // for rest endpoint
@Slf4j // for logging by using lombok
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/responseSingleStringDemo")
    public ResponseEntity<String> responseSingleStringDemo(){

        try{
            log.info("Enter responseSingleStringDemo method");

            String str = studentService.responseSingleStringDemo();
            log.info("Response data: {}", str);

            log.info("Exit responseSingleStringDemo method");
            return ResponseEntity.ok().body(str); // return ok response with body
            // here you can return like that ->
            // return new ResponseEntity(str, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/responseSingleObjectDemo")
    public ResponseEntity responseSingleObjectDemo(){

        try{
            log.info("Enter responseSingleObjectDemo method");

            Count dbCount = studentService.responseSingleObjectDemo();
            log.info("Response data: {}", dbCount);

            log.info("Exit responseSingleObjectDemo method");
            return ResponseEntity.ok().body(dbCount); // return ok response with body
            // here you can return like that ->
            // return new ResponseEntity(dbCount, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/responseObjectDemo")
    public ResponseEntity<Student> responseObjectDemo(){

        try{
            log.info("Enter responseObjectDemo method");

            Student dbStudent = studentService.responseObjectDemo();
            log.info("Response data: {}", dbStudent);

            log.info("Exit responseObjectDemo method");
            return ResponseEntity.ok().body(dbStudent);
            // here you can return like that ->
            // return new ResponseEntity(dbStudent, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/responseStringListDemo")
    public ResponseEntity responseStringListDemo(){

        try{
            log.info("Enter responseStringListDemo method");

            List<String> dbStringList = studentService.responseStringListDemo();
            log.info("Response data: {}", dbStringList);

            log.info("Exit responseStringListDemo method");
            return ResponseEntity.ok().body(dbStringList);
            // here you can return like that ->
            // return new ResponseEntity(dbStringList, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/responseObjectListDemo")
    public ResponseEntity responseObjectListDemo(){

        try{
            log.info("Enter responseObjectListDemo method");

            List<Student> dbStudentList = studentService.responseObjectListDemo();
            log.info("Response data: {}", dbStudentList);

            log.info("Exit responseObjectListDemo method");
            return ResponseEntity.ok().body(dbStudentList);
            // here you can return like that ->
            // return new ResponseEntity(dbStudentList, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/responseCustomObjectListDemo")
    public ResponseEntity responseCustomObjectListDemo(){

        try{
            log.info("Enter responseCustomObjectListDemo method");

            List<StudentNameAndClass> dbStuNameAndClassList = studentService.responseCustomObjectListDemo();
            log.info("Response data: {}", dbStuNameAndClassList);

            log.info("Exit responseObjectListDemo method");
            return ResponseEntity.ok().body(dbStuNameAndClassList);
            // here you can return like that ->
            // return new ResponseEntity(dbStuNameAndClassList, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/responseNestedObjectDemo")
    public ResponseEntity responseNestedObjectDemo(){

        try{
            log.info("Enter responseNestedObjectDemo method");

            ResponseObject responseObject = studentService.responseNestedObjectDemo();
            log.info("Response data: {}", responseObject);

            log.info("Exit responseNestedObjectDemo method");
            return ResponseEntity.ok().body(responseObject);
            // here you can return like that ->
            // return new ResponseEntity(responseObject, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/responseNestedObjectAndNestedObjectListDemo")
    public ResponseEntity responseNestedObjectAndNestedObjectListDemo(){

        try{
            log.info("Enter responseNestedObjectAndNestedObjectListDemo method");

            ResponseObjectList responseObjectList = studentService.responseNestedObjectAndNestedObjectListDemo();
            log.info("Response data: {}", responseObjectList);

            log.info("Exit responseNestedObjectAndNestedObjectListDemo method");
            return ResponseEntity.ok().body(responseObjectList);
            // here you can return like that ->
            // return new ResponseEntity(responseObjectList, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @PostMapping("/requestBodyObjectDemo")
    public ResponseEntity requestBodyObjectDemo(@RequestBody Student student){

        try{
            log.info("Enter requestBodyObjectDemo method");
            log.info("request body data, student: {}", student);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            studentService.requestBodyObjectDemo(student);

            URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/receiver-service/api/requestBodyObjectDemo").toUriString());
            log.info("Exit requestBodyObjectDemo method");
//            return ResponseEntity.created(uri).body(dbStudent);  // if need to return data as body
            return ResponseEntity.created(uri).build();
            // here you can return like that ->
            // return new ResponseEntity(HttpStatus.CREATED); or -> return new ResponseEntity(dbStudent, HttpStatus.CREATED);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @PostMapping("/requestBodyObjectListDemo")
    public ResponseEntity requestBodyObjectListDemo(@RequestBody StudentListObject studentListObject){

        try{
            log.info("Enter requestBodyObjectListDemo method");
            log.info("request body object list, studentList: {}", studentListObject);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            studentService.requestBodyObjectListDemo(studentListObject);

            log.info("Exit requestBodyObjectListDemo method");
            return ResponseEntity.ok().build(); // return ok response without body
            // here you can return like that ->
            // return new ResponseEntity(HttpStatus.OK); or -> return new ResponseEntity(data, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @PostMapping("/requestBodyStringListDemo")
    public ResponseEntity requestBodyStringListDemo(@RequestBody StringListObject stringListObject){

        try{
            log.info("Enter requestBodyStringListDemo method");
            log.info("request body string list, itemList: {}", stringListObject);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            studentService.requestBodyStringListDemo(stringListObject);
            log.info("Exit requestBodyStringListDemo method");
            return ResponseEntity.ok().build();

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/requestPathVariableIntegerDemo/{id}")
    public ResponseEntity requestPathVariableIntegerDemo(@PathVariable Integer id){

        try{
            log.info("Enter requestPathVariableIntegerDemo method");
            log.info("request path variable value, id: {}", id);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            studentService.requestPathVariableIntegerDemo(id);

            log.info("Exit requestPathVariableIntegerDemo method");
//            return ResponseEntity.ok().body(dbStudent); // if need to return data as body
            return ResponseEntity.ok().build(); // return ok response without body
            // here you can return like that ->
            // return new ResponseEntity(HttpStatus.OK); or -> return new ResponseEntity(dbStudent, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/requestMultiPathVariablesDemo/{profile}/{name}")
    public ResponseEntity requestMultiPathVariablesDemo(@PathVariable String profile, @PathVariable String name){
        // you can also request combinations of int type and string type too.
        try{
            log.info("Enter requestMultiPathVariablesDemo method");
            log.info("request multi path variables value, profile: {}, name: {}", profile, name);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            studentService.requestMultiPathVariablesDemo(profile, name);

            log.info("Exit requestMultiPathVariablesDemo method");
//            return ResponseEntity.ok().body(dbStudent); // if need to return data as body
            return ResponseEntity.ok().build(); // return ok response without body
            // here you can return like that ->
            // return new ResponseEntity(HttpStatus.OK); or -> return new ResponseEntity(dbStudent, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/requestParamStringDemo")
    public ResponseEntity requestParamStringDemo(@RequestParam String name){

        try{
            log.info("Enter requestParamStringDemo method");
            log.info("request param value, name: {}", name);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            studentService.requestParamStringDemo(name);
            log.info("Exit requestParamStringDemo method");
//            return ResponseEntity.ok().body(dbStudentList); // if need to return data as body
            return ResponseEntity.ok().build();
            // here you can return like that ->
            // return new ResponseEntity(HttpStatus.OK); or -> return new ResponseEntity(dbStudentList, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @PutMapping("/requestMultiParamsDemo")
    public ResponseEntity requestMultiParamsDemo(@RequestParam Long id, @RequestParam String name){

        try{
            log.info("Enter requestMultiParamsDemo method");
            log.info("request params value, id: {}, name: {}", id, name);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            studentService.requestMultiParamsDemo(id, name);
            log.info("Exit requestMultiParamsDemo method");
//            return ResponseEntity.ok().body(dbStudentList); // if need to return data as body
            return ResponseEntity.ok().build();
            // here you can return like that ->
            // return new ResponseEntity(HttpStatus.OK); or -> return new ResponseEntity(dbStudentList, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/requestPathVariableAndParamsDemo/{accountName}")
    public ResponseEntity requestPathVariableAndParamsDemo(@PathVariable String accountName,
                                                           @RequestParam String actionType){

        try{
            log.info("Enter requestPathVariableAndParamsDemo method");
            log.info("request values, accountName: {}, actionType: {}", accountName, actionType);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            studentService.requestPathVariableAndParamsDemo(accountName, actionType);
            log.info("Exit requestPathVariableAndParamsDemo method");
//            return ResponseEntity.ok().body(dbStudentList); // if need to return data as body
            return ResponseEntity.ok().build();
            // here you can return like that ->
            // return new ResponseEntity(HttpStatus.OK); or -> return new ResponseEntity(dbStudentList, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/requestFromHeaderDemo")
    public ResponseEntity requestFromHeaderDemo(@RequestHeader Map<String, String> allHeadersMap){

        try{
            log.info("Enter requestFromHeaderDemo method");
            // you can test adding Username and Password in Basic Auth in Authorization tab of Postman
            log.info("request headers value, headers: {}", allHeadersMap); // you can check in console log for authorization in headers

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            studentService.requestFromHeaderDemo(allHeadersMap);

            log.info("Exit requestFromHeaderDemo method");
//            return ResponseEntity.ok().body(dbStudentList); // if need to return data as body
            return ResponseEntity.ok().build();
            // here you can return like that ->
            // return new ResponseEntity(HttpStatus.OK); or -> return new ResponseEntity(dbStudentList, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/requestFromHeaderAndRequestParamDemo")
    public ResponseEntity requestFromHeaderAndRequestParamDemo(@RequestHeader Map<String, String> allHeadersMap,
                                                               @RequestParam String name){
        try{
            log.info("Enter requestFromHeaderAndRequestParamDemo method");
            log.info("request headers value, headers: {}", allHeadersMap); // you can see headers in console logs and this api is for adding token inside header.
            log.info("request param value, name {}", name);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            studentService.requestFromHeaderAndRequestParamDemo(allHeadersMap, name);

            log.info("Exit requestFromHeaderAndRequestParamDemo method");
//            return ResponseEntity.ok().body(dbStudentList); // if need to return data as body
            return ResponseEntity.ok().build();
            // here you can return like that ->
            // return new ResponseEntity(HttpStatus.OK); or -> return new ResponseEntity(dbStudentList, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @PostMapping("/requestFromHeaderAndRequestBodyDemo")
    public ResponseEntity requestFromHeaderAndRequestBodyDemo(@RequestHeader Map<String, String> allHeadersMap,
                                                               @RequestBody Student student){

        try{
            log.info("Enter requestFromHeaderAndRequestBodyDemo method");
            log.info("request headers value, headers: {}", allHeadersMap);
            log.info("request body data, student: {}", student);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            studentService.requestFromHeaderAndRequestBodyDemo(allHeadersMap, student);

            log.info("Exit requestFromHeaderAndRequestBodyDemo method");
//            return ResponseEntity.ok().body(dbStudent); // if need to return data as body
            return ResponseEntity.ok().build();
            // here you can return like that ->
            // return new ResponseEntity(HttpStatus.OK); or -> return new ResponseEntity(dbStudent, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping("/requestFileUploadDemo")
    // single file upload
    public ResponseEntity<Object> requestFileUpload(@RequestParam("file") MultipartFile multipartFile){

        try{
            log.info("Enter requestFileUploadDemo method");

            if(multipartFile!=null && !multipartFile.getOriginalFilename().trim().equals("")) {

                log.info("request file name: {}", multipartFile.getOriginalFilename());
                log.info("request file content type: {}", multipartFile.getContentType());

                File file = new File(multipartFile.getOriginalFilename());
                file.createNewFile();
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(multipartFile.getBytes());
                fos.close();

                studentService.requestFileUploadDemo(file, multipartFile.getOriginalFilename());
            }else {
                log.warn("File is empty");
                // you can return error in here.
            }

            log.info("Exit requestFileUploadDemo method");
//            return ResponseEntity.ok().body(dbStudent); // if need to return data as body
            return ResponseEntity.ok().build();
            // here you can return like that ->
            // return new ResponseEntity(HttpStatus.OK); or -> return new ResponseEntity(dbStudent, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @PostMapping("/requestFromHeaderAndBulkFileUploadDemo")
    // request multiple files
    public ResponseEntity<Object> requestFromHeaderAndBulkFileUploadDemo(@RequestHeader Map<String, String> allHeadersMap,
                                                                     @RequestParam("files") List<MultipartFile> files){

        try{
            log.info("Enter requestFromHeaderAndBulkFileUploadDemo method");
            log.info("request headers value, headers: {}", allHeadersMap);

            if(files!=null && !files.isEmpty()) {

                for (MultipartFile file : files) {

                    log.info("request file name: {}", file.getOriginalFilename());
                    log.info("request file name: {}", file.getContentType());
                }

                studentService.requestFromHeaderAndBulkFileUploadDemo(files);

            }else {
                log.warn("File is empty");
                // you can return error in here.
            }

            log.info("Exit requestFromHeaderAndBulkFileUploadDemo method");
//            return ResponseEntity.ok().body(dbStudent); // if need to return data as body
            return ResponseEntity.ok().build();
            // here you can return like that ->
            // return new ResponseEntity(HttpStatus.OK); or -> return new ResponseEntity(dbStudent, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/requestPathVariableAndResponseObjectDemo/{action}")
    public ResponseEntity requestPathVariableAndResponseObjectDemo(@PathVariable String action){

        try{
            log.info("Enter requestPathVariableAndResponseObjectDemo method");
            log.info("request path variable value, action type: {}", action);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            Student dbStudent = studentService.requestPathVariableAndResponseObjectDemo(action);
            log.info("Response data: {}", dbStudent);

            log.info("Exit requestPathVariableAndResponseObjectDemo method");
            return ResponseEntity.ok().body(dbStudent);
            // here you can return like that ->
            // return new ResponseEntity(dbStudent, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/requestParamStringAndResponseObjectListDemo")
    public ResponseEntity requestParamStringAndResponseObjectListDemo(@RequestParam String name, @RequestParam String phone){

        try{
            log.info("Enter requestParamStringAndResponseObjectListDemo method");
            log.info("request param value, name: {}, phone: {}", name, phone);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            List<Student> dbStudentList = studentService.requestParamStringAndResponseObjectListDemo(name, phone);
            log.info("Response data: {}", dbStudentList);

            log.info("Exit requestParamStringAndResponseObjectListDemo method");
            return ResponseEntity.ok().body(dbStudentList);
            // here you can return like that ->
            // return new ResponseEntity(dbStudentList, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @PostMapping("/requestFromHeaderAndRequestBodyAndResponseNestedObjectDemo")
    public ResponseEntity requestFromHeaderAndRequestBodyAndResponseNestedObjectDemo(@RequestHeader Map<String, String> allHeadersMap,
                                                                                     @RequestBody Student student){

        try{
            log.info("Enter requestFromHeaderAndRequestBodyAndResponseNestedObjectDemo method");
            log.info("request headers value, headers: {}", allHeadersMap);
            log.info("request body value, student: {}", student);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            ResponseObject responseObject = studentService.requestFromHeaderAndRequestBodyAndResponseNestedObjectDemo(allHeadersMap, student);
            log.info("Response data: {}", responseObject);

            log.info("Exit requestFromHeaderAndRequestBodyAndResponseNestedObjectDemo method");
            return ResponseEntity.ok().body(responseObject);
            // here you can return like that ->
            // return new ResponseEntity(responseObject, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/requestFromHeaderAndRequestParamStringAndResponseNestedObjectListDemo")
    public ResponseEntity requestFromHeaderAndRequestParamStringAndResponseNestedObjectListDemo(@RequestHeader Map<String, String> allHeadersMap,
                                                                                                @RequestParam String name, @RequestParam String phone){

        try{
            log.info("Enter requestFromHeaderAndRequestParamStringAndResponseNestedObjectListDemo method");
            log.info("request headers value, headers: {}", allHeadersMap);
            log.info("request param value, name: {}, phone: {}", name, phone);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            ResponseObjectList responseObjectList = studentService.requestFromHeaderAndRequestParamStringAndResponseNestedObjectListDemo(allHeadersMap, name, phone);
            log.info("Response data: {}", responseObjectList);

            log.info("Exit requestFromHeaderAndRequestParamStringAndResponseNestedObjectListDemo method");
            return ResponseEntity.ok().body(responseObjectList);
            // here you can return like that ->
            // return new ResponseEntity(responseObjectList, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/requestFromHeaderAndPathVarAndParamsAndResponseNestedObjectListDemo/accountName/{accountName}/cardType/{cardType}")
    public ResponseEntity requestFromHeaderAndPathVarAndParamsAndResponseNestedObjectListDemo(@RequestHeader Map<String, String> allHeadersMap,
                                                           @PathVariable String accountName,
                                                           @PathVariable String cardType,
                                                           @RequestParam(defaultValue = "0") Integer pageNo, // set default value
                                                           @RequestParam(defaultValue = "10") Integer pageSize, // set default value
                                                           @RequestParam(defaultValue = "id") String sortBy, // set default value
                                                           @RequestParam String actionType){

        try{
            log.info("Enter requestFromHeaderAndPathVarAndParamsAndResponseNestedObjectListDemo method");
            log.info("request headers value, headers: {}", allHeadersMap);
            log.info("request path variable value, accountName: {}, cardType: {}", accountName, cardType);
            log.info("request param values, pageNo: {}, pageSize: {}, sortBy: {}, actionType: {}", pageNo, pageSize, sortBy, actionType);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            ResponseObjectList responseObjectList =  studentService.requestFromHeaderAndPathVarAndParamsAndResponseNestedObjectListDemo(allHeadersMap, accountName, cardType, pageNo, pageSize, sortBy, actionType);
            log.info("Response data: {}", responseObjectList);

            log.info("Exit requestFromHeaderAndPathVarAndParamsAndResponseNestedObjectListDemo method");
            return ResponseEntity.ok().body(responseObjectList);
            // here you can return like that ->
            // return new ResponseEntity(responseObjectList, HttpStatus.OK);


        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/errorBadRequestResponseDemo")
    public ResponseEntity errorBadRequestResponseDemo(@RequestParam String name, @RequestParam String phone){

        try{
            log.info("Enter errorBadRequestResponseDemo method");
            log.info("request param value, name: {}, phone: {}", name, phone);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            ResponseObjectList responseObjectList = studentService.errorBadRequestResponseDemo(name, phone);
            log.info("Response data: {}", responseObjectList);


            // you can check with status like below code in your real application
            /*if(responseObjectList.getStatus().getStatus().equals("FAIL")){ // you can declare fail as constant variable

            }*/

            log.info("Exit errorBadRequestResponseDemo method");
            return ResponseEntity.badRequest().body(responseObjectList);
            // here you can return like that ->
//             return new ResponseEntity(responseObjectList, HttpStatus.BAD_REQUEST);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @GetMapping("/errorNotFoundResponseDemo/{id}")
    public ResponseEntity errorNotFoundResponseDemo(@PathVariable Integer id){

        try{
            log.info("Enter errorNotFoundResponseDemo method");
            log.info("request param value, id: {}", id);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            ResponseObjectList responseObjectList = studentService.errorNotFoundResponseDemo(id);
            log.info("Response data: {}", responseObjectList);


            // you can check with status like below code in your real application
            /*if(responseObjectList.getStatus().getStatus().equals("FAIL")){ // you can declare fail as constant variable

            }*/

            log.info("Exit errorNotFoundResponseDemo method");
//            return ResponseEntity.notFound().build();
            // above notFount().build() can't add response body data and so, I return like below.
             return new ResponseEntity(responseObjectList,HttpStatus.NOT_FOUND);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


    @PostMapping("/errorInternalServerErrorResponseDemo")
    public ResponseEntity errorInternalServerErrorResponseDemo(@RequestBody Student student){

        try{
            log.info("Enter errorInternalServerErrorResponseDemo method");
            log.info("request param value, student: {}", student);

            // here you can do some validation logic like checking input data is null or etc.. and return bad request error.
            // this is demo project and so, I don't do any logic here.

            ResponseObjectList responseObjectList = studentService.errorInternalServerErrorResponseDemo(student);
            log.info("Response data: {}", responseObjectList);


            // you can check with status like below code in your real application
            /*if(responseObjectList.getStatus().getStatus().equals("FAIL")){ // you can declare fail as constant variable

            }*/

            log.info("Exit errorInternalServerErrorResponseDemo method");
            return ResponseEntity.internalServerError().build();
            // here you can return like that ->
//             return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);

        }catch(Exception e){
            e.printStackTrace();
            log.error("error: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }


}
