public classlass demostring {
    public static void main(String[] args) {
        String str = "abscbasb";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = str.indexOf(ch, i + 1);
            if (idx == -1) {
                sb = sb.append(ch);
            }

        }
        System.out.println(sb);
    }

}
