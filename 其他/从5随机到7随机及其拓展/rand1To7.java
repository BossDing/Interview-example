public class rand1To7{

    //给我们一个等概率的产生1-5的随机函数，
    public static void main(String[] args){

        public int rand1To5(){
            return (int)(Math.random()*5)+1;
        }

        public int rand1To7(){
            int num=0;
            do{
                num=(rand1To5()-1)*5+rand1To5()-1;
            }while(num>20);
            return num%7+1;
        }

        System.out.print(rand1To7);
    }
}