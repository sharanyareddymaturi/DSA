// class Solution {
//     public int calPoints(String[] operations) {
//         Stack<Integer> stack=new Stack<>();
//         for(String op:operations){
//             switch(op){
//                 case "C":stack.pop();
//                 break;
//                 case"D":stack.push(2*stack.peek());
//                 break;
//                 case "+":int top=stack.pop();
//                 int newTop=top+stack.peek();
//                 stack.push(top);
//                 stack.push(newTop);
//                 break;
//                 default:
//                 stack.push(Integer.parseInt(op));
//             }

//         }
//         int total=0;
//         for(int score:stack){
//             total+=score;
//         }
//         return total;
//     }
// }

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(String op:operations){
            if(op.equals("C")){
                arr.remove((arr.size()-1));
            }
            else if(op.equals("D")){
                int last=arr.get(arr.size()-1);
                arr.add(2*last);
            }
            else if(op.equals("+")){
                int last=arr.get(arr.size()-1);
                int secLat=arr.get(arr.size()-2);
                int temp=last+secLat;
                arr.add(temp);
            }
            else{
                arr.add(Integer.parseInt(op));
            }
        }
        int total=0;
        for(int score:arr){
            total+=score;
        }
        return total;

    }
}

