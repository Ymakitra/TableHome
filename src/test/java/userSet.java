import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by YuriyMakitra on 21.10.2016.
 */
public class userSet {
    public final static String url = "http://user.test.table.relevant.software";
    public final static String userLoginUrl = url + "/v1/login";
    public final static String userLogoutUrl = url + "/v1/logout";
    public final static String userPasswordResetRequestUrl = url + "/v1/password-reset-request";
    public final static String userPasswordResetUrl = url + "/v1/password-reset";

    public static String getUserLoginUrl() {
        return userLoginUrl;
    }

    public static String getUserLogoutUrl() {
        return userLogoutUrl;
    }

    public static String getUserPasswordResetRequestUrl() {
        return userPasswordResetRequestUrl;
    }


    static String userToken;

    public static String userLogin() {
        Response userLoginResp = given().
                that().
                parameter("email", "ymakitra@gmail.com").
                parameter("password", "qwertyui1").
                when().
                post(userSet.userLoginUrl).
                then().
                statusCode(200).
                extract().
                response();

//        PRINT RESPONSE
//        System.out.println("RESPONSE: ");
//        userLoginResp.prettyPrint();

//        GET TOKEN FROM RESPONSE
        userToken = "Bearer "+ userLoginResp.path("data.access_token");
        System.out.println("USER TOKEN = " + userToken);
        return userToken;
    }
}
