package top.tomxwd.test.adapter.default1;

import lombok.extern.slf4j.Slf4j;

import java.io.File;

/**
 * @author xwd
 */
@Slf4j
public class FileMonitor extends FileAlterationListenerAdaptor {

    @Override
    public void onFileCreate(File file) {
        log.info("文件创建了");
    }

    @Override
    public void onFileDelete(File file) {
        log.info("文件删除了");
    }
}
