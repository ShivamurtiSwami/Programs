class Arithmetic {
    public Integer sum(Integer[] arr){
        int total =0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        return total;
    }
    public String sum(String[] arr){
        String s="";
        for(int i=0;i<arr.length;i++){
            s=s.concat(arr[i]);
        }
        return s;
    }
    
}

multi sum solution
  
