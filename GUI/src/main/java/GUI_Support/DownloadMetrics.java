package GUI_Support;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

public class DownloadMetrics extends Support.DownloadMetrics {
    private final int id;
    private final long start;
    private final long end;
    private File file;
    private final URL url;
    private long bytesRead;
    private boolean failed = false;
    private boolean success = false;
    private boolean stop = false;

    public DownloadMetrics(int id, long start, long end, String filename, URL url) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }

    public File getFile() {
        return file;
    }

    public URL getUrl() {
        return url;
    }

    public boolean isFailed() {
        return failed;
    }

    public void setFailed(boolean failed) {
        this.failed = failed;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isRunning() {
        return !failed && !success;
    }

    public boolean hasStopped() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public FileOutputStream getFileOutputStream() {
        FileOutputStream fos;
        try {
            file = File.createTempFile(url.toString().hashCode() + "_" + id, ".tmp");
            file.deleteOnExit();
            fos = new FileOutputStream(file);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return fos;
    }
}
