public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        String s="WNEENESENNN";
        double disp=sortestDistance(s);
        System.out.println(disp);
    }

    public static double sortestDistance(String s){
        int x=0;
        int y=0;


        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='S'){
                y--;
            }
            else if(ch=='N'){
                y++;
            }
            else if(ch=='E'){
                x++;
            }
            else {
                x--;
            }


        }
        int X2=x*x;
        int Y2=y*y;
        return Math.sqrt(X2+Y2);
    }
}