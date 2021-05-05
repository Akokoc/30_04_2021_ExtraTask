import java.util.ArrayList;
import java.util.List;

public class Points {
    public static void main(String[] args) {
        List<Integer> points = new ArrayList<>();
        points.add(4);
        points.add(1);
        points.add(5);
//        System.out.println(points);
        List<Cut> cuts = new ArrayList<>();
        cuts.add(new Cut(2,4));
        cuts.add(new Cut(3,5));
//        System.out.println(cuts);
        System.out.println(getMaxCoveredPoint(points,cuts));





    }

    public static int getMaxCoveredPoint(List<Integer> points, List<Cut> cuts) {
        int maxPoint=-1;//If I have no points I will retern -1
        int maxRes=0;
        for (int i = 0; i < points.size(); i++) {
            int res=0;
            for(int j=0; j< cuts.size();j++){
                if(points.get(i) >= cuts.get(j).getLeftEnd() && points.get(i)<=cuts.get(j).getRightEnd()){
                    res+=1;
                }
            }
            if(res>maxRes){
                maxRes=res;
                maxPoint=points.get(i);
            }
        }
        return maxPoint;
    }

}
