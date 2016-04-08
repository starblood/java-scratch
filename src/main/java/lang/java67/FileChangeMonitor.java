package lang.java67;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.WatchEvent.Kind;

import static java.nio.file.StandardWatchEventKinds.*;

public class FileChangeMonitor {
    private Path path = null;
    private WatchService watchService = null;

    public FileChangeMonitor() {
        path = Paths.get("/tmp");
        try {
            // WatchService 를 생성
            watchService = FileSystems.getDefault().newWatchService();
            // 감시하고자 하는 path 를 WatchService 에 등록 (생성/삭제/수정) 이벤트
            path.register(watchService, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
        } catch (IOException e) {
            System.out.println("IOException"+ e.getMessage());
        }
    }

    private void watch() {
        WatchKey key = null;
        while(true) {
            try {
                // watchService queue 에 등록된 event 를 받아옴
                key = watchService.take();
                for (WatchEvent<?> event : key.pollEvents()) {
                    Kind<?> kind = event.kind();
                    // 받아온 key 를 사용하여 event 처리
                    System.out.println("Event on " + event.context().toString() + " is " + kind);
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException: "+e.getMessage());
            }
            boolean reset = key.reset();
            if(!reset)
                break;
        }
    }

    public static void main(String[] args) {
        FileChangeMonitor monitor = new FileChangeMonitor();
        monitor.watch();
    }
}
