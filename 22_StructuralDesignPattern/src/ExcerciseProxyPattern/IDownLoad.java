package ExcerciseProxyPattern;

import java.io.File;
import java.util.ArrayList;

public interface IDownLoad {
    void download(String urlConnect,String url, ArrayList<File> arr);
}
