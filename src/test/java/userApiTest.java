import com.jayway.restassured.response.Response;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by YuriyMakitra on 21.10.2016.
 */
public class userApiTest {
    String userToken;

//    public String userLogin() {
//        Response userLoginResp = given().
//                that().
//                parameter("email", "ymakitr.a@gmail.com").
//                parameter("password", "qwertyui1").
//                when().
//                post(userSet.userLoginUrl).
//                then().
//                statusCode(200).
//                extract().
//                response();
//
////        PRINT RESPONSE
//        System.out.println("RESPONSE: ");
//        userLoginResp.prettyPrint();
////        GET TOKEN FROM RESPONSE
//        userToken = userLoginResp.path("data.access_token");
//        System.out.println("USER TOKEN = " + userToken);
//        return userToken;
//    }

//    @Test
//    public void userLogout() {
//        String sessinId = userSet.userLogin();
//        Response userLogoutResp = given().
//                header("access_token", ("Bearer " + sessinId)).
//                header("Content-Type", "application/json").
//                that().
////                parameter("email", "ymakitr.a@gmail.com").
////                parameter("password", "qwertyui1").
//        when().
//                        post(userSet.userLogoutUrl).
//                        then().
//                        statusCode(401).
//                        extract().
//                        response();
//
////        PRINT RESPONSE
//        System.out.println("RESPONSE: ");
//        userLogoutResp.prettyPrint();
//        System.out.println("USER TOKEN = " + sessinId);
//
//    }

    //    @Test
//    public void userResetPaswordRequest() {
//        String userSessionId = userSet.userLogin();
//        Response userLogoutResp = given().
//                contentType(String.valueOf(ContentType.JSON)).
////                header("access_token", ("Bearer " + userSessionId)).
//                header("Authorization", userSessionId).
//                contentType("application/json").
//                header("Content-Type", "application/json").
//        that().
//                        parameter("email", "ymakitra@gmail.com").
////                parameter("password", "qwertyui1").
//        when().
//                        post(userSet.userPasswordResetRequestUrl).
//                        then().
//                        assertThat().contentType(String.valueOf(ContentType.JSON)).
////                        statusCode(400).
////                        assertThat().contentType(String.valueOf(ContentType.JSON)).
//        extract().
//                        response();
//
////        PRINT RESPONSE
//        System.out.println("RESPONSE: ");
//        userLogoutResp.prettyPrint();
//        System.out.println("USER TOKEN = " + userSessionId);
    @Test
    public void userResetPaswordRequest() {
        Response userLogoutResp = given().
//                contentType(String.valueOf(ContentType.JSON)).
//                header("access_token", ("Bearer " + userSessionId)).
        header("Authorization", "Bearer TBCvv5vHf47UyN70QCsHRsdY2W42sg8a").
//                        contentType("application/json").
//                        header("Content-Type", "application/json").
                        that().
                        parameter("email", "ymakitra@gmail.com").
                        when().
                        post("http://user.test.table.relevant.software/v1/password-reset-request").
                        then().
                        assertThat().contentType(String.valueOf(ContentType.JSON)).
                        statusCode(200).

        extract().
                        response();

//        PRINT RESPONSE
        System.out.println("RESPONSE: ");
        userLogoutResp.prettyPrint();
//        System.out.println("USER TOKEN = " + userSessionId);

    }
}

