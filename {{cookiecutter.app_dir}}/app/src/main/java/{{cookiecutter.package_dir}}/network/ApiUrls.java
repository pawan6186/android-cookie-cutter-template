package {{cookiecutter.package_dir.replace('/','.')}}.network;

public class ApiUrls {
    public static final String FACTS_URL = "facts.json";

    public static String getBaseUrl(){
        return "https://dl.dropboxusercontent.com/s/2iodh4vg0eortkl/";
    }
}
