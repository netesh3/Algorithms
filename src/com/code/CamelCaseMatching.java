package com.code;

import java.util.ArrayList;
import java.util.List;

public class CamelCaseMatching {
    public static void main(String[] args) {
//        String []queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
//        String pattern = "FB";
//        String []queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
//        String pattern = "FoBa";
        String []queries = {"CompetitiveProgramming","CounterPick","ControlPanel"};
        String pattern = "CooP";
        List<Boolean> res  = camelMatch(queries,pattern);
        System.out.println(res);
    }
    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<String> pat = patternSplit(pattern);
        List<Boolean> res = new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            List<String> list = new ArrayList<>();
            String str = queries[i];
            int j=1;
            String temp=String.valueOf(str.charAt(0));
            while(j<str.length()){
                if(str.charAt(j)>=65 && str.charAt(j)<=91){
                    list.add(temp);
                    temp="";
                    temp=String.valueOf(str.charAt(j));
                }else{
                    temp+=str.charAt(j);
                }
                j++;
            }
            list.add(temp);
            System.out.println(list);
            if(list.size()!=pat.size()){
                res.add(false);
            }else {
                boolean isEntered = false;
                for (int k = 0; k < list.size(); k++) {
                    if (!list.get(k).startsWith(pat.get(k))) {
                        isEntered = true;
                    }
                }
                if(isEntered){
                    res.add(false);
                }else {
                    res.add(true);
                }
            }
        }
        return res;
    }

    private static List<String> patternSplit(String str) {
        String newPattern = "[a-z]*" + String.join("[a-z]*", str.split("")) + "[a-z]*";
        System.out.println(newPattern);
        List<String> list = new ArrayList<>();
        int j=1;
        String temp=String.valueOf(str.charAt(0));
        while(j<str.length()){
            if(str.charAt(j)>=65 && str.charAt(j)<=91){
                list.add(temp);
                temp="";
                temp=String.valueOf(str.charAt(j));
            }else{
                temp+=str.charAt(j);
            }
            j++;
        }
        list.add(temp);
        System.out.println(list);
        return list;
    }
}

