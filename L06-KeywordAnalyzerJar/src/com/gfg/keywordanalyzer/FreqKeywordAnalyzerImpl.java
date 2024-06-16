package com.gfg.keywordanalyzer;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FreqKeywordAnalyzerImpl implements KeywordAnalyzerInterface {

    //private Map<String,Integer> dataSore = new HashMap<>();
    private Map<String,Integer> dataSore = new TreeMap<>();

    @Override
    public void recordKeyword(String keyword) {
        //dataSore.put(keyword,dataSore.get(keyword)!=null?dataSore.get(keyword)+1:1);
        if(dataSore.keySet().contains(keyword)){
            dataSore.put(keyword,dataSore.get(keyword)+1);
        }
        else{
            dataSore.put(keyword,1);
        }
    }

    @Override
    public List<String> getKeywords() {
        return dataSore.keySet().stream().toList();
    }

    @Override
    public Map<String, Integer> getKeywordWithFreq() {
        return dataSore;
    }
}
