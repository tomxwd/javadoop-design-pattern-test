package top.tomxwd.test.adapter.default1;

import java.io.File;

/**
 * 默认适配器
 * 由于FileAlterationListener需要实现的方法太多了，我们实际只想要后面的子类实现部分功能，所以在这里实现空方法，子类覆写即可
 * @author xwd
 */
public class FileAlterationListenerAdaptor implements FileAlterationListener{
    @Override
    public void onStart(FileAlterationObserver observer) {

    }

    @Override
    public void onDirectoryCreate(File directory) {

    }

    @Override
    public void onDirectoryChange(File directory) {

    }

    @Override
    public void onDirectoryDelete(File directory) {

    }

    @Override
    public void onFileCreate(File file) {

    }

    @Override
    public void onFileChange(File file) {

    }

    @Override
    public void onFileDelete(File file) {

    }

    @Override
    public void onStop(FileAlterationObserver observer) {

    }
}
