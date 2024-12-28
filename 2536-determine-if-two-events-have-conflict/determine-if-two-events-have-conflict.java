class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        String st1=event1[0];
        String end1=event1[1];
        String st2=event2[0];
        String end2=event2[1];

        return !(end1.compareTo(st2)<0 || end2.compareTo(st1)<0);

        
    }
}