class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(')
            st.push(ch);
            else{
                //if st.peeek()->(
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                    st.push('1');
                }
                else{
                    //stack top->(char) number
                    int sum=0;
                    while(!st.isEmpty() && st.peek()!='('){
                        sum+=st.pop()-'0';
                    }
                    st.pop();
                    st.push((char)(2*sum+'0'));
                }

            }
            }
            int sum=0;
            while(!st.isEmpty()){
                sum+=st.pop()-'0';
            }
            return sum;

        
    }
}