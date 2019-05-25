package com.x.s.model.common;

import java.io.Serializable;

/**
 * @author x.s
 */
public class Upload implements Serializable {

    private Integer multi;

    private String fileType;

    private Integer maxSize;

    private String fileExt;

    public Integer getMulti() {
        return multi;
    }

    public void setMulti(Integer multi) {
        this.multi = multi;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }
}
