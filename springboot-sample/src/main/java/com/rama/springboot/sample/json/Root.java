package com.rama.springboot.sample.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Root {
    private List<TrainingPhrase> trainingPhrases = new ArrayList<TrainingPhrase>();
    public List<TrainingPhrase> getTrainingPhrases() {
        return trainingPhrases;
    }
    public void setTrainingPhrases(List<TrainingPhrase> trainingPhrases) {
        this.trainingPhrases = trainingPhrases;
    }
}