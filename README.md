# restapi-sample-receiver-service
<!-- PROJECT SHIELDS -->

<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/yewin-mm/restapi-sample-receiver-service.svg?style=for-the-badge
[contributors-url]: https://github.com/yewin-mm/restapi-sample-receiver-service/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/yewin-mm/restapi-sample-receiver-service.svg?style=for-the-badge
[forks-url]: https://github.com/yewin-mm/restapi-sample-receiver-service/network/members
[stars-shield]: https://img.shields.io/github/stars/yewin-mm/restapi-sample-receiver-service.svg?style=for-the-badge
[stars-url]: https://github.com/yewin-mm/restapi-sample-receiver-service/stargazers
[issues-shield]: https://img.shields.io/github/issues/yewin-mm/restapi-sample-receiver-service.svg?style=for-the-badge
[issues-url]: https://github.com/yewin-mm/restapi-sample-receiver-service/issues
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/ye-win-1a33a292/
[product-screenshot]: images/screenshot.png


<h1 align="center">
  Overview
  <img src="https://github.com/yewin-mm/restapi-sample-receiver-service/blob/master/github/template/images/overview/restapi_sample_receiver_service.png" /><br/>
</h1>

# restapi-sample-receiver-service
* This is the sample spring boot java project for many types of sample API endpoints.

<!-- TABLE OF CONTENTS -->
## Table of Contents
- [About The Project](#about-the-project)
    - [Built With](#built-with)
- [Getting Started](#getting-started)
    - [Before you begin](#before-you-begin)
    - [Clone Project](#clone-project)
    - [Prerequisites](#prerequisites)
    - [Instruction](#instruction)
- [Contact Me](#contact)
- [Contributing](#Contributing)


<a name="about-the-project"></a>
## ⚡️About The Project
This is the rest API receiver project for creating many types of API endpoints. <br>
This is demo project and so, I don't add any other logic like communication with db, etc.
So, you will see hard coded values in service class. <br>
You can also learn calling that many types of API endpoints from other services in here [RestAPI Sample Caller Service](https://github.com/yewin-mm/restapi-sample-caller-service/tree/master)
You can learn many types of creating API endpoints in this project.
1. Creating sample request APIs
2. Creating sample response APIs
3. Creating sample request and response APIs (this is the main point and to learn that APIs, you need to learn above step 1 and 2 first)
4. Creating sample error response APIs (this is for sample error response)

<a name="built-with"></a>
### 🪓 Built With
This project is built with
* [Java](https://www.oracle.com/au/java/technologies/javase/javase-jdk8-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)


<a name="getting-started"></a>
## 🔥 Getting Started
This project is built with java, maven and use `Project Lombok` as plugin.
So, please make sure all are installed in your machine.


<a name="before-you-begin"></a>
### 🔔 Before you begin
If you are new in Git, Github and new in Spring Boot configuration structure, <br>
You should see basic detail instructions first in here [Spring Boot Application Instruction](https://github.com/yewin-mm/spring-boot-app-instruction)<br>
If you are not good enough in basic API knowledge with Java Spring Boot, you should learn below example projects first. <br>
Click below links.
* [Spring Boot Sample CRUD Application](https://github.com/yewin-mm/spring-boot-sample-crud) (for sample CRUD application)
* [Reading Values from Properties files](https://github.com/yewin-mm/reading-properties-file-values) (for reading values from properties files)



<a name="clone-project"></a>
### 🥡 Clone Project
* Clone the repo
   ```sh
   git clone https://github.com/yewin-mm/restapi-sample-receiver-service.git


<a name="prerequisites"></a>
### 🔑 Prerequisites
Prerequisites can be found in here [Spring Boot Application Instruction](https://github.com/yewin-mm/spring-boot-app-instruction).


<a name="instruction"></a>
### 📝 Instruction
* Run the project in your IDE.

* Import `restapi-sample-receiver-service.postman_collection.json` file under project directory (see that file in project directory) into your installed Postman application.
    * Click in your Postman (top left corner) import -> file -> upload files -> {choose that json file} and open/import.
    * After that, you can see the folder which you import from file in your Postman.
* Now, you can 'Test' this project by calling API from Postman.
    * Open your imported folder in postman and inside this folder, you will see total of 4 folder and many APIs, you can test that all APIs by clicking `Send` button one by one and see the response.
    * You can also check in your IDE log for some print out values.

* After that you can see the code and check the code which you don't know. You can learn it, and you can apply in your job or study fields.

***Have Fun and Enjoy in Learning Code***


<a name="contact"></a>
## ✉️ Contact
Name - Ye Win <br> LinkedIn profile -  [Ye Win's LinkedIn](https://www.linkedin.com/in/ye-win-1a33a292/)  <br> Email Address - yewin.mmr@gmail.com

Project Link: [Rest API Sample Receiver Service](https://github.com/yewin-mm/restapi-sample-receiver-service)


<a name="contributing"></a>
## ⭐ Contributing
Contributions are what make the open source community such an amazing place to be learnt, inspire, and create. Any contributions you make are **greatly appreciated**.
<br>If you want to contribute....
1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/yourname`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeatures'`)
4. Push to the Branch (`git push -u origin feature/yourname`)
5. Open a Pull Request
