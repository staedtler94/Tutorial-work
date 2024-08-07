package general;

enum Protocols {
    HTTP,
    FTP,
    HTTPS
}

enum WebsiteExtensions {
    COM,
    GOV,
    ORG,
    NET
}

public class WebsiteRecogniser {

    public String getProtocol(String str){
        String[] protocol = str.split("://");

        switch (protocol[0]) {
            case "http":
                return Protocols.HTTP.name();
            case "https":
                return Protocols.HTTPS.name();
            case "FTP":
                return Protocols.FTP.name();
            default:
                return "UnSupported protocol";
        }
    }

    public String getExtension(String str){
        String ext = str.substring(str.lastIndexOf(".")+1);

        switch (ext){
            case "com":
                return WebsiteExtensions.COM.name();
            case "net":
                return WebsiteExtensions.NET.name();
            case "org":
                return WebsiteExtensions.ORG.name();
            case "gov":
                return WebsiteExtensions.GOV.name();
            default:
                return "Unknown Extension";
        }

    }
}
