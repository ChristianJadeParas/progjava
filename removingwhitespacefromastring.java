class BlankSpace {
    public static void main(String[] args)
    {
        String str = "     Coffee     Gaming  by Christian Jade Paras     ";
       
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
       
        System.out.println(str);
    }
}