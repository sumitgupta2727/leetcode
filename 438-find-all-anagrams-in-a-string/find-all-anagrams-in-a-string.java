class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int i = 0;
        int j = p.length() - 1;

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

        for (int x = 0; x < p.length(); x++) {
            pFreq[p.charAt(x) - 'a']++;
        }

        for (int x = 0; x <= j; x++) {
            sFreq[s.charAt(x) - 'a']++;
        }

        while (j < s.length()) {

            if (Arrays.equals(pFreq, sFreq)) {
                ans.add(i);
            }

            sFreq[s.charAt(i) - 'a']--;

            i++;
            j++;

            if (j < s.length()) {
                sFreq[s.charAt(j) - 'a']++;
            }
        }

        return ans;
    }
}