package AndroidFramework;

 class View {
    public class Button {
        int hieght;
        int width;
        String id;

        class ImageButton extends Button {
            String src;
        }
    }
    public class TextView{
        int hieght;
        int width;
        public class EditText extends TextView{
            String id;
        }
    }

    interface onClickListener {
        void onClick(View v);
    }

    public static void setOnclickListener() {
        System.out.println("set event listener");
    }
}

public class Example1 {

    public static void main(String[] args) {
        View view1=new View();
        View.Button button=view1.new Button();

        View.onClickListener view = new View.onClickListener() { // this is  Anonymous class implementation
            @Override
            public void onClick(View v) {
                // implement main logic as you want
            }
        };


    }
}
