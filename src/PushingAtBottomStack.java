import java.util.Stack;

public class PushingAtBottomStack {




    public static void pushingAtBottomStack(Stack<Integer> st, int x){

            if(st.isEmpty()){
                st.push(x);
                return;
            }
            int storage = st.pop();
            pushingAtBottomStack(st, x);

            st.push(storage);
        }


    public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            stack.push(1);
            stack.push(2);
            stack.push(3);

            while(!stack.isEmpty()){
                System.out.println(stack.peek());
                stack.pop();
            }

            pushingAtBottomStack(stack, 0);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        }
        }


