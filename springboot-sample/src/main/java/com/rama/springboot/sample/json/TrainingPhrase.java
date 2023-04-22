package com.rama.springboot.sample.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class TrainingPhrase {
    private List<Part> parts = new ArrayList<Part>();
    private Integer repeatCount;
    private String languageCode;
    public List<Part> getParts() {
        return parts;
    }
    public void setParts(List<Part> parts) {
        this.parts = parts;
    }
    public Integer getRepeatCount() {
        return repeatCount;
    }
    public void setRepeatCount(Integer repeatCount) {
        this.repeatCount = repeatCount;
    }
    public String getLanguageCode() {
        return languageCode;
    }
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }
}