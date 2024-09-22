class Solution {
    public String validIPAddress(String s) {
        if(s.contains(".")){
            String arr[]=s.split("\\.");
            if(arr.length!=4) return "Neither";
            if(s.charAt(s.length()-1)=='.') return "Neither";
            for(String i:arr){
                if(i.length()==0 ) return "Neither";
                if(i.charAt(0)=='0' && i.length()>1) return "Neither";
                String a="1234567890";
                for(int j:i.toCharArray()){
                    if(a.indexOf(j)==-1){
                        return "Neither";
                    }
                }
                try {
                    int num = Integer.parseInt(i);
                    if (num < 0 || num > 255) return "Neither";
                } catch (NumberFormatException e) {
                    return "Neither"; // Catch invalid integer parsing
                }
            }
            return "IPv4";
        }
        else if(s.contains(":")){
            String arr[]=s.split(":");
           // System.out.println(arr.length);
            if(arr.length!=8) return "Neither";
            if(s.charAt(s.length()-1)==':') return "Neither";
            for(String i:arr){
                if(i.length()==0 || i.length()>4) return "Neither";
                String a="1234567890abcdefABCDEF";
                for(int j:i.toCharArray()){
                    if(a.indexOf(j)==-1){
                        return "Neither";
                    }
                }
            }
            return "IPv6";
        }
        return "Neither";
    }
}