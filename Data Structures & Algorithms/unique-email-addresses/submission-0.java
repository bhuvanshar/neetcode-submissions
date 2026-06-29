class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String>unique = new HashSet<>();
        for(String s : emails){
            String [] arr = s.split("@");
            String local = arr[0];
            String domain = arr[1];

            local = local.split("\\+")[0];
            local = local.replace(".", "");
            unique.add(local + "@" + domain);
        }
        return unique.size();
    }
}