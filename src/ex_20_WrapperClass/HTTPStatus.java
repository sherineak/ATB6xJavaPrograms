package ex_20_WrapperClass;

public class HTTPStatus {
    public static void main(String[] args) {
        HttpStatusCode status = HttpStatusCode.OK;
        System.out.println(status.getCode()+" - " + status.getMessage());
    }

}

enum HttpStatusCode{
    OK(200,"Ok"),
    CREATED(201,"Created"),
    ACCEPTED(202,"Accepted"),
    Bad_Request(400,"Bad Request"),
    UN_Authorized(401,"UnAutorized"),
    FORBIDDEN(403,"Forbidden"),
    NOT_FOUND(404,"Page NOT found"),
    INTERNAL_SERVER_ERROR(500,"Internal Server ERROR");

    private int code;
    private String message;

    HttpStatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
