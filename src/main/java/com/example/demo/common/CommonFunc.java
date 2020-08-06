package com.example.demo.common;

public class CommonFunc {
    public static String convertDoubleToString4(Double value) {
        try {
            if (value == null) {
                return "";
            }
            String result = String.format("%.4f", value);
            if (result.endsWith(".0000")) {
                result = result.replace(".0000", "");
            }
            if (result.endsWith(".000")) {
                result = result.replace(".000", "");
            }
            if (result.endsWith(".00")) {
                result = result.replace(".00", "");
            }
            if (result.endsWith(".0")) {
                result = result.replace(".0", "");
            }
            if(result.contains(".")){
                if (result.endsWith("0")){
                    result=result.substring(0,result.length()-1);
                }
            }
            return result;
        } catch (Exception ex) {

        }
        return "";
    }
    public static String convertDoubleToString3(Double value) {
        try {
            if (value == null) {
                return "";
            }
            String result = String.format("%.3f", value);
            if (result.endsWith(".000")) {
                result = result.replace(".000", "");
            }
            if (result.endsWith(".00")) {
                result = result.replace(".00", "");
            }
            if (result.endsWith(".0")) {
                result = result.replace(".0", "");
            }
            if(result.contains(".")){
                if (result.endsWith("0")){
                    result=result.substring(0,result.length()-1);
                }
            }
            return result;
        } catch (Exception ex) {

        }
        return "";
    }
    public static String convertDoubleToString(Double value) {
        try {
            if (value == null) {
                return "";
            }
            String result = String.format("%.2f", value);
            if (result.endsWith(".00")) {
                result = result.replace(".00", "");
            }
            if (result.endsWith(".0")) {
                result = result.replace(".0", "");
            }
            if(result.contains(".")){
                if (result.endsWith("0")){
                    result=result.substring(0,result.length()-1);
                }
            }
            return result;
        } catch (Exception ex) {

        }
        return "";
    }

    public static String convertDoubleToString(String value) {
        return value;
    }
}
