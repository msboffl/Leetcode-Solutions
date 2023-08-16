class Solution {
    public int calPoints(String[] ops) {
        int ans = 0;                                  
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<ops.length;i++){
    
            if(ops[i].equals("+")){
                int sum = list.get(list.size()-1)+list.get(list.size()-2);
                list.add(sum);
            }
            else if(ops[i].equals("D")){
                int prod = 2*list.get(list.size()-1);
                list.add(prod);
            }
            else if(ops[i].equals("C")){
                list.remove(list.size()-1);
            }
            else{
                int t = Integer.parseInt(ops[i]);
                list.add(t);
            }
        }
        for(int i=0;i<list.size();i++){
            ans +=list.get(i);
        }
        return ans;
    }
}
