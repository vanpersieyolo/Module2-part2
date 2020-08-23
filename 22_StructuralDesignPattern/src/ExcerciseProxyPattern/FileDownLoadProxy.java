package ExcerciseProxyPattern;

import java.io.File;
import java.util.ArrayList;

public class FileDownLoadProxy implements IDownLoad {
    private FlieDownLoader f;
    public FileDownLoadProxy(){
        this.f = new FlieDownLoader();
    }
    @Override
    public void download(String urlConnect, String url, ArrayList<File> arr) {
    f.download(urlConnect,url,arr);
    }
}
